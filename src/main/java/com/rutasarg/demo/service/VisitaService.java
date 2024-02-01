package com.rutasarg.demo.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.rutasarg.demo.model.Visita;
import com.rutasarg.demo.repository.VisitaRepository;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class VisitaService implements VisitaInterface {

    private final VisitaRepository visitaRepository;
    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    public VisitaService(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }

    @Override
    public void guardarVisita(Visita visita) {
        visitaRepository.save(visita);
    }

    @Override
    public void guardarListaVisitas(List<Visita> visitas) {
        visitaRepository.saveAll(visitas);
    }

    @Override
    public void eliminarVisita(Long idVisita) {
        visitaRepository.deleteById(idVisita);
    }

    @Override
    public Visita buscarVisita(Long idVisita) {
        return visitaRepository.findById(idVisita)
                .orElseThrow();
    }

    @Override
    public List<Visita> listarVisitas(LocalDate fechaLote) {
        return visitaRepository.findByFechaLote(fechaLote);
    }

    public JsonNode guardarDatosExcel(MultipartFile archivo) {
        JsonNode jsonExcel = null;
        try {
            File directorio = new File(System.getProperty("user.dir") + "/src/main/resources/archivosTemporales");
            File archivoTemp = File.createTempFile("API-RUTAS_", ".xlsx", directorio);
            archivo.transferTo(archivoTemp);
            jsonExcel = excelToJson(archivoTemp);
            archivoTemp.delete();
            return jsonExcel;
        } catch (IOException e) {
            //TODO Agregar exception
        }
        return jsonExcel;
    }

    public JsonNode excelToJson(File file) {
        ObjectNode excelData = mapper.createObjectNode();
        FileInputStream fis = null;
        Workbook workbook = null;
        try {
            // Input Stream para leer las propiedades del archivo
            fis = new FileInputStream(file);

            String filename = file.getName().toLowerCase();
            // Solo acceptamos formato xls y xlsx
            if (filename.endsWith(".xls") || filename.endsWith(".xlsx")) {
                if (filename.endsWith(".xls")) {
                    workbook = new HSSFWorkbook(fis);
                } else {
                    workbook = new XSSFWorkbook(fis);
                }

                // Leyendo las hojas del archivo
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    Sheet sheet = workbook.getSheetAt(i);
                    String sheetName = sheet.getSheetName();

                    List<String> headers = new ArrayList<String>();
                    ArrayNode sheetData = mapper.createArrayNode();
                    // Leyendo las filas del archivo
                    for (int j = 0; j <= sheet.getLastRowNum(); j++) {
                        Row row = sheet.getRow(j);
                        if (j == 0) {
                            // Leyendo los nombres de las columnas
                            for (int k = 0; k < row.getLastCellNum(); k++) {
                                headers.add(row.getCell(k).getStringCellValue());
                            }
                        } else {
                            // Leyendo las hojas de calculo
                            ObjectNode rowData = mapper.createObjectNode();
                            for (int k = 0; k < headers.size(); k++) {
                                Cell cell = row.getCell(k);
                                String headerName = headers.get(k);
                                if (cell != null) {
                                    switch (cell.getCellType()) {
                                        case FORMULA:
                                            rowData.put(headerName, cell.getCellFormula());
                                            break;
                                        case BOOLEAN:
                                            rowData.put(headerName, cell.getBooleanCellValue());
                                            break;
                                        case NUMERIC:
                                            rowData.put(headerName, cell.getNumericCellValue());
                                            break;
                                        case BLANK:
                                            rowData.put(headerName, "");
                                            break;
                                        default:
                                            rowData.put(headerName, cell.getStringCellValue());
                                            break;
                                    }
                                } else {
                                    rowData.put(headerName, "");
                                }
                            }
                            sheetData.add(rowData);
                        }
                    }
                    excelData.set(sheetName, sheetData);
                }
                return excelData;
            } else {
                throw new IllegalArgumentException("Formato de archivo no soportado. Utilizar los formatos: xls, xlsx");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (workbook != null) {
                try {
                    workbook.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return null;
    }

}
