/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multascovelo;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultasCovelo {

    // Mapeo de causas de multa a sus valores
    private static final Map<String, Integer> multas = new HashMap<>();

    // Mapeo para almacenar las multas acumuladas por jugador
    private static final Map<String, Integer> multasPorJugador = new HashMap<>();

    static {
        multas.put("LLEGAR TARDE A LOS ENTRENAMIENTOS", 1);
        multas.put("LLEGAR TARDE A LAS CONVOCATORIAS", 2);
        multas.put("FALTAR A UN ENTRENAMIENTO", 3);
        multas.put("FALTAR A UNA CONVOCATORIA", 5);
        multas.put("TARJETA AMARILLA", 3);
        multas.put("SEGUNDA TARJETA AMARILLA", 5);
        multas.put("TARJETA ROJA DIRECTA", 10);
        multas.put("OLVIDO DE ROPA O MATERIAL", 2);
        multas.put("USO DEL TELEFONO MOVIL", 2);
        multas.put("NO UNIFORMIDAD EN PARTIDOS", 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir multa a un jugador");
            System.out.println("2. Ver multas acumuladas por jugador");
            System.out.println("3. Modificar multas de un jugador");
            System.out.println("4. Salir");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    registrarMulta(scanner);
                    break;
                case "2":
                    mostrarMultas();
                    break;
                case "3":
                    modificarMulta(scanner);
                    break;
                case "4":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }

    private static void registrarMulta(Scanner scanner) {
        System.out.println("Introduzca el nombre del jugador:");
        String jugador = scanner.nextLine();

        System.out.println("Introduzca la causa de la multa (por ejemplo: LLEGAR TARDE A LOS ENTRENAMIENTOS):");
        String causa = scanner.nextLine().toUpperCase();

        // Verificar si la causa está en la lista
        if (multas.containsKey(causa)) {
            int monto = multas.get(causa);

            // Actualizar el monto total del jugador
            multasPorJugador.put(jugador, multasPorJugador.getOrDefault(jugador, 0) + monto);

            System.out.println("El jugador " + jugador + " debe pagar una multa de " + monto + "€ por: " + causa);
        } else {
            System.out.println("La causa de la multa no es válida. Por favor, verifique las normas.");
        }
    }

    private static void mostrarMultas() {
        if (multasPorJugador.isEmpty()) {
            System.out.println("No hay multas registradas.");
        } else {
            System.out.println("Multas acumuladas por jugador:");
            for (Map.Entry<String, Integer> entry : multasPorJugador.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "€");
            }
        }
    }

    private static void modificarMulta(Scanner scanner) {
        System.out.println("Introduzca el nombre del jugador cuyo monto desea modificar:");
        String jugador = scanner.nextLine();

        if (multasPorJugador.containsKey(jugador)) {
            System.out.println("El monto actual de multas para " + jugador + " es: " + multasPorJugador.get(jugador) + "€");
            System.out.println("Introduzca el nuevo monto total de multas para este jugador:");
            try {
                int nuevoMonto = Integer.parseInt(scanner.nextLine());
                multasPorJugador.put(jugador, nuevoMonto);
                System.out.println("El monto ha sido actualizado. El nuevo total de multas para " + jugador + " es: " + nuevoMonto + "€");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, introduzca un número entero.");
            }
        } else {
            System.out.println("El jugador no tiene multas registradas.");
        }
    }
}
