package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

/**
 * Interfaz encargada de definir las operaciones de persistencia
 * de datos mediante archivos binarios.
 * 
 * <p>
 * Permite serializar y deserializar arreglos de objetos de tipo
 * {@link Alimento}, facilitando el almacenamiento y recuperación
 * de información del sistema.
 * </p>
 * 
 * <p>
 * Las excepciones no se manejan en esta capa, sino que se propagan
 * a niveles superiores para su adecuado tratamiento.
 * </p>
 * 
 * @author 
 */
public interface OperacionArchivo {

    /**
     * Serializa un arreglo de alimentos y lo guarda en un archivo binario.
     * 
     * @param alimentos Arreglo de objetos {@link Alimento} a guardar
     * @param path Ruta donde se almacenará el archivo
     * @param name Nombre del archivo
     * @return Mensaje indicando el resultado de la operación
     * @throws Exception Si ocurre un error durante el proceso de escritura
     */
    String serializar(Alimento[] alimentos, String path, String name) throws Exception;

    /**
     * Deserializa un archivo binario y retorna los alimentos almacenados.
     * 
     * @param path Ruta del archivo
     * @param name Nombre del archivo
     * @return Arreglo de objetos {@link Alimento} leídos desde el archivo
     * @throws Exception Si ocurre un error durante la lectura o si el archivo no existe
     */
    Alimento[] deserializar(String path, String name) throws Exception;
}
