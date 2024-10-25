/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplier;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class Multiplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir os dous números ao usuario
        System.out.print("Introduce o primeiro número (number1): ");
        int number1 = scanner.nextInt();
        
        System.out.print("Introduce o segundo número (number2): ");
        int number2 = scanner.nextInt();

        // Variable para almacenar o resultado
        int resultado = 0;

        // Bucle para calcular o produto de number1 por number2 como suma repetida
        for (int i = 1; i <= number2; i++) {
            resultado += number1;  // Sumamos number1 en cada iteración
        }

        // Mostrar o resultado
        System.out.println("O produto de " + number1 + " e " + number2 + " é: " + resultado);

        scanner.close();
    }
}