package co.edu.poli.contexto2.modelo;

public class Procesado extends Alimento {

    private double contenidoAditivos;
    private String nivelProcesamiento;

    public Procesado(String nombre, String id, String fecha, int tamanio,
                     String descripcion, double peso,
                     double contenidoAditivos, String nivelProcesamiento) {

        super(nombre, id, fecha, tamanio, descripcion, peso);

        this.contenidoAditivos = contenidoAditivos;
        this.nivelProcesamiento = nivelProcesamiento;
    }

    public double calcularCalorias() {
        return contenidoAditivos * 10;
    }
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
    @Override
    public void mostrarInfo() {
        System.out.println("Procesado: " + getNombre() +
                " | Nivel: " + nivelProcesamiento +
                " | Calorías: " + calcularCalorias());
    }
}

