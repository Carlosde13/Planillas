package planillas.models;

/**
 *
 * @author deleo
 */
public class Persona {
    private String cui;
    private String nombre;

    public Persona(String cui, String nombre) {
        this.cui = cui;
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getCui() {
        return cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
