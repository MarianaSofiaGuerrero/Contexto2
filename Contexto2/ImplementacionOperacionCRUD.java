package co.edu.poli.contexto2.servicios;

import co.edu.poli.contexto2.modelo.Alimento;

public class ImplementacionOperacionCRUD implements OperacionCRUD {
    private Alimento[] alimentos = new Alimento[2];

    @Override
    public void crear(Alimento a) {
        if(a == null) return;
        for(int i = 0; i < alimentos.length; i++) {
            if(alimentos[i] == null) {
                alimentos[i] = a;
                return;
            }
        }
        // ampliar arreglo si está lleno
        Alimento[] temp = new Alimento[alimentos.length + 1];
        System.arraycopy(alimentos, 0, temp, 0, alimentos.length);
        temp[alimentos.length] = a;
        alimentos = temp;
    }

    @Override
    public Alimento consultar(String id) {
        for(Alimento a : alimentos) {
            if(a != null && a.getId().equals(id)) return a;
        }
        return null;
    }

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

    public Alimento[] getAlimentos() {
        return alimentos;
    }
}