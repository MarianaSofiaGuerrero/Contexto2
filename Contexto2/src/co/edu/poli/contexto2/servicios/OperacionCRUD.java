package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

/**
 * Interfaz que define las operaciones básicas CRUD
 * (Crear, Consultar, Actualizar y Eliminar) para objetos de tipo Alimento.
 */
public interface OperacionCRUD {

    /**
     * Crea un nuevo alimento.
     * 
     * @param a Alimento a crear
     */
    void crear(Alimento a);

    /**
     * Consulta un alimento por su identificador.
     * 
     * @param id Identificador del alimento
     * @return El alimento encontrado o null si no existe
     */
    Alimento consultar(String id);

    /**
     * Actualiza un alimento existente.
     * 
     * @param id Identificador del alimento a actualizar
     * @param nuevo Nuevo objeto alimento
     * @return true si se actualiza correctamente, false en caso contrario
     */
    boolean actualizar(String id, Alimento nuevo);

    /**
     * Elimina un alimento según su identificador.
     * 
     * @param id Identificador del alimento a eliminar
     * @return true si se elimina correctamente, false en caso contrario
     */
    boolean eliminar(String id);
}
