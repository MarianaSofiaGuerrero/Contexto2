package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa una nave espacial.
 * Contiene información sobre su nombre, modelo, velocidad máxima,
 * sistema asociado y la tripulación.
 */
public class NaveEspacial {

    /** Nombre de la nave */
    private String nombre;
    /** Modelo de la nave */
    private String modelo;
    /** Velocidad máxima de la nave */
    private double velocidadMaxima;
    /** Sistema al que pertenece la nave */
    private Sistema sistema;
    /** Arreglo de tripulación de la nave */
    private Tripulacion[] Tripulacion;

    /**
     * Constructor de la clase NaveEspacial.
     * 
     * @param nombre Nombre de la nave
     * @param modelo Modelo de la nave
     * @param velocidadMaxima Velocidad máxima
     * @param sistema Sistema asociado
     * @param tripulacion Tripulación de la nave
     */
    public NaveEspacial(String nombre, String modelo, double velocidadMaxima,
                        Sistema sistema, Tripulacion[] tripulacion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.sistema = sistema;
        this.Tripulacion = tripulacion;
    }

    /**
     * @return Nombre de la nave
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nuevo nombre de la nave
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Modelo de la nave
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo Nuevo modelo de la nave
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return Velocidad máxima de la nave
     */
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima Nueva velocidad máxima
     */
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return Sistema asociado a la nave
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * @param sistema Nuevo sistema asociado
     */
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    /**
     * @return Arreglo de tripulación
     */
    public Tripulacion[] getTripulacion() {
        return Tripulacion;
    }

    /**
     * @param tripulacion Nueva tripulación
     */
    public void setTripulacion(Tripulacion[] tripulacion) {
        this.Tripulacion = tripulacion;
    }

    /**
     * Representación en cadena del objeto NaveEspacial.
     * 
     * @return Información de la nave espacial
     */
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