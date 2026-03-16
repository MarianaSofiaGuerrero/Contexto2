package co.edu.poli.contexto2.modelo;

public class Consumo {

    private Producto producto;
    private String id;
    private double cantidad;
    private String lugar;
    private int frecuencia;
    private String control;

    public Consumo(Producto producto, String id, double cantidad, String lugar, int frecuencia, String control) {
        this.producto = producto;
        this.id = id;
        this.cantidad = cantidad;
        this.lugar = lugar;
        this.frecuencia = frecuencia;
        this.control = control;
    }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getCantidad() { return cantidad; }
    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public int getFrecuencia() { return frecuencia; }
    public void setFrecuencia(int frecuencia) { this.frecuencia = frecuencia; }

    public String getControl() { return control; }
    public void setControl(String control) { this.control = control; }

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