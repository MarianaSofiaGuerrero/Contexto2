package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;
import java.io.*;

/**
 * Clase que maneja la serialización y deserialización
 * de objetos tipo Alimento en un archivo binario (.bin).
 */
public class OperacionArchivo {

    private final String RUTA = "alimentos.bin";

    /**
     * Guarda los alimentos en un archivo binario.
     * 
     * @param alimentos Arreglo de alimentos
     * @return Mensaje de resultado
     */
    public String serializar(Alimento[] alimentos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA))) {
            oos.writeObject(alimentos);
            return "Archivo guardado correctamente en .bin";
        } catch (IOException e) {
            return "Error al guardar: " + e.getMessage();
        }
    }

    /**
     * Lee los alimentos desde el archivo binario.
     * 
     * @return Arreglo de alimentos
     */
    public Alimento[] deserializar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA))) {
            return (Alimento[]) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return new Alimento[0];
        }
    }
}