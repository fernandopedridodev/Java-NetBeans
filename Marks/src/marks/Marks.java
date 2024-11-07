/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marks;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class Marks {
    
    // Atributo: Array de 10 elementos int para almacenar as notas dos alumnos
    private int[] notas = new int[10];

    /**
     * Constructor da clase Marks.
     * Chama ao método privado para introducir as notas por teclado.
     */
    public Marks() {
        introducirNotas(); // Método que solicita as notas e as almacena no array
    }

    /**
     * Método privado que permite introducir as notas por teclado.
     * Utiliza un bucle para pedir a nota de cada alumno e almacenala no array.
     */
    private void introducirNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce as notas de 10 alumnos:");
        
        // Bucle para introducir cada nota no array
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt(); // Lemos a nota e almacenámola no array
        }
        
        scanner.close(); // Pechamos o scanner despois de recoller as notas
    }

    /**
     * Método público que calcula e devolve a media das notas.
     *
     * @return A media das notas almacenadas no array.
     */
    public double getAverage() {
        int suma = 0;

        // Bucle para sumar todas as notas
        for (int nota : notas) {
            suma += nota; // Sumamos cada nota á suma total
        }
        
        // Calculamos a media dividindo a suma polo número de notas
        return suma / (double) notas.length;
    }

    /**
     * Método principal para probar a clase Marks.
     * Crea unha instancia de Marks e mostra a media das notas.
     * @param args
     */
    public static void main(String[] args) {
        Marks marks = new Marks(); // Creamos unha instancia de Marks
        System.out.println("A media das notas é: " + marks.getAverage()); // Mostramos a media
    }
}