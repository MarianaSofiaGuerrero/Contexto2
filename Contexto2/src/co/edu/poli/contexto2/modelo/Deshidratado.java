package co.edu.poli.contexto2.modelo;

public class Deshidratado extends Alimento {

    private double porcentajeHumedad;
    private String metodoDeshidratacion;

    public Deshidratado(String nombre, String id, String fecha, int tamanio,
                        String descripcion, double peso,
                        double porcentajeHumedad, String metodoDeshidratacion) {

        super(nombre, id, fecha, tamanio, descripcion, peso);

        this.porcentajeHumedad = porcentajeHumedad;
        this.metodoDeshidratacion = metodoDeshidratacion;
    }

    public double getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    public String getMetodoDeshidratacion() {
        return metodoDeshidratacion;
    }

    public int calcularVidaUtil() {

        if (porcentajeHumedad < 10) {
            return 365;
        } else if (porcentajeHumedad < 20) {
            return 180;
        } else {
            return 90;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Deshidratado: " + getNombre() +
                " | Método: " + metodoDeshidratacion +
                " | Vida útil: " + calcularVidaUtil() + " días");
    }
}
    
