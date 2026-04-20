package co.edu.poli.contexto2.vista;

import co.edu.poli.contexto2.modelo.*;
import co.edu.poli.contexto2.servicios.Enlatado;
import co.edu.poli.contexto2.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.contexto2.servicios.OperacionArchivo;
import java.util.Scanner;

/**
 * Clase principal del sistema.
 * 
 * <p>
 * Se encarga de ejecutar todas las funcionalidades del programa,
 * incluyendo pruebas de CRUD, polimorfismo, manejo de registros,
 * y un menú interactivo con persistencia en archivo binario (.bin).
 * </p>
 * 
 * <p>
 * Además, implementa manejo de excepciones para evitar que la aplicación
 * termine de forma abrupta, capturando los errores provenientes de la
 * capa de servicios y mostrando mensajes claros al usuario.
 * </p>
 */
public class Principal {

    /**
     * Método principal que inicia la ejecución del sistema.
     * 
     * <p>
     * Controla el flujo general del programa, ejecuta pruebas iniciales
     * y gestiona un menú interactivo para realizar operaciones CRUD y
     * manejo de archivos.
     * </p>
     * 
     * <p>
     * Se implementa un bloque try-catch global para capturar excepciones
     * y evitar la terminación inesperada del sistema.
     * </p>
     * 
     * @param args Argumentos de la línea de comandos
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

            // CREAR
            crud.crear(sopa);
            crud.crear(fruta);
            crud.crear(atun);

            // CONSULTAR
            System.out.println("\n CONSULTAR P-001 ");
            Alimento resultado = crud.consultar("P-001");
            if (resultado != null) {
                resultado.mostrarInfo();
            } else {
                System.out.println("No encontrado");
            }

            // ACTUALIZAR
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

            // ELIMINAR
            System.out.println("\n ELIMINAR D-001 ");
            boolean eliminado = crud.eliminar("D-001");
            System.out.println(eliminado ? "Eliminado correctamente" : "No encontrado");

            // MOSTRAR
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
            System.out.println(nuevoAlimento.toString());

            crud = new ImplementacionOperacionCRUD();

            Scanner sc = new Scanner(System.in);
            OperacionArchivo archivo = new OperacionArchivo();
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
                        System.out.println(archivo.serializar(crud.getAlimentos()));
                        break;

                    case 8:
                        Alimento[] datos = archivo.deserializar();
                        crud = new ImplementacionOperacionCRUD();
                        for (Alimento a : datos) {
                            if (a != null) crud.crear(a);
                        }
                        System.out.println("Datos cargados desde archivo .bin");
                        break;

                    case 9:
                        System.out.println("Saliendo...");
                        break;
                }

            } while (opcion != 9);

        } catch (Exception e) {
            System.out.println(" Error general del sistema: " + e.getMessage());
            System.out.println (" Opción Inválida. Reinicie el Sistema");
        }
    }

    public static void mostrarAlimento(Alimento alimento) {
        System.out.println("Nombre: " + alimento.getNombre());
        System.out.println("Clasificación: " + alimento.clasificarTamano());
    }

    public static Alimento crearAlimento() {
        return new Procesado("Galletas","P-010","2027-08-01",300,"Galletas procesadas",350,12.0,"MEDIO");
    }
}