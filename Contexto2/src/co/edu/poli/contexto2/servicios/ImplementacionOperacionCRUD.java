package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

/**
 * Clase que implementa las operaciones CRUD (Crear, Consultar,
 * Actualizar y Eliminar) para objetos de tipo {@link Alimento}.
 * 
 * <p>
 * Esta implementación utiliza un arreglo dinámico para almacenar
 * los alimentos. Si el arreglo se llena, se redimensiona automáticamente.
 * </p>
 * 
 * <p>
 * Además, incorpora manejo de excepciones para validar datos de entrada
 * y evitar fallos en la ejecución del sistema.
 * </p>
 * 
 * @author 
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {

    /**
     * Arreglo que almacena los objetos de tipo Alimento.
     */
    private Alimento[] alimentos = new Alimento[2];

    /**
     * Crea un nuevo alimento y lo agrega al arreglo.
     * Si el arreglo está lleno, se amplía su tamaño.
     * 
     * @param a Objeto de tipo Alimento a crear
     * @throws Exception Si ocurre un error durante la creación
     * @throws IllegalArgumentException Si el alimento es nulo
     */
    @Override
    public void crear(Alimento a) throws Exception {
        if (a == null) {
            throw new IllegalArgumentException("No se puede crear un alimento nulo");
        }

        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] == null) {
                alimentos[i] = a;
                return;
            }
        }

        Alimento[] temp = new Alimento[alimentos.length + 1];
        System.arraycopy(alimentos, 0, temp, 0, alimentos.length);
        temp[alimentos.length] = a;
        alimentos = temp;
    }

    /**
     * Consulta un alimento por su identificador.
     * 
     * @param id Identificador del alimento
     * @return El alimento encontrado
     * @throws Exception Si el alimento no es encontrado
     * @throws IllegalArgumentException Si el ID es nulo o vacío
     */
    @Override
    public Alimento consultar(String id) throws Exception {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }

        for (Alimento a : alimentos) {
            if (a != null && a.getId().equals(id)) {
                return a;
            }
        }

        throw new Exception("Alimento no encontrado con ID: " + id);
    }

    /**
     * Actualiza un alimento existente a partir de su identificador.
     * 
     * @param id Identificador del alimento a actualizar
     * @param nuevo Nuevo objeto Alimento con los datos actualizados
     * @return true si se actualiza correctamente
     * @throws Exception Si el alimento no se encuentra
     * @throws IllegalArgumentException Si el ID es inválido
     */
    @Override
    public boolean actualizar(String id, Alimento nuevo) throws Exception {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID inválido");
        }

        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] != null && alimentos[i].getId().equals(id)) {
                alimentos[i] = nuevo;
                return true;
            }
        }

        throw new Exception("No se encontró el alimento para actualizar");
    }

    /**
     * Elimina un alimento del arreglo según su identificador.
     * 
     * @param id Identificador del alimento a eliminar
     * @return true si se elimina correctamente
     * @throws Exception Si el alimento no se encuentra
     * @throws IllegalArgumentException Si el ID es inválido
     */
    @Override
    public boolean eliminar(String id) throws Exception {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID inválido");
        }

        for (int i = 0; i < alimentos.length; i++) {
            if (alimentos[i] != null && alimentos[i].getId().equals(id)) {
                alimentos[i] = null;
                return true;
            }
        }

        throw new Exception("No se encontró el alimento para eliminar");
    }

    /**
     * Obtiene el arreglo actual de alimentos.
     * 
     * @return Arreglo de objetos Alimento
     */
    public Alimento[] getAlimentos() {
        return alimentos;
    }
}