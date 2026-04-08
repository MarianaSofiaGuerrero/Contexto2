package co.edu.poli.contexto2.modelo;

/**
 * Clase que representa un alimento deshidratado.
 * Extiende de la clase Alimento e incluye propiedades
 * específicas como porcentaje de humedad y método de deshidratación.
 */
public class Deshidratado extends Alimento {
	
	 private static final long serialVersionUID = 1L;

    /** Porcentaje de humedad del alimento */
    private double porcentajeHumedad;
    /** Método utilizado para la deshidratación */
    private String metodoDeshidratacion;

    /**
     * Constructor de la clase Deshidratado.
     * 
     * @param nombre Nombre del alimento
     * @param id Identificador del alimento
     * @param fecha Fecha asociada
     * @param tamanio Tamaño del alimento
     * @param descripcion Descripción del alimento
     * @param peso Peso del alimento
     * @param porcentajeHumedad Porcentaje de humedad
     * @param metodoDeshidratacion Método de deshidratación
     */
    public Deshidratado(String nombre, String id, String fecha, int tamanio,
                        String descripcion, double peso,
                        double porcentajeHumedad, String metodoDeshidratacion) {

        super(nombre, id, fecha, tamanio, descripcion, peso);

        this.porcentajeHumedad = porcentajeHumedad;
        this.metodoDeshidratacion = metodoDeshidratacion;
    }

    /**
     * @return Porcentaje de humedad
     */
    public double getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    /**
     * @return Método de deshidratación
     */
    public String getMetodoDeshidratacion() {
        return metodoDeshidratacion;
    }

    /**
     * Calcula la vida útil del alimento según su porcentaje de humedad.
     * 
     * @return Vida útil en días
     */
    public int calcularVidaUtil() {

        if (porcentajeHumedad < 10) {
            return 365;
        } else if (porcentajeHumedad < 20) {
            return 180;
        } else {
            return 90;
        }
    }

    /**
     * Muestra la información del alimento deshidratado.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Deshidratado: " + getNombre() +
                " | Método: " + metodoDeshidratacion +
                " | Vida útil: " + calcularVidaUtil() + " días");
    }
}
    
