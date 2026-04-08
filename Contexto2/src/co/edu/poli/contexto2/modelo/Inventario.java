package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa un inventario de alimentos y productos.
 * Permite almacenar y gestionar colecciones de alimentos y productos
 * junto con su capacidad máxima.
 */
public class Inventario {

    /** Nombre del inventario */
    private String nombre;
    /** Capacidad máxima del inventario */
    private int capacidadMaxima;
    /** Arreglo de alimentos almacenados */
    private Alimento[] alimentos;
    /** Arreglo de productos almacenados */
    private Producto[] productos;
    
    /**
     * Constructor de la clase Inventario con alimentos.
     * 
     * @param nombre Nombre del inventario
     * @param capacidadMaxima Capacidad máxima
     * @param alimentos Arreglo de alimentos
     */
    public Inventario(String nombre, int capacidadMaxima, Alimento[] alimentos) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alimentos = alimentos;
    }

    /**
     * Constructor de la clase Inventario con alimentos y productos.
     * 
     * @param nombre Nombre del inventario
     * @param capacidadMaxima Capacidad máxima
     * @param alimentos Arreglo de alimentos
     * @param productos Arreglo de productos
     */
    public Inventario(String nombre, int capacidadMaxima, Alimento[] alimentos, Producto[] productos) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alimentos = alimentos;
        this.productos = productos;
    }

    /**
     * @return Nombre del inventario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nuevo nombre del inventario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Capacidad máxima del inventario
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * @param capacidadMaxima Nueva capacidad máxima
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * @return Arreglo de alimentos
     */
    public Alimento[] getAlimentos() {
        return alimentos;
    }

    /**
     * @param alimentos Nuevo arreglo de alimentos
     */
    public void setAlimentos(Alimento[] alimentos) {
        this.alimentos = alimentos;
    }

    /**
     * @return Arreglo de productos
     */
    public Producto[] getProductos() {
        return productos;
    }

    /**
     * @param productos Nuevo arreglo de productos
     */
    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    /**
     * Representación en cadena del objeto Inventario.
     * 
     * @return Información del inventario
     */
    @Override
    public String toString() {
        return "Inventario{" +
                "nombre='" + nombre + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", totalAlimentos=" + (alimentos != null ? alimentos.length : 0) +
                '}';
    }
}