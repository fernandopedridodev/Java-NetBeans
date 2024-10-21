/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialproba;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;
/**
 * A clase FactorialProba calcula o factorial dun número enteiro.
 */
public class FactorialProba {

    /**
     * O método main pide ao usuario un número e calcula o factorial dese número.
     * @param args non utilizado
     */
    public static void main(String[] args) {
        // Crear un escáner para ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuario que introduza un número enteiro
        System.out.print("Introduce un número enteiro: ");
        int numero = scanner.nextInt();
        
        // Verificar que o número é non negativo
        if (numero < 0) {
            System.out.println("Non se pode calcular o factorial dun número negativo.");
        } else {
            // Inicializar o resultado a 1, que será o factorial
            int factorial = 1;
            int i = 1;
            
            // Calcular o factorial usando un bucle while
            while (i <= numero) {
                factorial *= i; // Multiplicar o valor actual de factorial por i
                i++; // Incrementar o contador
            }
            
            // Imprimir o resultado
            System.out.println("O factorial de " + numero + " é: " + factorial);
        }
        
        // Pechar o escáner
        scanner.close();
    }
}