package co.edu.poli.contexto2.servicios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.poli.contexto2.modelo.Alimento;

/**
 * Implementación de las operaciones CRUD para la gestión de objetos
 * de tipo {@link Alimento}.
 * 
 * <p>
 * Esta clase permite crear, consultar, actualizar y eliminar alimentos
 * almacenados en un arreglo dinámico. Además, incluye métodos para
 * serializar y deserializar los datos en archivos.
 * </p>
 * 
 * <p>
 * No maneja excepciones directamente (no usa try-catch), sino que las
 * propaga mediante la cláusula {@code throws}, delegando su manejo a
 * capas superiores.
 * </p>
 * 
 * @author 
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD {

    /**
     * Arreglo interno donde se almacenan los objetos Alimento.
     */
    private Alimento[] alimentos = new Alimento[2];

    /**
     * Crea un nuevo alimento y lo agrega al arreglo.
     * Si el arreglo está lleno, se redimensiona automáticamente.
     *
     * @param a Objeto de tipo Alimento a agregar
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
     * Retorna el arreglo actual de alimentos almacenados.
     *
     * @return Arreglo de objetos Alimento
     */
    public Alimento[] getAlimentos() {
        return alimentos;
    }

    /**
     * Permite establecer (reemplazar) el arreglo de alimentos.
     * 
     * <p>
     * Este método es utilizado principalmente cuando se cargan datos
     * desde un archivo mediante deserialización.
     * </p>
     * 
     * @param alimentos nuevo arreglo de alimentos a asignar
     */
    public void setAlimentos(Alimento[] alimentos) {
        this.alimentos = alimentos;
    }

    /**
     * Serializa un arreglo de alimentos y lo guarda en un archivo.
     *
     * @param alimentos Arreglo de alimentos a guardar
     * @param path Ruta donde se guardará el archivo
     * @param name Nombre del archivo
     * @return Mensaje de confirmación
     * @throws Exception Si ocurre un error durante la escritura
     */
    public String serializar(Alimento[] alimentos, String path, String name) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(path + name);
             ObjectOutputStream oss = new ObjectOutputStream(fos)) {

            oss.writeObject(alimentos);
        }
        return "Archivo create!!";
    }

    /**
     * Deserializa un archivo y recupera el arreglo de alimentos.
     *
     * @param path Ruta del archivo
     * @param name Nombre del archivo
     * @return Arreglo de objetos Alimento recuperado
     * @throws Exception Si ocurre un error durante la lectura
     */
    public Alimento[] deserializar(String path, String name) throws Exception {
        try (FileInputStream fis = new FileInputStream(path + name);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return (Alimento[]) ois.readObject();
        }
    }
}