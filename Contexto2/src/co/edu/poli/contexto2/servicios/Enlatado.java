package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

/**
 * Clase que representa un alimento enlatado.
 * Extiende la clase Alimento e incluye información sobre
 * el material del envase y el nivel de sodio.
 */
public class Enlatado extends Alimento {
	
	 private static final long serialVersionUID = 1L;

    /** Nivel de sodio del alimento (atributo estático) */
    public static double nivelSodio;
    /** Material del envase del alimento */
    private String materialEnvase;

    /**
     * Constructor de la clase Enlatado.
     * 
     * @param nombre Nombre del alimento
     * @param id Identificador del alimento
     * @param fecha Fecha asociada
     * @param tamanio Tamaño del alimento
     * @param descripcion Descripción del alimento
     * @param peso Peso del alimento
     * @param materialEnvase Material del envase
     */
    public Enlatado(String nombre, String id, String fecha, int tamanio,
                    String descripcion, double peso, String materialEnvase) {

        super(nombre, id, fecha, tamanio, descripcion, peso);
        this.materialEnvase = materialEnvase;
    }

    /**
     * Determina si el alimento tiene un nivel alto de sodio.
     * 
     * @return true si el nivel de sodio es mayor a 500, false en caso contrario
     */
    public static boolean esAltoenSodio() {
        return nivelSodio > 500.0;
    }

    /**
     * @return Material del envase
     */
    public String getMaterialEnvase() {
        return materialEnvase;
    }

    /**
     * @param materialEnvase Nuevo material del envase
     */
    public void setMaterialEnvase(String materialEnvase) {
        this.materialEnvase = materialEnvase;
    }
    
    /**
     * Muestra la información del alimento enlatado.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Enlatado: " + getNombre() +
                " | Envase: " + materialEnvase +
                " | Alto sodio: " + esAltoenSodio());
    }
    
}

