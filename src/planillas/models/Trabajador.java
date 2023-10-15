package planillas.models;

/**
 *
 * @author deleo
 */
public class Trabajador {
    private int id;
    private String cui;

    public Trabajador(int id, String cui) {
        this.id = id;
        this.cui = cui;
    }

    public Trabajador() {
    }

    public int getId() {
        return id;
    }

    public String getCui() {
        return cui;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }    
}
