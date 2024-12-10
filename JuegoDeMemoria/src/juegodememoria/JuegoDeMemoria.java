/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegodememoria;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.*;

public class JuegoDeMemoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] cartas = {{"A", "B", "C", "D"}, {"A", "B", "C", "D"}};
        Collections.shuffle(Arrays.asList(cartas[0]));
        Collections.shuffle(Arrays.asList(cartas[1]));
        String[][] tablero = new String[2][4];
        for (int i = 0; i < 2; i++) Arrays.fill(tablero[i], "*");

        int intentos = 0, paresEncontrados = 0;
        while (paresEncontrados < 4) {
            System.out.println("Tablero:");
            for (String[] fila : tablero) System.out.println(Arrays.toString(fila));

            System.out.println("Elige dos posiciones (fila columna):");
            int f1 = scanner.nextInt(), c1 = scanner.nextInt();
            int f2 = scanner.nextInt(), c2 = scanner.nextInt();

            if (tablero[f1][c1].equals("*") && tablero[f2][c2].equals("*")) {
                tablero[f1][c1] = cartas[f1][c1];
                tablero[f2][c2] = cartas[f2][c2];

                if (!tablero[f1][c1].equals(tablero[f2][c2])) {
                    tablero[f1][c1] = "*";
                    tablero[f2][c2] = "*";
                } else {
                    paresEncontrados++;
                }
                intentos++;
            }
        }
        System.out.println("¡Felicidades! Encontraste todos los pares en " + intentos + " intentos.");
    }
}