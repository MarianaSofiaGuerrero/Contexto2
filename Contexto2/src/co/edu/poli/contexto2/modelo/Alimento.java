package co.edu.poli.contexto2.modelo;

import java.io.Serializable; 
/**
 * Clase abstracta que representa un alimento dentro del sistema.
 * Contiene atributos básicos y métodos comunes para su gestión.
 */
public abstract class Alimento implements Serializable {
	
	private static final long serialVersionUID = 1L;

    /** Nombre del alimento */
    private String nombre;
    /** Identificador único del alimento */
    private String id;
    /** Fecha asociada al alimento */
    private String fecha;
    /** Tamaño del alimento */
    private int tamanio;
    /** Descripción del alimento */
    private String descripcion;
    /** Peso del alimento en gramos */
    private double peso;

    /** País de origen del alimento (constante) */
    private final String paisOrigen = "Colombia";

    /**
     * Constructor de la clase Alimento.
     * 
     * @param nombre Nombre del alimento
     * @param id Identificador del alimento
     * @param fecha Fecha asociada
     * @param tamanio Tamaño del alimento
     * @param descripcion Descripción del alimento
     * @param peso Peso del alimento
     */
    public Alimento(String nombre, String id, String fecha, int tamanio, String descripcion, double peso) {
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
        this.tamanio = tamanio;
        this.descripcion = descripcion;
        this.peso = peso;
    }
    
    /**
     * Método abstracto que debe ser implementado por las subclases
     * para mostrar la información del alimento.
     */
    public abstract void mostrarInfo();

    /**
     * Clasifica el tamaño del alimento según su peso actual.
     * 
     * @return "Pequeño", "Mediano" o "Grande" dependiendo del peso
     */
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

    /**
     * Sobrecarga del método para clasificar el tamaño según un peso dado.
     * 
     * @param peso Peso a evaluar
     * @return "Pequeño", "Mediano" o "Grande"
     */
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

    /**
     * Método final que muestra información base del sistema.
     * No puede ser sobrescrito por las subclases.
     */
    public final void mostrarInformacionBase() {
        System.out.println("Este alimento pertenece al sistema de control.");
    }

    /**
     * @return Nombre del alimento
     */
    public String getNombre() { return nombre; }

    /**
     * @param nombre Nuevo nombre del alimento
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * @return Identificador del alimento
     */
    public String getId() { return id; }

    /**
     * @param id Nuevo identificador del alimento
     */
    public void setId(String id) { this.id = id; }

    /**
     * @return Fecha del alimento
     */
    public String getFecha() { return fecha; }

    /**
     * @param fecha Nueva fecha del alimento
     */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /**
     * @return Tamaño del alimento
     */
    public int getTamanio() { return tamanio; }

    /**
     * @param tamanio Nuevo tamaño del alimento
     */
    public void setTamanio(int tamanio) { this.tamanio = tamanio; }

    /**
     * @return Descripción del alimento
     */
    public String getDescripcion() { return descripcion; }

    /**
     * @param descripcion Nueva descripción del alimento
     */
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    /**
     * @return Peso del alimento
     */
    public double getPeso() { return peso; }

    /**
     * @param peso Nuevo peso del alimento
     */
    public void setPeso(double peso) { this.peso = peso; }

    /**
     * @return País de origen del alimento
     */
    public String getPaisOrigen() { return paisOrigen; }

    /**
     * Representación en cadena del objeto Alimento.
     * 
     * @return Información completa del alimento
     */
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