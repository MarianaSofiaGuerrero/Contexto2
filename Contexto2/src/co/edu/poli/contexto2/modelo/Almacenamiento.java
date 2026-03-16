package co.edu.poli.contexto2.modelo;

public class Almacenamiento {

    private String tipo;
    private double tiempo;
    private String mantenimiento;
    private int capacidad;
    private double temperatura;

    public Almacenamiento(String tipo, double tiempo, String mantenimiento, int capacidad, double temperatura) {
        this.tipo = tipo;
        this.tiempo = tiempo;
        this.mantenimiento = mantenimiento;
        this.capacidad = capacidad;
        this.temperatura = temperatura;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getTiempo() { return tiempo; }
    public void setTiempo(double tiempo) { this.tiempo = tiempo; }

    public String getMantenimiento() { return mantenimiento; }
    public void setMantenimiento(String mantenimiento) { this.mantenimiento = mantenimiento; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "tipo='" + tipo + '\'' +
                ", tiempo=" + tiempo +
                ", mantenimiento='" + mantenimiento + '\'' +
                ", capacidad=" + capacidad +
                ", temperatura=" + temperatura +
                '}';
    }
}


