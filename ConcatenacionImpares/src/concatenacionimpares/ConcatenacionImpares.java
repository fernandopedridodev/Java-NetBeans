/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concatenacionimpares;

/**
 *
 * @author fernando.pedridomarino
 */
public class ConcatenacionImpares {
public static void main(String[] args) {
        int numero = 1; // Inicializamos o primeiro número impar
        int contador = 0; // Inicializamos o contador de números impares
        
        // Bucle que imprime os dez primeiros números impares
        while (contador < 10) {
            System.out.println(numero);
            numero += 2; // Sumamos 2 para obter o seguinte número impar
            contador++;  // Incrementamos o contador
        }
    }
}