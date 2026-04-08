package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa el consumo de un producto.
 * Contiene información sobre la cantidad consumida,
 * el lugar, la frecuencia y el control del consumo.
 */
public class Consumo {

    /** Producto asociado al consumo */
    private Producto producto;
    /** Identificador del consumo */
    private String id;
    /** Cantidad consumida */
    private double cantidad;
    /** Lugar donde se realiza el consumo */
    private String lugar;
    /** Frecuencia del consumo */
    private int frecuencia;
    /** Control del consumo */
    private String control;

    /**
     * Constructor de la clase Consumo.
     * 
     * @param producto Producto asociado
     * @param id Identificador del consumo
     * @param cantidad Cantidad consumida
     * @param lugar Lugar del consumo
     * @param frecuencia Frecuencia del consumo
     * @param control Tipo de control
     */
    public Consumo(Producto producto, String id, double cantidad, String lugar, int frecuencia, String control) {
        this.producto = producto;
        this.id = id;
        this.cantidad = cantidad;
        this.lugar = lugar;
        this.frecuencia = frecuencia;
        this.control = control;
    }

    /**
     * @return Producto asociado
     */
    public Producto getProducto() { return producto; }

    /**
     * @param producto Nuevo producto asociado
     */
    public void setProducto(Producto producto) { this.producto = producto; }

    /**
     * @return Identificador del consumo
     */
    public String getId() { return id; }

    /**
     * @param id Nuevo identificador
     */
    public void setId(String id) { this.id = id; }

    /**
     * @return Cantidad consumida
     */
    public double getCantidad() { return cantidad; }

    /**
     * @param cantidad Nueva cantidad
     */
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    /**
     * @return Lugar del consumo
     */
    public String getLugar() { return lugar; }

    /**
     * @param lugar Nuevo lugar
     */
    public void setLugar(String lugar) { this.lugar = lugar; }

    /**
     * @return Frecuencia del consumo
     */
    public int getFrecuencia() { return frecuencia; }

    /**
     * @param frecuencia Nueva frecuencia
     */
    public void setFrecuencia(int frecuencia) { this.frecuencia = frecuencia; }

    /**
     * @return Control del consumo
     */
    public String getControl() { return control; }

    /**
     * @param control Nuevo control
     */
    public void setControl(String control) { this.control = control; }

    /**
     * Representación en cadena del objeto Consumo.
     * 
     * @return Información del consumo
     */
    @Override
    public String toString() {
        return "Consumo{" +
                "producto=" + producto +
                ", id='" + id + '\'' +
                ", cantidad=" + cantidad +
                ", lugar='" + lugar + '\'' +
                ", frecuencia=" + frecuencia +
                ", control='" + control + '\'' +
                '}';
    }
}