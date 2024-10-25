/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamultiploscinco2;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class SumaMultiplosCinco2 {

    public static void main(String[] args) {
        // Crear objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los dos números
        System.out.print("Introduce el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = scanner.nextInt();

        // Verificar si 'a' es mayor que 'b' para mostrar un error
        if (a > b) {
            System.out.println("Error: El primer número (a) no puede ser mayor que el segundo número (b).");
        } else {
            // Calcular la suma de los múltiplos de 5 entre a y b
            int suma = 0;
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0) {
                    suma += i;
                }
            }

            // Mostrar el resultado
            System.out.println("La suma de los múltiplos de 5 entre " + a + " y " + b + " es: " + suma);
        }

        // Cerrar el objeto scanner
        scanner.close();
    }
}