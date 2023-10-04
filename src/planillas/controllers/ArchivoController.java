/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillas.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import planillas.models.Planilla_trabajador;
import planillas.models.Trabajador;

/**
 *
 * @author deleo
 */
public class ArchivoController {
    
    private boolean exito;
    private String errorMessage;

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public boolean getExito() {
        return exito;
    }
    
    public  List<Planilla_trabajador> leerArchivo(String rutaArchivo, int planilla_id) {
        List<Planilla_trabajador> registros = new ArrayList<>();

        TrabajadorController trabajadorController = new TrabajadorController();
        
        setExito(true);
        setErrorMessage("");
        try {
            // Abre el archivo y prepara el BufferedReader
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                // Divide la línea en campos usando la coma como separador
                String[] campos = linea.split(",");
                
                if (campos.length == 3) {
                    try {
                        // Parsea los campos a tipos de datos apropiados
                        int trabajador_id = Integer.parseInt(campos[0]);
                        float sueldo = Float.parseFloat(campos[1]);
                        int estado_id = Integer.parseInt(campos[2]);
                        
                        Planilla_trabajador registro = new Planilla_trabajador(planilla_id, trabajador_id, sueldo, estado_id);
                        registros.add(registro);
                        System.out.println("Se leyo el registro");
                        
                        Trabajador trabajador = new Trabajador ();
                        
                        trabajador = trabajadorController.getById(trabajador_id);
                        
                        if(trabajador == null){
                            setExito(false);
                            setErrorMessage("Error en la linea: " + linea+"\nno se existe un trabajador con este ID");
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear valores en la línea: " + linea);
                        setExito(false);
                        setErrorMessage("Error al convertir valores en la línea: " + linea+"\nVerifique el archivo e intente de nuevo");
                    }
                } else {
                    System.err.println("Línea con formato incorrecto: " + linea);
                    setExito(false);
                    setErrorMessage("Línea con formato incorrecto: " + linea);
                }
            }

            // Cierra el BufferedReader
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return registros;
    }
}
