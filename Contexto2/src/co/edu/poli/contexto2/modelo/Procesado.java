package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa un alimento procesado.
 * Extiende la clase Alimento e incluye información
 * sobre el contenido de aditivos y el nivel de procesamiento.
 */
public class Procesado extends Alimento {
	
	 private static final long serialVersionUID = 1L;

    /** Contenido de aditivos del alimento */
    private double contenidoAditivos;
    /** Nivel de procesamiento del alimento */
    private String nivelProcesamiento;

    /**
     * Constructor de la clase Procesado.
     * 
     * @param nombre Nombre del alimento
     * @param id Identificador del alimento
     * @param fecha Fecha asociada
     * @param tamanio Tamaño del alimento
     * @param descripcion Descripción del alimento
     * @param peso Peso del alimento
     * @param contenidoAditivos Contenido de aditivos
     * @param nivelProcesamiento Nivel de procesamiento
     */
    public Procesado(String nombre, String id, String fecha, int tamanio,
                     String descripcion, double peso,
                     double contenidoAditivos, String nivelProcesamiento) {

        super(nombre, id, fecha, tamanio, descripcion, peso);

        this.contenidoAditivos = contenidoAditivos;
        this.nivelProcesamiento = nivelProcesamiento;
    }

    /**
     * Calcula las calorías del alimento basado en los aditivos.
     * 
     * @return Cantidad de calorías
     */
    public double calcularCalorias() {
        return contenidoAditivos * 10;
    }

    /**
     * Clasifica el tamaño del alimento según el nivel de procesamiento.
     * 
     * @return "Pequeño", "Mediano" o "Grande"
     */
    @Override
    public String clasificarTamano() {

        if (nivelProcesamiento.equals("ALTO")) {
            return "Grande";
        } 
        else if (nivelProcesamiento.equals("MEDIO")) {
            return "Mediano";
        } 
        else {
            return "Pequeño";
        }
    }

    /**
     * Muestra la información del alimento procesado.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Procesado: " + getNombre() +
                " | Nivel: " + nivelProcesamiento +
                " | Calorías: " + calcularCalorias());
    }
}
