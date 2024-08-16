public class Verapicultores {
    public static void verapicultores() {
        for (Usuarios usuario : Usuarios.listaUsuarios) {
            System.out.println("\n" + usuario);
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Apellido: " + usuario.getApellido());
            System.out.println("Mantenimientos: " + usuario.getMantenimientos());
            System.out.println("Nombre de usuario: " + usuario.getUsuario());
            System.out.println("Contraseña: " + usuario.getPassword());
        }
    }
}

