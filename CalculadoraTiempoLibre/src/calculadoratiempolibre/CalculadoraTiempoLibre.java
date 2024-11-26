/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoratiempolibre;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CalculadoraTiempoLibre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        // Solicitar la hora actual al usuario
        System.out.print("Introduce la hora actual (formato HH:mm): ");
        String horaActualInput = scanner.nextLine();

        // Validar y convertir la hora ingresada
        LocalTime horaActual;
        try {
            horaActual = LocalTime.parse(horaActualInput, timeFormatter);
        } catch (Exception e) {
            System.out.println("Formato de hora inválido. Por favor, utiliza el formato HH:mm.");
            return;
        }

        // Solicitar el tiempo de descanso en minutos
        System.out.print("Introduce el tiempo de descanso en minutos: ");
        int tiempoDescanso;
        try {
            tiempoDescanso = Integer.parseInt(scanner.nextLine());
            if (tiempoDescanso < 0) {
                System.out.println("El tiempo de descanso no puede ser negativo.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un número válido para el tiempo de descanso.");
            return;
        }

        // Calcular la hora de regreso
        LocalTime horaRegreso = horaActual.plusMinutes(tiempoDescanso);

        // Mostrar el resultado
        System.out.println("Debes volver al trabajo a las: " + horaRegreso.format(timeFormatter));
    }
}