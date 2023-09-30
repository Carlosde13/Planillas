CREATE TABLE empresa (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR(50) unique
);

CREATE TABLE persona (
    cui VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(50)
);

CREATE TABLE estado(
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    descripcion varchar(20)
);

CREATE TABLE trabajador (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    persona_cui VARCHAR(50),
    estado_id number,
    
    FOREIGN KEY (persona_cui) REFERENCES persona(cui),
    FOREIGN KEY (estado_id) REFERENCES estado(id)
);

CREATE TABLE planilla(
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    anio NUMBER,
    mes NUMBER,
    empresa_id NUMBER,
    
    FOREIGN KEY (empresa_id) REFERENCES empresa (id)
);

CREATE TABLE planilla_trabajador(
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    planilla_id number,
    trabajador_id number,
    sueldo number (8,2),
    estado_id number,
    
    FOREIGN KEY (planilla_id) REFERENCES planilla (id),
    FOREIGN KEY (trabajador_id) REFERENCES trabajador (id),
    FOREIGN KEY (estado_id) REFERENCES estado (id)
);