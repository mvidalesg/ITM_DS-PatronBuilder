import dominio.usuario;

public class App {
    public static void main(String[] args, int edad, String telefono) throws Exception {
       String nombres;
    Usuario usuario1 = new Usuario.UsuarioBuilder(nombres:"Heymy lorena", apellidos:"Gonzalez Correa")
                
                .build();

                Usuario usuario2 = new Usuario.UsuarioBuilder(nombres:"gustavo Andres", apellidos:"Vargas Berrio")
                .edad(edad:20)
                // sin telefono 
                // sin direccion
                .build();

                Usuario usuario3 = new Usuario.UsuarioBuilder(nombres:"Milton Antonio", apellidos:"Vidales Guzman")
                .edad(edad: 18)
                .telefono(telefono:"3105658989")
                // sin direccion
                .build();

                String direccion;
                Usuario usuario4 = new Usuario.UsuarioBuilder(nombres:"juan camilo", apellidos:"cardona")
                // sin edad
                .telefono(telefono:"3105658989")
                .direccion(direccion:"Car 28 # 72-128")
                .build();

            System.out.println(usuario1);
            System.out.println(usuario2);
            System.out.println(usuario3);
            System.out.println(usuario4);
    }
}
