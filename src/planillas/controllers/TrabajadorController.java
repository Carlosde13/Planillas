/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillas.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import planillas.database.Conexion;
import planillas.models.Trabajador;

/**
 *
 * @author deleo
 */
public class TrabajadorController {
    
    public static Trabajador getById(int id) {
        Connection connection = Conexion.conexion();
        Trabajador trabajador = null;

        if (connection != null) {
            PreparedStatement statement = null;
            ResultSet resultSet = null;

            try {
                String query = "SELECT * FROM TRABAJADOR WHERE id = ?";
                statement = connection.prepareStatement(query);
                statement.setInt(1, id);
                resultSet = statement.executeQuery();

                if (resultSet.next()) {
                    int trabajadorID = resultSet.getInt("id");
                    String persona_cui = resultSet.getString("persona_cui");

                    trabajador = new Trabajador();
                    trabajador.setId(trabajadorID);
                    trabajador.setCui(persona_cui);
                }
            } catch (SQLException e) {
                System.out.println("Error en la consulta: " + e.getMessage());
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                    if (statement != null) {
                        statement.close();
                    }
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }

        return trabajador;
    }
}
