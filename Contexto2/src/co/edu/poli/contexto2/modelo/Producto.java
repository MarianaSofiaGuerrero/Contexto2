package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa un producto dentro del sistema.
 * Contiene información sobre su marca, nombre, función,
 * calidad y cantidad.
 */
public class Producto {

    /** Marca del producto */
    private String marca;
    /** Nombre del producto */
    private String nombreProducto;
    /** Función del producto */
    private String funcion;
    /** Calidad del producto */
    private String calidad;
    /** Cantidad del producto */
    private double cantidad;

    /**
     * Constructor de la clase Producto.
     * 
     * @param marca Marca del producto
     * @param nombreProducto Nombre del producto
     * @param funcion Función del producto
     * @param calidad Calidad del producto
     * @param cantidad Cantidad del producto
     */
    public Producto(String marca, String nombreProducto, String funcion, String calidad, double cantidad) {
        this.marca = marca;
        this.nombreProducto = nombreProducto;
        this.funcion = funcion;
        this.calidad = calidad;
        this.cantidad = cantidad;
    }

    /**
     * @return Marca del producto
     */
    public String getMarca() { return marca; }

    /**
     * @param marca Nueva marca del producto
     */
    public void setMarca(String marca) { this.marca = marca; }

    /**
     * @return Nombre del producto
     */
    public String getNombreProducto() { return nombreProducto; }

    /**
     * @param nombreProducto Nuevo nombre del producto
     */
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    /**
     * @return Función del producto
     */
    public String getFuncion() { return funcion; }

    /**
     * @param funcion Nueva función del producto
     */
    public void setFuncion(String funcion) { this.funcion = funcion; }

    /**
     * @return Calidad del producto
     */
    public String getCalidad() { return calidad; }

    /**
     * @param calidad Nueva calidad del producto
     */
    public void setCalidad(String calidad) { this.calidad = calidad; }

    /**
     * @return Cantidad del producto
     */
    public double getCantidad() { return cantidad; }

    /**
     * @param cantidad Nueva cantidad del producto
     */
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    /**
     * Representación en cadena del objeto Producto.
     * 
     * @return Información del producto
     */
    @Override
    public String toString() {
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", funcion='" + funcion + '\'' +
                ", calidad='" + calidad + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}