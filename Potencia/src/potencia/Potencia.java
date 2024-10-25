/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencia;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir os dous números ao usuario
        System.out.print("Introduce o primeiro número (base): ");
        int number1 = scanner.nextInt();
        
        System.out.print("Introduce o segundo número (exponente): ");
        int number2 = scanner.nextInt();

        // Variable para almacenar o resultado
        int resultado = 1;

        // Bucle para calcular number1 elevado a number2
        for (int i = 1; i <= number2; i++) {
            resultado *= number1;  // Multiplicamos number1 por si mesmo number2 veces
        }

        // Mostrar o resultado
        System.out.println(number1 + " elevado a " + number2 + " é: " + resultado);

        scanner.close();
    }
}
