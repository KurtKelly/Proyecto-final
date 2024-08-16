import java.util.ArrayList;
import java.util.List;

public class Colmenas {
    static List<Colmenas> listaColmenas = new ArrayList<>();
    private String id;
    private String ubicacion;
    private String estadodesalud;
    private int cantidaddeabejas;
    private float producciondemiel;


    public Colmenas(String id, String ubicacion, String estadodesalud, int cantidaddeabejas, float producciondemiel) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estadodesalud = estadodesalud;
        this.cantidaddeabejas = cantidaddeabejas;
        this.producciondemiel = producciondemiel;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }



    public String getEstadodesalud() {
        return estadodesalud;
    }

    public void setEstadodesalud(String estadodesalud) {
        this.estadodesalud = estadodesalud;
    }




    public int getCantidaddeabejas() { return cantidaddeabejas; }

    public void setCantidaddeabejas(int cantidaddeabejas) {
        this.cantidaddeabejas = cantidaddeabejas;
    }




    public float getProducciondemiel() {
        return producciondemiel;
    }

    public void setProducciondemiel(float producciondemiel) {
        this.producciondemiel = producciondemiel;
    }

}
