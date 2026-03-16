package co.edu.poli.contexto2.modelo;

public class Inventario {

    private String nombre;
    private int capacidadMaxima;
    private Alimento[] alimentos;
    private Producto[] productos;
    
    public Inventario(String nombre, int capacidadMaxima, Alimento[] alimentos) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alimentos = alimentos;
    }

    public Inventario(String nombre, int capacidadMaxima, Alimento[] alimentos, Producto[] productos) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alimentos = alimentos;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Alimento[] getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Alimento[] alimentos) {
        this.alimentos = alimentos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "nombre='" + nombre + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", totalAlimentos=" + (alimentos != null ? alimentos.length : 0) +
                '}';
    }
}
