public class Persona {
    // propiedades / atributos
    private String nombre;
    boolean estado = true;
    String colorOjos;
    String colorPelo;
    String estadoCivil;

    String nombreUsuario;
    int cambioVecesNombre = 0;

    public Persona(String nombre, boolean estado)
    {
        this.nombre = nombre;
        this.estado = estado;
    }

    // metodos
    public void asignarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String obtenerNombre()
    {
        return this.nombre;
    }

    public String obtenerNombreUsuario()
    {
        return this.nombreUsuario;
    }

    public void cambiarUsuario(String nombreUsuario)
    {
        if ( this.cambioVecesNombre >= 2 ) {
            return;
        }

        this.nombreUsuario = nombreUsuario;
        this.cambioVecesNombre++;
    }

    public String estudiar ()
    {
        return this.obtenerNombre() + " estudia.";
    }

    public String leer()
    {
        return this.obtenerNombre() + " lee.";
    }

    public String caminar()
    {
        return this.obtenerNombre() + " camina.";
    }

    public String correr()
    {
        return this.obtenerNombre() + " corre.";
    }
}
