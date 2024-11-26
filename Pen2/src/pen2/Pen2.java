/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pen2;

/**
 *
 * @author fernando.pedridomarino
 */
// Clase Pen
public class Pen2 {
    // Atributo de tinta inicializado a 30 unidades por defecto
    private int ink;

    // Constructor que inicializa a tinta a 30 unidades
    public Pen2() {
        this.ink = 30;
    }

    /**
     * Método para escribir un número de palabras.
     * Consome unha unidade de tinta por cada palabra escrita.
     * 
     * @param numWords Número de palabras a escribir.
     */
    public void write(int numWords) {
        if (numWords <= ink) {
            // Escribe as palabras e reduce a tinta
            for (int i = 1; i <= numWords; i++) {
                System.out.print("Palabra " + i + " ");
            }
            System.out.println("\nEscritura completada!");
            ink -= numWords;
        } else {
            // Mensaxe se non hai tinta suficiente
            System.out.println("Non hai tinta suficiente para escribir esa cantidade de palabras.");
        }
    }

    /**
     * Método para obter o estado do bolígrafo como cadea de texto.
     * 
     * @return Estado do bolígrafo.
     */
    @Override
    public String toString() {
        return "Bolígrafo con " + ink + " unidades de tinta restantes.";
    }

    // Método principal
    public static void main(String[] args) {
        // Crear un obxecto Pen
        Pen2 myPen = new Pen2();

        // Escribir 20 palabras
        System.out.println("Tentando escribir 20 palabras:");
        myPen.write(20);
        System.out.println(myPen); // Mostrar estado do bolígrafo

        // Escribir 15 palabras
        System.out.println("\nTentando escribir 15 palabras:");
        myPen.write(15);
        System.out.println(myPen); // Mostrar estado do bolígrafo

        // Escribir 6 palabras
        System.out.println("\nTentando escribir 6 palabras:");
        myPen.write(6);
        System.out.println(myPen); // Mostrar estado do bolígrafo
    }
}