package co.edu.poli.contexto2.modelo;

/**
 * Clase final que representa un registro dentro del sistema.
 * Contiene información sobre la fecha, nombre, tipo, hora y capacidad.
 * Además, lleva un conteo total de registros creados.
 */
public final class Registro {

    /** Fecha del registro */
    private String fechaRegistro;
    /** Nombre del registro */
    private String nombreRegistro;
    /** Tipo de registro */
    private String tipoRegistro;
    /** Hora del registro */
    private String hora;
    /** Capacidad asociada al registro */
    private int capacidad;
    
    /** Contador estático de registros creados */
    private static int contadorRegistros = 0;

    /**
     * Constructor de la clase Registro.
     * 
     * @param fechaRegistro Fecha del registro
     * @param nombreRegistro Nombre del registro
     * @param tipoRegistro Tipo del registro
     * @param hora Hora del registro
     * @param capacidad Capacidad del registro
     */
    public Registro(String fechaRegistro, String nombreRegistro, String tipoRegistro, String hora, int capacidad) {
        this.fechaRegistro = fechaRegistro;
        this.nombreRegistro = nombreRegistro;
        this.tipoRegistro = tipoRegistro;
        this.hora = hora;
        this.capacidad = capacidad;
        contadorRegistros++;
    }

    /**
     * @return Fecha del registro
     */
    public String getFechaRegistro() { return fechaRegistro; }

    /**
     * @param fechaRegistro Nueva fecha del registro
     */
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    /**
     * @return Nombre del registro
     */
    public String getNombreRegistro() { return nombreRegistro; }

    /**
     * @param nombreRegistro Nuevo nombre del registro
     */
    public void setNombreRegistro(String nombreRegistro) { this.nombreRegistro = nombreRegistro; }

    /**
     * @return Tipo del registro
     */
    public String getTipoRegistro() { return tipoRegistro; }

    /**
     * @param tipoRegistro Nuevo tipo del registro
     */
    public void setTipoRegistro(String tipoRegistro) { this.tipoRegistro = tipoRegistro; }

    /**
     * @return Hora del registro
     */
    public String getHora() { return hora; }

    /**
     * @param hora Nueva hora del registro
     */
    public void setHora(String hora) { this.hora = hora; }

    /**
     * @return Capacidad del registro
     */
    public int getCapacidad() { return capacidad; }

    /**
     * @param capacidad Nueva capacidad del registro
     */
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    /**
     * Obtiene el número total de registros creados.
     * 
     * @return Contador de registros
     */
    public static int getContadorRegistros() {
        return contadorRegistros;
    }

    /**
     * Establece el valor del contador de registros.
     * 
     * @param contadorRegistros Nuevo valor del contador
     */
    public static void setContadorRegistros(int contadorRegistros) {
        Registro.contadorRegistros = contadorRegistros;
    }

    /**
     * Representación en cadena del objeto Registro.
     * 
     * @return Información del registro
     */
    @Override
    public String toString() {
        return "Registro{" +
                "fechaRegistro='" + fechaRegistro + '\'' +
                ", nombreRegistro='" + nombreRegistro + '\'' +
                ", tipoRegistro='" + tipoRegistro + '\'' +
                ", hora='" + hora + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
