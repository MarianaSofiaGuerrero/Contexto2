package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

public interface OperacionCRUD {
    void crear(Alimento a);
    Alimento consultar(String id);
    boolean actualizar(String id, Alimento nuevo);
    boolean eliminar(String id);
}
