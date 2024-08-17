import java.util.ArrayList;
import java.util.List;

public class Abejasreina extends Colmenas {
    static List<Abejasreina> listaAbejasreina = new ArrayList<>();
    private String idreina;
    private String estadodesaludabeja;
    private String productividad;
    private int edad;


    public Abejasreina(String idreina, String estadodesaludabeja, String productividad, int edad, String id, String ubicacion, String estadodesalud, int cantidaddeabejas, float producciondemiel) {
        super(id, ubicacion, estadodesalud, cantidaddeabejas, producciondemiel);
        this.idreina = idreina;
        this.estadodesaludabeja = estadodesaludabeja;
        this.productividad = productividad;
        this.edad = edad;


    }








    public String getIdreina() {
        return idreina;
    }

    public void setIdreina(String idreina) {
        this.idreina = idreina;
    }



    public String getEstadodesaludabeja() {
        return estadodesaludabeja;
    }

    public void setEstadodesaludabeja(String estadodesaludabeja) {
        this.estadodesaludabeja = estadodesaludabeja;
    }



    public String getProductividad() {
        return productividad;
    }

    public void setProductividad(String productividad) {
        this.productividad = productividad;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
