package co.edu.poli.contexto2.modelo;

public class Tripulacion {

    private String nombre;
    private String rol;
    private int edad;
    private String nacionalidad;

    public Tripulacion(String nombre, String rol, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

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


