/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsmarks;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class StudentMarks {

    // Atributos: Array de notas e array de nomes, ambos de 10 elementos
    private int[] notas = new int[10];
    private String[] nomes = new String[10];

    /**
     * Constructor da clase StudentMarks.
     * Chama ao método privado para introducir os datos (nome e nota) por teclado.
     */
    public StudentMarks() {
        introducirDatos(); // Chamamos ao método que pide nomes e notas
    }

    /**
     * Método privado que permite introducir os nomes e notas por teclado.
     * Utiliza un bucle para solicitar os datos de cada alumno e almacenalos nos arrays.
     */
    private void introducirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce o nome e a nota de cada un dos 10 alumnos:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do alumno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine(); // Lemos e almacenamos o nome

            System.out.print("Nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextInt(); // Lemos e almacenamos a nota
            scanner.nextLine(); // Limpiamos o salto de liña
        }
        
        scanner.close(); // Pechamos o scanner despois de recoller os datos
    }

    /**
     * Método que devolve o nome do alumno con peor nota.
     *
     * @return O nome do alumno con peor nota.
     */
    public String min() {
        int minNota = notas[0];
        int minIndex = 0;

        // Bucle para atopar a nota mínima e o seu índice correspondente
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < minNota) {
                minNota = notas[i];
                minIndex = i;
            }
        }
        
        return nomes[minIndex]; // Devolvemos o nome do alumno con peor nota
    }

    /**
     * Método que devolve o nome do alumno con mellor nota.
     *
     * @return O nome do alumno con mellor nota.
     */
    public String max() {
        int maxNota = notas[0];
        int maxIndex = 0;

        // Bucle para atopar a nota máxima e o seu índice correspondente
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maxNota) {
                maxNota = notas[i];
                maxIndex = i;
            }
        }
        
        return nomes[maxIndex]; // Devolvemos o nome do alumno con mellor nota
    }

    /**
     * Método principal para probar a clase StudentMarks.
     * Crea unha instancia de StudentMarks e mostra o alumno con mellor e peor nota.
     */
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks(); // Creamos unha instancia da clase
        System.out.println("O alumno con peor nota é: " + studentMarks.min());
        System.out.println("O alumno con mellor nota é: " + studentMarks.max());
    }
}
