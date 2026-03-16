package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

public class Enlatado extends Alimento {

    public static double nivelSodio;
    private String materialEnvase;

    public Enlatado(String nombre, String id, String fecha, int tamanio,
                    String descripcion, double peso, String materialEnvase) {

        super(nombre, id, fecha, tamanio, descripcion, peso);
        this.materialEnvase = materialEnvase;
    }

    public static boolean esAltoenSodio() {
        return nivelSodio > 500.0;
    }

    public String getMaterialEnvase() {
        return materialEnvase;
    }

    public void setMaterialEnvase(String materialEnvase) {
        this.materialEnvase = materialEnvase;
    }
}

