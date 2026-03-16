package co.edu.poli.contexto2.vista;

import co.edu.poli.contexto2.modelo.*;
import co.edu.poli.contexto2.servicios.Enlatado;

public class Principal {

    public static void main(String[] args) {

        Enlatado.nivelSodio = 500.0;
        Enlatado atun = new Enlatado();
        atun.setMaterialEnvase("lata");

        Procesado sopa = new Procesado(
                "Sopa de Tomate",
                "P-001",
                "2027-05-20",
                500,
                "Sopa instantánea",
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
                "Liofilización"
        );

        Alimento[] misAlimentos = {sopa, fruta};
        Inventario bodega = new Inventario("Bodega Alfa", 500, misAlimentos);

        System.out.println(" REPORTE DE CONTROL ESPACIAL ");
        System.out.println("Inventario: " + bodega.getNombre());
        System.out.println("Alimento Procesado: " + sopa.getNombre());
        System.out.println("Alimento Deshidratado: " + fruta.getNombre());

        System.out.println("\n ANÁLISIS DE ENLATADOS ");
        System.out.println("Nivel de Sodio actual: " + Enlatado.nivelSodio);

        if (Enlatado.esAltoenSodio()) {
            System.out.println("ALERTA: El sistema reporta niveles altos de sodio.");
        }

        // SOBREESCRITURA
        System.out.println("\n SOBRESCRITURA DE MÉTODOS ");

        for (Alimento a : misAlimentos) {
            System.out.println(a.getNombre() + " -> " + a.clasificarTamano());
        }

        // SOBRECARGA
        System.out.println("\n SOBRECARGA DE MÉTODOS ");

        System.out.println("Clasificación usando peso del objeto: " + sopa.clasificarTamano());
        System.out.println("Clasificación usando peso enviado: " + sopa.clasificarTamano(750));

        // REGISTRO
        System.out.println("\n REGISTROS DEL SISTEMA ");

        Registro r1 = new Registro(
                "2026-03-10",
                "Registro Bodega",
                "Control Inventario",
                "08:00",
                200
        );

        System.out.println(Registro.getContadorRegistros());

        Registro r2 = new Registro(
                "2026-03-10",
                "Registro Consumo",
                "Control Alimentos",
                "12:00",
                150
        );

        System.out.println(Registro.getContadorRegistros());

        Registro r3 = new Registro(
                "2026-03-10",
                "Registro Inspección",
                "Control Calidad",
                "18:00",
                300
        );

        Registro r4 = new Registro(
                "2026-03-10",
                "Registro Inspección",
                "Control Calidad",
                "18:00",
                300
        );

        System.out.println(Registro.getContadorRegistros());

        Registro r5 = new Registro(
                "2026-03-10",
                "Registro Inspección",
                "Control Calidad",
                "18:00",
                300
        );

        System.out.println(Registro.getContadorRegistros());

        System.out.println(Registro.getContadorRegistros());

        System.out.println("\nTotal de registros creados: " + Registro.getContadorRegistros());

        // DEMOSTRACIÓN DEL ATRIBUTO ESTÁTICO
        System.out.println("\n DEMOSTRACIÓN DEL ATRIBUTO ESTÁTICO ");

        System.out.println("Valor del contador desde r1: " + r1.getContadorRegistros());
        System.out.println("Valor del contador desde r2: " + r2.getContadorRegistros());
        System.out.println("Valor del contador desde r3: " + r3.getContadorRegistros());
        System.out.println("Valor del contador desde r4: " + r4.getContadorRegistros());
        System.out.println("Valor del contador desde r5: " + r5.getContadorRegistros());

        System.out.println("Valor del contador desde la clase Registro: " + Registro.getContadorRegistros());

    }
}
