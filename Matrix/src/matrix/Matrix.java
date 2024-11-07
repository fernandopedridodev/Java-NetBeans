/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class Matrix {
    private int[][] data;

    // Constructor que inicializa unha matriz 3x3 con ceros
    public Matrix() {
        data = new int[3][3];
    }

    // Método para pedir os valores da matriz por teclado
    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
                data[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para amosar a matriz na consola
    public void display() {
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para sumar a matriz actual con outra matriz e retornar o resultado
    public Matrix sum(Matrix other) {
        Matrix result = new Matrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Método principal
    public static void main(String[] args) {
        // Crear e inicializar dúas matrices pedindo valores por teclado
        Matrix matriz1 = new Matrix();
        Matrix matriz2 = new Matrix();

        System.out.println("Introduce os valores para a primeira matriz:");
        matriz1.inputMatrix();

        System.out.println("Introduce os valores para a segunda matriz:");
        matriz2.inputMatrix();

        // Sumar as dúas matrices
        Matrix matrizResultado = matriz1.sum(matriz2);

        // Amosar o resultado da suma
        System.out.println("Resultado da suma das dúas matrices:");
        matrizResultado.display();
    }
}