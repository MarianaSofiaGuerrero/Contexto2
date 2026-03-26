package co.edu.poli.contexto2.vista;

import co.edu.poli.contexto2.modelo.*;
import co.edu.poli.contexto2.servicios.Enlatado;
import co.edu.poli.contexto2.servicios.ImplementacionOperacionCRUD;

public class Principal {

    public static void main(String[] args) {

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


        // PRUEBA CRUD
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


        // MOSTRAR TODOS LOS ALIMENTOS DESDE EL CRUD

        System.out.println("\n ALIMENTOS ACTUALIZADOS");
        for (Alimento a : crud.getAlimentos()) {
            if (a != null) {
                a.mostrarInfo();
            }
        }


        // RESTO DE CÓDIGO

        Alimento[] misAlimentos = {sopa, fruta};
        Inventario bodega = new Inventario("Bodega Alfa", 500, misAlimentos);

        System.out.println("\n REPORTE DE CONTROL ESPACIAL ");
        System.out.println("Inventario: " + bodega.getNombre());
        System.out.println("Alimento Procesado: " + sopa.getNombre());
        System.out.println("Alimento Deshidratado: " + fruta.getNombre());

        System.out.println("\n ANALISIS DE ENLATADOS ");
        System.out.println("Nivel de Sodio actual: " + Enlatado.nivelSodio);
        if (Enlatado.esAltoenSodio()) {
            System.out.println("ALERTA: El sistema reporta niveles altos de sodio.");
        }

        // SOBREESCRITURA
        System.out.println("\n SOBRESCRITURA DE METODOS ");
        for (Alimento a : misAlimentos) {
            System.out.println(a.getNombre() + " -> " + a.clasificarTamano());
        }

        // SOBRECARGA
        System.out.println("\n SOBRECARGA DE METODOS ");
        System.out.println("Clasificacion usando peso del objeto: " + sopa.clasificarTamano());
        System.out.println("Clasificacion usando peso enviado: " + sopa.clasificarTamano(750));

        // REGISTRO
        System.out.println("\n REGISTROS DEL SISTEMA ");
        Registro r1 = new Registro("2026-03-10","Registro Bodega","Control Inventario","08:00",200);
        Registro r2 = new Registro("2026-03-10","Registro Consumo","Control Alimentos","12:00",150);
        Registro r3 = new Registro("2026-03-10","Registro Inspección","Control Calidad","18:00",300);
        Registro r4 = new Registro("2026-03-10","Registro Inspección","Control Calidad","18:00",300);
        Registro r5 = new Registro("2026-03-10","Registro Inspección","Control Calidad","18:00",300);

        System.out.println("Total de registros creados: " + Registro.getContadorRegistros());

        // ACTIVIDAD 6
        Alimento[] alimentos = new Alimento[5];
        alimentos[0] = sopa;
        alimentos[1] = fruta;

        Procesado jugo = new Procesado("Jugo","003","12/03/2026",2,"Jugo procesado",400,10,"BAJO");
        alimentos[2] = jugo;

        System.out.println("\n ARREGLO DE LA SUPERSUPERCLASE ");
        for (Alimento a : alimentos) {
            if (a != null) {
                System.out.println(a.toString());
            }
        }

        // POLIMORFISMO
        mostrarAlimento(sopa);

        Alimento nuevoAlimento = crearAlimento();
        System.out.println("\n METODO QUE RETORNA SUPERSUPERCLASE");
        System.out.println(nuevoAlimento.toString());
    }

    public static void mostrarAlimento(Alimento alimento) {
        System.out.println("\n METODO CON PARAMETRO (POLIMORFISMO)");
        System.out.println("Nombre: " + alimento.getNombre());
        System.out.println("Clasificación: " + alimento.clasificarTamano());
    }

    public static Alimento crearAlimento() {
        Procesado galletas = new Procesado("Galletas","P-010","2027-08-01",300,"Galletas procesadas",350,12.0,"MEDIO");

        System.out.println("\n EXPLICACION DEL PUNTO 3");
        System.out.println("1. Atributo final: paisOrigen en la clase Alimento (no se puede modificar)");
        System.out.println("2. Metodo final: mostrarInformacionBase() en la clase Alimento (no se puede sobrescribir)");
        System.out.println("3. Clase final: Registro (no permite herencia)");

        return galletas;
    }
}