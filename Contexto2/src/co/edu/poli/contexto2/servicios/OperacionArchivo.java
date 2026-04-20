package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;
import java.io.*;

/**
 * Clase encargada de la persistencia de datos mediante archivos binarios.
 * 
 * <p>
 * Permite serializar y deserializar arreglos de objetos de tipo {@link Alimento}
 * en un archivo con extensión .bin, facilitando el almacenamiento y recuperación
 * de información del sistema.
 * </p>
 * 
 * <p>
 * Implementa manejo de excepciones para garantizar que los errores de entrada/salida
 * sean propagados a las capas superiores sin interrumpir abruptamente la ejecución.
 * </p>
 * 
 * @author 
 */
public class OperacionArchivo {

    /**
     * Ruta del archivo binario donde se almacenan los alimentos.
     */
    private final String RUTA = "alimentos.bin";

    /**
     * Serializa un arreglo de alimentos y lo guarda en un archivo binario.
     * 
     * @param alimentos Arreglo de objetos {@link Alimento} a guardar
     * @return Mensaje indicando el resultado de la operación
     * @throws Exception Si ocurre un error durante el proceso de escritura
     */
    public String serializar(Alimento[] alimentos) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA))) {
            oos.writeObject(alimentos);
            return "Archivo guardado correctamente";
        } catch (IOException e) {
            throw new Exception("Error al guardar archivo: " + e.getMessage());
        }
    }

    /**
     * Deserializa un archivo binario y retorna los alimentos almacenados.
     * 
     * @return Arreglo de objetos {@link Alimento} leídos desde el archivo
     * @throws Exception Si ocurre un error durante la lectura o si el archivo no existe
     */
    public Alimento[] deserializar() throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA))) {
            return (Alimento[]) ois.readObject();
        } catch (Exception e) {
            throw new Exception("Error al leer archivo: " + e.getMessage());
        }
    }
}