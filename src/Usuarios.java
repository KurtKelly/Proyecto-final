import java.util.ArrayList;
import java.util.List;

public class Usuarios extends  Apicultores{
    static List<Usuarios> listaUsuarios = new ArrayList<>();
    private String usuario;
    private String password;

    public Usuarios(String nombre, String apellido, int mantenimientos, String usuario, String password) {
        super(nombre, apellido, mantenimientos);
        this.usuario = usuario;
        this.password = password;

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
