/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taboamultiplicar;

/**
 *
 * @author fernando.pedridomarino
 */

   // Clase Table que representa unha táboa de multiplicar
class Table {
    // Atributo constante que almacena o número da táboa de multiplicar
    private final int number;

    // Constructor da clase Table
    public Table(int number) {
        this.number = number;
    }

    // Método que mostra a táboa de multiplicar en pantalla
    public void show() {
        System.out.println("Táboa de multiplicar do " + number + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println(); // Espazo para separar as táboas de multiplicar
    }
}

// Clase principal que contén o método main
public class Main {
    public static void main(String[] args) {
        // Bucle para crear e mostrar as táboas de multiplicar do 1 ao 9
        for (int i = 1; i <= 9; i++) {
            // Crear obxecto Table para cada número e mostrar a táboa de multiplicar
            new Table(i).show();
        }
    }
}