package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa un miembro de la tripulación.
 * Contiene información sobre su nombre, rol, edad y nacionalidad.
 */
public class Tripulacion {

    /** Nombre del tripulante */
    private String nombre;
    /** Rol dentro de la nave */
    private String rol;
    /** Edad del tripulante */
    private int edad;
    /** Nacionalidad del tripulante */
    private String nacionalidad;

    /**
     * Constructor de la clase Tripulacion.
     * 
     * @param nombre Nombre del tripulante
     * @param rol Rol dentro de la nave
     * @param edad Edad del tripulante
     * @param nacionalidad Nacionalidad del tripulante
     */
    public Tripulacion(String nombre, String rol, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return Nombre del tripulante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nuevo nombre del tripulante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Rol del tripulante
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol Nuevo rol del tripulante
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return Edad del tripulante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad Nueva edad del tripulante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Nacionalidad del tripulante
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad Nueva nacionalidad del tripulante
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Representación en cadena del objeto Tripulacion.
     * 
     * @return Información del tripulante
     */
    @Override
    public String toString() {
        return "Tripulacion{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}


