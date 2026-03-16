package co.edu.poli.contexto2.modelo;

public class Producto {

    private String marca;
    private String nombreProducto;
    private String funcion;
    private String calidad;
    private double cantidad;

    public Producto(String marca, String nombreProducto, String funcion, String calidad, double cantidad) {
        this.marca = marca;
        this.nombreProducto = nombreProducto;
        this.funcion = funcion;
        this.calidad = calidad;
        this.cantidad = cantidad;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public String getFuncion() { return funcion; }
    public void setFuncion(String funcion) { this.funcion = funcion; }

    public String getCalidad() { return calidad; }
    public void setCalidad(String calidad) { this.calidad = calidad; }

    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

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
