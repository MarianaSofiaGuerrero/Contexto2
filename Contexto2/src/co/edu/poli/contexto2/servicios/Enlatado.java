package co.edu.poli.contexto2.servicios;

public class Enlatado {

    public static double nivelSodio;
    private String materialEnvase;

    public Enlatado() {
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
