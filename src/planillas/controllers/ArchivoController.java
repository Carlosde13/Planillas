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

/**
 *
 * @author deleo
 */
public class ArchivoController {
    
    public static List<Planilla_trabajador> leerArchivo(String rutaArchivo, int planilla_id) {
        List<Planilla_trabajador> registros = new ArrayList<>();

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
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear valores en la línea: " + linea);
                    }
                } else {
                    System.err.println("Línea incorrecta: " + linea);
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
