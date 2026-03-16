package co.edu.poli.contexto2.vista;

import co.edu.poli.contexto2.modelo.*;
import co.edu.poli.contexto2.servicios.Enlatado;

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
        
        
        // ACTIVIDAD 6
        // PUNTO1: ARREGLO DE TIPO SUPERSUPERCLASE
        Alimento[] alimentos = new Alimento[5];

        alimentos[0] = sopa;
        alimentos[1] = fruta;

        Procesado jugo = new Procesado(
                "Jugo",
                "003",
                "12/03/2026",
                2,
                "Jugo procesado",
                400,
                10,
                "BAJO"
        );

        alimentos[2] = jugo;

        System.out.println("\n ARREGLO DE LA SUPERSUPERCLASE ");

        for (Alimento a : alimentos) {
            if (a != null) {
                System.out.println(a.toString());
            }
        }
        
        // PUNTO2: POLIMORFISMO
        mostrarAlimento(sopa);

        Alimento nuevoAlimento = crearAlimento();
        System.out.println("\n MÉTODO QUE RETORNA SUPERSUPERCLASE");
        System.out.println(nuevoAlimento.toString());

    }

    // MÉTODO QUE RECIBE PARÁMETRO (POLIMORFISMO)
    public static void mostrarAlimento(Alimento alimento) {

        System.out.println("\n MÉTODO CON PARÁMETRO (POLIMORFISMO)");
        System.out.println("Nombre: " + alimento.getNombre());
        System.out.println("Clasificación: " + alimento.clasificarTamano());
    }

    // MÉTODO QUE RETORNA SUPERSUPERCLASE
    public static Alimento crearAlimento() {

        Procesado galletas = new Procesado(
                "Galletas",
                "P-010",
                "2027-08-01",
                300,
                "Galletas procesadas",
                350,
                12,
                "MEDIO"
        );
        
    //  PUNTO 3: COMENTARIOS DE LOS CAMBIOS

        System.out.println("\n EXPLICACIÓN DEL PUNTO 3");

        // 1. Atributo que no se puede cambiar
        System.out.println("1. Atributo final: paisOrigen en la clase Alimento (no se puede modificar)");

        // 2. Método que no se puede sobrescribir
        System.out.println("2. Método final: mostrarInformacionBase() en la clase Alimento (no se puede sobrescribir)");

        // 3. Clase que no se puede heredar
        System.out.println("3. Clase final: Registro (no permite herencia)");

        return galletas;
      
        


    }
}
