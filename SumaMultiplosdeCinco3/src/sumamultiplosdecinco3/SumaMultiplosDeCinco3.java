/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumamultiplosdecinco3;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class SumaMultiplosDeCinco3 {

    public static void main(String[] args) {
        // Crear obxecto Scanner para recibir a entrada do usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuario que introduza os dous números
        System.out.print("Introduce o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce o segundo número (b): ");
        int b = scanner.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Os numeros deben de ser positivos.");
            
        } else {
        
                
        // Verificar se 'a' é maior que 'b' para intercambialos
        if (a > b) {
            // Intercambiar os valores de 'a' e 'b' usando unha variable temporal
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Intercambiaronse os valores. Agora a = " + a + " y b = " + b + ".");
        }

        // Calcular a suma dos múltiplos de 5 entre a e b
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }

        // Mostrar o resultado
        System.out.println("A suma dos múltiplos de 5 entre " + a + " e " + b + " é: " + suma);

        // Pechar o obxecto scanner
        scanner.close(); 
        }
    }
}
