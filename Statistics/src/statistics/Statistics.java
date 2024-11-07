/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistics;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class Statistics {
    private int[] numeros;  // Array para almacenar os números introducidos polo usuario
    private int n;          // Número de elementos

    // Constructor para inicializar a clase
    public Statistics(int n) {
        this.n = n;
        this.numeros = new int[n];
    }

    // Método para solicitar os números ao usuario
    public void pedirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce " + n + " números:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    // Método para calcular a mediana sen ordenar o array
    public int median() {
        int mitad = n / 2;
        int menorOuIgual, maiorOuIgual;

        // Probar cada elemento do array como posible mediana
        for (int i = 0; i < n; i++) {
            menorOuIgual = 0;
            maiorOuIgual = 0;

            // Contar cantos números son menores ou iguais e cantos son maiores ou iguais
            for (int j = 0; j < n; j++) {
                if (numeros[j] <= numeros[i]) {
                    menorOuIgual++;
                }
                if (numeros[j] >= numeros[i]) {
                    maiorOuIgual++;
                }
            }

            // Verificar se o número actual é mediana
            if (menorOuIgual > mitad && maiorOuIgual > mitad) {
                return numeros[i];
            }
        }
        
        // Se por algún motivo non se atopou, devolve -1 (non debería ocorrer)
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuario que introduza un número impar de elementos
        int n;
        while (true) {
            System.out.print("Introduce o número impar de elementos: ");
            n = scanner.nextInt();
            
            if (n % 2 == 1) { // Verificar que o número é impar
                break;
            } else {
                System.out.println("Por favor, introduce un número impar.");
            }
        }

        // Crear a instancia da clase e obter os números
        Statistics stats = new Statistics(n);
        stats.pedirNumeros();

        // Calcular e mostrar a mediana
        int mediana = stats.median();
        System.out.println("A mediana é: " + mediana);
    }
}