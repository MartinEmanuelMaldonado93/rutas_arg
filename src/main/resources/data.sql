-- Choferes
INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Juan', 'Perez', 30, '555-1234');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Maria', 'Gomez', 25, '555-5678');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Carlos', 'Rodriguez', 28, '555-9012');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Laura', 'Lopez', 35, '555-3456');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Pedro', 'Martinez', 32, '555-7890');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Ana', 'Santos', 27, '555-2345');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Fernando', 'Hernandez', 40, '555-6789');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Elena', 'Diaz', 22, '555-0123');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Alejandro', 'Garcia', 33, '555-4567');

INSERT INTO chofer (nombre, apellido, edad, telefono)
VALUES ('Silvia', 'Torres', 29, '555-8901');

-- Destinatario
INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Luis', 'Gomez', '12345678', '555-1234', 'luis@gmail.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Ana', 'Martinez', '23456789', '555-5678', 'ana@hotmail.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Carlos', 'Rodriguez', '34567890', '555-9012', 'carlos@yahoo.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Laura', 'Lopez', '45678901', '555-3456', 'laura@gmail.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Pedro', 'Diaz', '56789012', '555-7890', 'pedro@hotmail.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Elena', 'Santos', '67890123', '555-2345', 'elena@yahoo.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Fernando', 'Hernandez', '78901234', '555-6789', 'fernando@gmail.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Silvia', 'Garcia', '89012345', '555-0123', 'silvia@hotmail.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Alejandro', 'Torres', '90123456', '555-4567', 'alejandro@yahoo.com');

INSERT INTO destinatario (nombre, apellido, documento, telefono, email)
VALUES ('Marina', 'Lopez', '12345432', '555-8901', 'marina@gmail.com');

-- Remitente
INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda A', 'Calle Principal 123', '12345', 'Ciudad A', '555-1111');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda B', 'Avenida Central 456', '23456', 'Ciudad B', '555-2222');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda C', 'Plaza Mayor 789', '34567', 'Ciudad C', '555-3333');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda D', 'Calle Secundaria 321', '45678', 'Ciudad D', '555-4444');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda E', 'Paseo Peatonal 654', '56789', 'Ciudad E', '555-5555');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda F', 'Carrera Central 987', '67890', 'Ciudad F', '555-6666');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda G', 'Avenida Principal 135', '78901', 'Ciudad G', '555-7777');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda H', 'Calle Mayor 246', '89012', 'Ciudad H', '555-8888');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda I', 'Plaza Central 579', '90123', 'Ciudad I', '555-9999');

INSERT INTO remitente (nombre_tienda, direccion, codigo_postal, localidad, telefono)
VALUES ('Tienda J', 'Avenida Peatonal 246', '01234', 'Ciudad J', '555-0000');

-- Estado
INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En tránsito', 'En ruta hacia el destino', NULL);

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('Entregado', 'Entregado con éxito', '2023-11-13T14:30:00');

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En almacén', 'En espera de procesamiento', NULL);

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En tránsito', 'Próxima parada programada', NULL);

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('Entregado', 'Firma recibida', '2023-11-14T10:15:00');

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En tránsito', 'Retraso debido al clima', NULL);

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En almacén', 'Esperando proceso de clasificación', NULL);

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En tránsito', 'Ruta modificada', NULL);

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('Entregado', 'Dejado en el buzón', '2023-11-15T12:00:00');

INSERT INTO estado (tipo_estado, observacion, fecha_entrega)
VALUES ('En tránsito', 'Llegada al centro de distribución', NULL);

-- Paquetes
INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (5.2, 30.0, 20.0, 40.0, 1, '2023-11-13T10:30:00', 'PKG123', 1, 1, 1);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (3.7, 25.0, 15.0, 35.0, 2, '2023-11-14T12:45:00', 'PKG456', 2, 2, 1);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (7.5, 40.0, 25.0, 50.0, 1, '2023-11-15T14:20:00', 'PKG789', 3, 3, 2);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (2.0, 20.0, 10.0, 30.0, 3, '2023-11-16T16:10:00', 'PKG101', 4, 4, 3);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (4.8, 35.0, 22.0, 45.0, 2, '2023-11-17T18:00:00', 'PKG202', 5, 5, 2);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (6.3, 28.0, 18.0, 38.0, 1, '2023-11-18T20:15:00', 'PKG303', 6, 6, 1);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (3.5, 22.0, 12.0, 32.0, 3, '2023-11-19T22:30:00', 'PKG404', 7, 7, 3);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (5.9, 33.0, 21.0, 42.0, 2, '2023-11-20T09:45:00', 'PKG505', 8, 8, 2);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (4.0, 26.0, 16.0, 36.0, 1, '2023-11-21T11:20:00', 'PKG606', 9, 9, 1);

INSERT INTO paquete (peso, ancho, alto, largo, items, fecha_ingreso, codigo, remitente_id, destinatario_id, estado_id)
VALUES (7.2, 38.0, 24.0, 48.0, 2, '2023-11-22T13:00:00', 'PKG707', 10, 10, 3);

-- Direccion
INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Av. Principal', '123', '1', 'A', '1234', 'Edificio Azul', 'Ciudad A');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Calle Central', '456', '2', 'B', '5678', 'Frente al parque', 'Ciudad B');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Ruta Mayor', '789', NULL, NULL, '9012', 'Cerca del mercado', 'Ciudad C');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Calle Secundaria', '101', '3', 'C', '3456', 'Conjunto Residencial', 'Ciudad D');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Paseo Peatonal', '202', NULL, NULL, '7890', 'Al lado del cine', 'Ciudad E');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Carrera Central', '303', '4', 'D', '2345', 'Zona Comercial', 'Ciudad F');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Av. Principal', '404', NULL, NULL, '6789', 'Frente al parque', 'Ciudad G');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Calle Mayor', '505', '5', 'E', '0123', 'Cerca del centro', 'Ciudad H');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Plaza Central', '606', NULL, NULL, '4567', 'Zona Histórica', 'Ciudad I');

INSERT INTO direccion (calle, altura, piso, departamento, codigo_postal, comentario, localidad)
VALUES ('Avenida Peatonal', '707', '6', 'F', '8901', 'Frente al teatro', 'Ciudad J');

-- Direccion y Paquete
INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (1, 1);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (2, 2);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (3, 3);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (4, 4);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (5, 5);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (6, 6);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (7, 7);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (8, 8);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (9, 9);

INSERT INTO direccion_paquete (direccion_id_direccion, paquete_id_paquete)
VALUES (10, 10);

-- Recorrido y Direccion
INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (1, 1);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (1, 2);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (2, 3);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (2, 4);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (3, 5);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (3, 6);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (4, 7);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (4, 8);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (5, 9);

INSERT INTO recorrido_direccion (recorrido_id_recorrido, direccion_id_direccion)
VALUES (5, 10);

-- Recorrido
INSERT INTO recorrido (chofer_id_chofer)
VALUES (1);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (2);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (3);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (4);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (5);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (6);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (7);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (8);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (9);

INSERT INTO recorrido (chofer_id_chofer)
VALUES (10);
