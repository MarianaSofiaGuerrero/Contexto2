package co.edu.poli.contexto2.modelo;

public class NaveEspacial {

    private String nombre;
    private String modelo;
    private double velocidadMaxima;
    private Sistema sistema;
    private Tripulacion[] Tripulacion;

    public NaveEspacial(String nombre, String modelo, double velocidadMaxima,
                        Sistema sistema, Tripulacion[] tripulacion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.sistema = sistema;
        this.Tripulacion = tripulacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Tripulacion[] getTripulacion() {
        return Tripulacion;
    }

    public void setTripulacion(Tripulacion[] tripulacion) {
        this.Tripulacion = tripulacion;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", sistema=" + sistema +
                '}';
    }
}
