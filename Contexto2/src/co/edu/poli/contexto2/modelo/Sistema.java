package co.edu.poli.contexto2.modelo;

public class Sistema {

    private int limite;
    private String control;
    private double capacidad;
    private String fechaActualizacion;
    private String tipo;

    public Sistema(int limite, String control, double capacidad, String fechaActualizacion, String tipo) {
        this.limite = limite;
        this.control = control;
        this.capacidad = capacidad;
        this.fechaActualizacion = fechaActualizacion;
        this.tipo = tipo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "limite=" + limite +
                ", control='" + control + '\'' +
                ", capacidad=" + capacidad +
                ", fechaActualizacion='" + fechaActualizacion + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}



