package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa el almacenamiento de un alimento.
 * Contiene información sobre el tipo, tiempo, mantenimiento,
 * capacidad y temperatura del almacenamiento.
 */
public class Almacenamiento {

    /** Tipo de almacenamiento */
    private String tipo;
    /** Tiempo de almacenamiento */
    private double tiempo;
    /** Tipo de mantenimiento requerido */
    private String mantenimiento;
    /** Capacidad del almacenamiento */
    private int capacidad;
    /** Temperatura del almacenamiento */
    private double temperatura;

    /**
     * Constructor de la clase Almacenamiento.
     * 
     * @param tipo Tipo de almacenamiento
     * @param tiempo Tiempo de almacenamiento
     * @param mantenimiento Tipo de mantenimiento
     * @param capacidad Capacidad del almacenamiento
     * @param temperatura Temperatura del almacenamiento
     */
    public Almacenamiento(String tipo, double tiempo, String mantenimiento, int capacidad, double temperatura) {
        this.tipo = tipo;
        this.tiempo = tiempo;
        this.mantenimiento = mantenimiento;
        this.capacidad = capacidad;
        this.temperatura = temperatura;
    }

    /**
     * @return Tipo de almacenamiento
     */
    public String getTipo() { return tipo; }

    /**
     * @param tipo Nuevo tipo de almacenamiento
     */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /**
     * @return Tiempo de almacenamiento
     */
    public double getTiempo() { return tiempo; }

    /**
     * @param tiempo Nuevo tiempo de almacenamiento
     */
    public void setTiempo(double tiempo) { this.tiempo = tiempo; }

    /**
     * @return Tipo de mantenimiento
     */
    public String getMantenimiento() { return mantenimiento; }

    /**
     * @param mantenimiento Nuevo mantenimiento
     */
    public void setMantenimiento(String mantenimiento) { this.mantenimiento = mantenimiento; }

    /**
     * @return Capacidad del almacenamiento
     */
    public int getCapacidad() { return capacidad; }

    /**
     * @param capacidad Nueva capacidad del almacenamiento
     */
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    /**
     * @return Temperatura del almacenamiento
     */
    public double getTemperatura() { return temperatura; }

    /**
     * @param temperatura Nueva temperatura del almacenamiento
     */
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

    /**
     * Representación en cadena del objeto Almacenamiento.
     * 
     * @return Información del almacenamiento
     */
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

