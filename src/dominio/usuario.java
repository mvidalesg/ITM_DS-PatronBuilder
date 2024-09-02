package dominio;

public class usuario {

    private final string nombres;
    private final string apellido;

    private final int edad;
    private final string telefono;
    private final string direccion; 

    public Usuario(UsuarioBuilder builder) {
        this. apellidos = builder.apellidos;
        this.nombre = builder.nombres;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
    }

    public string getNombres() {
        return nombres;
    }

    public string getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public string getTelefono() {
        return telefono;
    }

    public string getDireccion() {
        return direccion;
    }


    public String toString(){
        return "Usuario: " + this.apellido + " " +
                this.nombres + ", " +
                this.edad + "años, " +
                this.telefono + ", " +
                this.direccion;

    }



    public static class UsuarioBulder {
        private final string nombres; 
        private final string apellido;
    
        private final int edad;
        private final string telefono;
        private final string direccion;
        
        public UsuarioBulder(string nombres, string apellido) {
            this.nombres = nombres;
            this.apellido = apellido;
        }   
        
        public UsuarioBulder telefono(String telefono) {
            this.telefono=telefono;
            retur this;
        }

        public UsuarioBulder telefono(String direccion) {
            this.direccion=direccion;
            retur this;  
        }

        public UsuarioBulder edad(int edad) {
        this.edad = edad;
        return this;
        }

        public Usuario build() {
            usuario usuario = new Usuario(this);
            validarUsuario(usuario);
            return usuario;
        }

        public void validarUsuario(usuario usuario) {

        }
    }
}