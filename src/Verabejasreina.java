public class Verabejasreina {
    public static void verabejasreina() {
        for (Abejasreina abeja : Abejasreina.listaAbejasreina) {
            System.out.println("******************************************************************************************");
            System.out.println("\n" + abeja);
            System.out.println("ID de abeja reina: " + abeja.getIdreina());
            System.out.println("Estado de salud de abeja reina: " + abeja.getEstadodesaludabeja());
            System.out.println("Productividad: " + abeja.getProductividad());
            System.out.println("Edad: " + abeja.getEdad());
            System.out.println("ID de colmena: " + abeja.getId());
            System.out.println("Ubicacion: " + abeja.getUbicacion());
            System.out.println("Estado de salud de colmena: " + abeja.getEstadodesalud());
            System.out.println("Cantidad de abejas: " + abeja.getCantidaddeabejas());
            System.out.println("Produccion de miel en litros: " + abeja.getProducciondemiel());
            System.out.println("******************************************************************************************");
        }
    }
}

