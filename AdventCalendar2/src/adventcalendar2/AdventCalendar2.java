/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventcalendar2;

/**
 *
 * @author fernando.pedridomarino
 */
public class AdventCalendar2 {
    // Constantes para o número de filas e columnas
    private static final int ROWS = 6;
    private static final int COLUMNS = 4;

    private int[][] days; // Matriz de ROWS x COLUMNS que representa os días do calendario

    // Constructor que inicializa a matriz de ROWS x COLUMNS
    public AdventCalendar2() {
        days = new int[ROWS][COLUMNS];
    }

    // Método para encher o calendario con valores únicos entre 1 e 24
    public void fill() {
        int value = 1; // Comezamos en 1
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (value <= 24) { // Só enchemos ata 24
                    days[i][j] = value;
                    value++;
                } else {
                    days[i][j] = 0; // O resto das posicións quedan a 0
                }
            }
        }
    }

    // Método para amosar a matriz na consola
    public void show() {
        System.out.println("Estado do calendario:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(days[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para comer o día co menor valor non cero
    public void eat() {
        int minRow = 0;
        int minCol = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (days[i][j] != 0 && days[i][j] < minValue) {
                    minValue = days[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        if (minValue != Integer.MAX_VALUE) {
            days[minRow][minCol] = 0;
            System.out.println("Comiches o día " + minValue);
        }
    }

    // Método para verificar se todos os elementos da matriz están a cero
    public boolean christmasIsHere() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (days[i][j] != 0) {
                    return false; // Se hai algún elemento distinto de cero, devolve false
                }
            }
        }
        System.out.println("Chegou o Nadal! Todos os días están comidos.");
        return true;
    }

    // Método principal para probar a clase
    public static void main(String[] args) {
        AdventCalendar2 calendario = new AdventCalendar2();

        // Encher o calendario e mostrar o seu estado inicial
        calendario.fill();
        System.out.println("Calendario de advento inicial:");
        calendario.show();

        // Comer elementos ata que o calendario quede baleiro
        while (!calendario.christmasIsHere()) {
            calendario.eat();
            calendario.show();
        }
    }
}