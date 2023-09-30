/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package planillas;

/**
 *
 * @author deleo
 */
public class Trabajador {
    private int id;
    private String cui;
    private int estado_id;

    public Trabajador(int id, String cui, int estado_id) {
        this.id = id;
        this.cui = cui;
        this.estado_id = estado_id;
    }

    public Trabajador() {
    }

    public int getId() {
        return id;
    }

    public String getCui() {
        return cui;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }
    
    
}
