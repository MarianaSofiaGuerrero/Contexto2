package co.edu.poli.contexto2.vista;

import co.edu.poli.contexto2.modelo.*;
import co.edu.poli.contexto2.servicios.Enlatado;
import co.edu.poli.contexto2.servicios.ImplementacionOperacionCRUD;
import java.util.Scanner;

/**
 * Clase principal del sistema.
 * 
 * <p>
 * Ejecuta pruebas del CRUD, crea objetos de diferentes tipos de alimentos
 * y permite la interacción con el usuario mediante un menú en consola.
 * </p>
 * 
 * <p>
 * También permite la persistencia de datos mediante serialización y
 * deserialización de archivos binarios (.bin).
 * </p>
 * 
 * <p>
 * Incluye manejo de excepciones para evitar fallos inesperados.
 * </p>
 */
public class Principal {

    /**
     * Método principal que inicia el sistema.
     * 
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        try {

            Enlatado.nivelSodio = 500.0;

            Enlatado atun = new Enlatado(
                    "Atun en lata",
                    "E-001",
                    "2027-06-10",
                    250,
                    "Atun enlatado",
                    300,
                    "Lata"
            );

            Procesado sopa = new Procesado(
                    "Sopa de Tomate",
                    "P-001",
                    "2027-05-20",
                    500,
                    "Sopa instantanea",
                    700,
                    15.5,
                    "ALTO"
            );

            Deshidratado fruta = new Deshidratado(
                    "Mango Seco",
                    "D-001",
                    "2028-01-10",
                    100,
                    "Fruta deshidratada",
                    200,
                    5.0,
                    "Liofilizacion"
            );

            System.out.println("\n PRUEBA CRUD");

            ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

            crud.crear(sopa);
            crud.crear(fruta);
            crud.crear(atun);

            System.out.println("\n CONSULTAR P-001 ");
            Alimento resultado = crud.consultar("P-001");
            if (resultado != null) {
                resultado.mostrarInfo();
            }

            System.out.println("\n ACTUALIZAR P-001 ");
            boolean actualizado = crud.actualizar("P-001", new Procesado(
                    "Sopa Mejorada",
                    "P-001",
                    "2028-01-01",
                    600,
                    "Nueva versión",
                    900,
                    20,
                    "ALTO"
            ));
            System.out.println(actualizado ? "Actualizado correctamente" : "No encontrado");

            System.out.println("\n ELIMINAR D-001 ");
            boolean eliminado = crud.eliminar("D-001");
            System.out.println(eliminado ? "Eliminado correctamente" : "No encontrado");

            System.out.println("\n ALIMENTOS ACTUALIZADOS");
            for (Alimento a : crud.getAlimentos()) {
                if (a != null) {
                    a.mostrarInfo();
                }
            }

            Alimento[] misAlimentos = {sopa, fruta};
            Inventario bodega = new Inventario("Bodega Alfa", 500, misAlimentos);

            System.out.println("\n REPORTE DE CONTROL ESPACIAL ");
            System.out.println("Inventario: " + bodega.getNombre());

            mostrarAlimento(sopa);

            Alimento nuevoAlimento = crearAlimento();
            System.out.println(nuevoAlimento);

            crud = new ImplementacionOperacionCRUD();

            Scanner sc = new Scanner(System.in);
            ImplementacionOperacionCRUD servicio = new ImplementacionOperacionCRUD();
            int opcion;

            do {
                System.out.println("\n---------------------- MENU ----------------------");
                System.out.println("1. Crear un alimento");
                System.out.println("2. Crear un inventario");
                System.out.println("3. Listar todos los objetos");
                System.out.println("4. Listar un objeto");
                System.out.println("5. Modificar un objeto");
                System.out.println("6. Eliminar un objeto");
                System.out.println("7. Guardar en archivo (.bin)");
                System.out.println("8. Leer archivo (.bin)");
                System.out.println("9. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.println("Ingrese nombre:");
                        String nombre = sc.nextLine();

                        System.out.println("Ingrese ID:");
                        String id = sc.nextLine();

                        System.out.println("Ingrese fecha:");
                        String fecha = sc.nextLine();

                        System.out.println("Ingrese tamaño:");
                        int tamanio = sc.nextInt();

                        System.out.println("Ingrese peso:");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Ingrese descripción:");
                        String desc = sc.nextLine();

                        Procesado nuevo = new Procesado(nombre, id, fecha, tamanio, desc, peso, 10, "MEDIO");
                        crud.crear(nuevo);

                        System.out.println("Alimento creado.");
                        break;

                    case 3:
                        for (Alimento a : crud.getAlimentos()) {
                            if (a != null) System.out.println(a);
                        }
                        break;

                    case 4:
                        System.out.print("Ingrese ID del alimento: ");
                        System.out.println(crud.consultar(sc.nextLine()));
                        break;

                    case 5:
                        System.out.print("ID a modificar: ");
                        String idMod = sc.nextLine();

                        Procesado mod = new Procesado("Modificado", idMod, "2026", 200, "Editado", 800, 20, "ALTO");
                        System.out.println(crud.actualizar(idMod, mod) ? "Actualizado" : "No encontrado");
                        break;

                    case 6:
                        System.out.print("ID a eliminar: ");
                        System.out.println(crud.eliminar(sc.nextLine()) ? "Eliminado" : "No encontrado");
                        break;

                    case 7:
                        System.out.println("SERIALIZAR");
                        try {
                            String resultado1 = servicio.serializar(servicio.getAlimentos(), "", "sensores.bin");
                            System.out.println(resultado1);
                        } catch (Exception e) {
                            System.out.println("Error al guardar: " + e.getMessage());
                        }
                        break;

                    case 8:
                        System.out.println("Deserializar");
                        try {
                            Alimento[] cargados = servicio.deserializar("", "sensores.bin");

                            servicio.setAlimentos(cargados);

                            System.out.println("Alimentos cargados correctamente");

                            for (Alimento s : servicio.getAlimentos()) {
                                if (s != null) {
                                    System.out.println(s);
                                }
                            }

                        } catch (Exception e) {
                            System.out.println("Error al cargar: " + e.getMessage());
                        }
                        break;

                    case 9:
                        System.out.println("Saliendo...");
                        break;
                }

            } while (opcion != 9);

        } catch (Exception e) {
            System.out.println("Error general del sistema: " + e.getMessage());
        }
    }

    /**
     * Muestra información básica de un alimento.
     * 
     * @param alimento objeto a mostrar
     */
    public static void mostrarAlimento(Alimento alimento) {
        System.out.println("Nombre: " + alimento.getNombre());
        System.out.println("Clasificación: " + alimento.clasificarTamano());
    }

    /**
     * Crea un alimento de ejemplo.
     * 
     * @return objeto Alimento
     */
    public static Alimento crearAlimento() {
        return new Procesado("Galletas", "P-010", "2027-08-01", 300, "Galletas procesadas", 350, 12.0, "MEDIO");
    }
}