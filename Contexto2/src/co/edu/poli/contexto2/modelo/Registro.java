package co.edu.poli.contexto2.modelo;

public final class Registro {

    private String fechaRegistro;
    private String nombreRegistro;
    private String tipoRegistro;
    private String hora;
    private int capacidad;
    

    // atributo estático
    private static int contadorRegistros = 0;

    public Registro(String fechaRegistro, String nombreRegistro, String tipoRegistro, String hora, int capacidad) {
        this.fechaRegistro = fechaRegistro;
        this.nombreRegistro = nombreRegistro;
        this.tipoRegistro = tipoRegistro;
        this.hora = hora;
        this.capacidad = capacidad;
        contadorRegistros++;
    }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getNombreRegistro() { return nombreRegistro; }
    public void setNombreRegistro(String nombreRegistro) { this.nombreRegistro = nombreRegistro; }

    public String getTipoRegistro() { return tipoRegistro; }
    public void setTipoRegistro(String tipoRegistro) { this.tipoRegistro = tipoRegistro; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    
    public static int getContadorRegistros() {
        return contadorRegistros;
    }

    public static void setContadorRegistros(int contadorRegistros) {
        Registro.contadorRegistros = contadorRegistros;
    }

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
