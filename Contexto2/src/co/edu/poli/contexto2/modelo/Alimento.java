package co.edu.poli.contexto2.modelo;

public abstract class Alimento {

    private String nombre;
    private String id;
    private String fecha;
    private int tamanio;
    private String descripcion;
    private double peso;

    // PUNTO 3: atributo final, no se puede cambiar
    private final String paisOrigen = "Colombia";

    public Alimento(String nombre, String id, String fecha, int tamanio, String descripcion, double peso) {
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
        this.peso = peso;
    }
    
    // METODO ABSTRACTO
    public abstract void mostrarInfo();

    public String clasificarTamano() {

        if (peso < 500) {
            return "Pequeño";
        } 
        else if (peso <= 1000) {
            return "Mediano";
        } 
        else {
            return "Grande";
        }
    }

    // SOBRECARGA
    public String clasificarTamano(double peso) {

        if (peso < 500) {
            return "Pequeño";
        } 
        else if (peso <= 1000) {
            return "Mediano";
        } 
        else {
            return "Grande";
        }
    }

    // PUNTO 3: método final, no se puede sobrescribir
    public final void mostrarInformacionBase() {
        System.out.println("Este alimento pertenece al sistema de control.");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public int getTamanio() { return tamanio; }
    public void setTamanio(int tamanio) { this.tamanio = tamanio; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getPaisOrigen() { return paisOrigen; }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tamanio=" + tamanio +
                ", descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
