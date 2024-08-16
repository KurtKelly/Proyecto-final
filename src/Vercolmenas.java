public class Vercolmenas {
    public static void vercolmenas() {
        for (Colmenas colmena : Colmenas.listaColmenas) {
            System.out.println("\n" + colmena);
            System.out.println("ID: " + colmena.getId());
            System.out.println("Ubicacion: " + colmena.getUbicacion());
            System.out.println("Estado de salud: " + colmena.getEstadodesalud());
            System.out.println("Cantidad de abejas: " + colmena.getCantidaddeabejas());
            System.out.println("Produccion de miel en litros: " + colmena.getProducciondemiel());
        }
    }
}

