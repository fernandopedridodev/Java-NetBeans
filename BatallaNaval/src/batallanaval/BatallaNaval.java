/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batallanaval;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.*;

public class BatallaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[5][5];
        for (char[] fila : tablero) Arrays.fill(fila, '-');

        Random random = new Random();
        int barcoFila = random.nextInt(5);
        int barcoColumna = random.nextInt(5);

        int intentos = 0;
        while (true) {
            System.out.println("Tablero:");
            for (char[] fila : tablero) System.out.println(Arrays.toString(fila));

            System.out.println("Adivina la posición del barco (fila columna):");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            intentos++;
            if (fila == barcoFila && columna == barcoColumna) {
                System.out.println("¡Hundiste el barco en " + intentos + " intentos!");
                break;
            } else {
                tablero[fila][columna] = 'X';
                System.out.println("¡Fallaste!");
            }
        }
    }
}
