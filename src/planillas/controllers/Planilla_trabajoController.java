package planillas.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import planillas.database.Conexion;
import static planillas.database.Conexion.conexion;
import planillas.models.Planilla_trabajador;
import java.sql.Statement;

/**
 *
 * @author deleo
 */
public class Planilla_trabajoController {
    
    private boolean exito;
    private String errorMessage;

    public boolean getExito() {
        return exito;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    

    public void insertRegistros(List<Planilla_trabajador> registros, int planilla_id) {
    Connection connection = Conexion.conexion();

    setExito(true);
    setErrorMessage("");

    PreparedStatement statement = null; 

    if (connection != null) {
            try {
                String query = "INSERT INTO PLANILLA_TRABAJADOR (planilla_id, trabajador_id, sueldo, estado_id) VALUES (?, ?, ?, ?)";
                statement = connection.prepareStatement(query);

                for (Planilla_trabajador registro : registros) {
                    statement.setInt(1, planilla_id);
                    statement.setInt(2, registro.getTrabajador_id());
                    statement.setFloat(3, registro.getSueldo());
                    statement.setInt(4, registro.getEstado_id());
                    statement.addBatch(); 
                }

                int[] rowCountArray = statement.executeBatch(); 

                for (int rowCount : rowCountArray) {
                    if (rowCount <= 0) {
                        System.out.println("No se insertaron registros");
                        setExito(false);
                        setErrorMessage("No todos los registros se agregaron con éxito");
                        break;
                    }
                }

                System.out.println("Inserciones de registros exitosas");

            } catch (SQLException e) {
                System.out.println("Error en la consulta: " + e.getMessage());
                setExito(false);
                setErrorMessage("Error en la consulta: " + e.getMessage());
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        } else {
            setExito(false);
            setErrorMessage("Error al conectar");
        }
    }
}

