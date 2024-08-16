import java.util.ArrayList;
import java.util.List;

public class Apicultores {
    static List<Apicultores> listaApicultores = new ArrayList<>();
    private String nombre;
    private String apellido;
    private int mantenimientos;


    public Apicultores(String nombre, String apellido, int mantenimientos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mantenimientos = mantenimientos;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public int getMantenimientos() {
        return mantenimientos;
    }

    public void setMantenimientos(int mantenimientos) {
        this.mantenimientos = mantenimientos;
    }

}
