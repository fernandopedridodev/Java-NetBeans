/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primonumber;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;
public class PrimoNumber {

    // Método para comprobar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  // Números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {  // Solo comprobamos hasta la raíz cuadrada del número
            if (numero % i == 0) {
                return false;  // Si es divisible por algún número, no es primo
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Bucle que sigue pidiendo números hasta que se introduzca un cero
        do {
            System.out.print("Introduce un número enteiro (0 para saír): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (esPrimo(numero)) {
                    System.out.println("O número é primo.");
                } else {
                    System.out.println("O número non é primo.");
                }
            }
        } while (numero != 0);

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}