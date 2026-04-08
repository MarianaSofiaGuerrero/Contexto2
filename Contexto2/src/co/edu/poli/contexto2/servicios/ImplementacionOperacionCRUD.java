package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

/**
 * Clase que implementa las operaciones CRUD para objetos de tipo Alimento.
 * Permite crear, consultar, actualizar y eliminar elementos en un arreglo dinámico.
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {
    
    /** Arreglo que almacena los alimentos */
    private Alimento[] alimentos = new Alimento[2];

    /**
     * Agrega un nuevo alimento al arreglo.
     * Si no hay espacio disponible, se amplía el arreglo.
     * 
     * @param a Alimento a agregar
     */
    @Override
    public void crear(Alimento a) {
        if(a == null) return;
        for(int i = 0; i < alimentos.length; i++) {
            if(alimentos[i] == null) {
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
     * Busca un alimento por su identificador.
     * 
     * @param id Identificador del alimento
     * @return El alimento encontrado o null si no existe
     */
    @Override
    public Alimento consultar(String id) {
        for(Alimento a : alimentos) {
            if(a != null && a.getId().equals(id)) return a;
        }
        return null;
    }

    /**
     * Actualiza un alimento existente según su identificador.
     * 
     * @param id Identificador del alimento a actualizar
     * @param nuevo Nuevo objeto alimento
     * @return true si se actualizó correctamente, false en caso contrario
     */
    @Override
    public boolean actualizar(String id, Alimento nuevo) {
        for(int i = 0; i < alimentos.length; i++) {
            if(alimentos[i] != null && alimentos[i].getId().equals(id)) {
                alimentos[i] = nuevo;
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un alimento del arreglo según su identificador.
     * 
     * @param id Identificador del alimento a eliminar
     * @return true si se eliminó correctamente, false en caso contrario
     */
    @Override
    public boolean eliminar(String id) {
        for(int i = 0; i < alimentos.length; i++) {
            if(alimentos[i] != null && alimentos[i].getId().equals(id)) {
                alimentos[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Obtiene el arreglo de alimentos.
     * 
     * @return Arreglo de alimentos
     */
    public Alimento[] getAlimentos() {
        return alimentos;
    }
}