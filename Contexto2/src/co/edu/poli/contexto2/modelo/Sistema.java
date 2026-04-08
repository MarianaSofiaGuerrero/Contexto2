package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa un sistema dentro del contexto de la aplicación.
 * Contiene información sobre límites, control, capacidad,
 * fecha de actualización y tipo de sistema.
 */
public class Sistema {

    /** Límite del sistema */
    private int limite;
    /** Tipo de control del sistema */
    private String control;
    /** Capacidad del sistema */
    private double capacidad;
    /** Fecha de última actualización */
    private String fechaActualizacion;
    /** Tipo de sistema */
    private String tipo;

    /**
     * Constructor de la clase Sistema.
     * 
     * @param limite Límite del sistema
     * @param control Tipo de control
     * @param capacidad Capacidad del sistema
     * @param fechaActualizacion Fecha de actualización
     * @param tipo Tipo de sistema
     */
    public Sistema(int limite, String control, double capacidad, String fechaActualizacion, String tipo) {
        this.limite = limite;
        this.control = control;
        this.capacidad = capacidad;
        this.fechaActualizacion = fechaActualizacion;
        this.tipo = tipo;
    }

    /**
     * @return Límite del sistema
     */
    public int getLimite() {
        return limite;
    }

    /**
     * @param limite Nuevo límite del sistema
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }

    /**
     * @return Tipo de control del sistema
     */
    public String getControl() {
        return control;
    }

    /**
     * @param control Nuevo tipo de control
     */
    public void setControl(String control) {
        this.control = control;
    }

    /**
     * @return Capacidad del sistema
     */
    public double getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad Nueva capacidad del sistema
     */
    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return Fecha de actualización
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * @param fechaActualizacion Nueva fecha de actualización
     */
    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    /**
     * @return Tipo de sistema
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo Nuevo tipo de sistema
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Representación en cadena del objeto Sistema.
     * 
     * @return Información del sistema
     */
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


