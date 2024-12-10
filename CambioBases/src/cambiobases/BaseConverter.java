/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiobases;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Conversor de Bases ---");
            System.out.println("1. Decimal a Binario, Octal y Hexadecimal");
            System.out.println("2. Binario a Decimal, Octal y Hexadecimal");
            System.out.println("3. Octal a Decimal, Binario y Hexadecimal");
            System.out.println("4. Hexadecimal a Decimal, Binario y Octal");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (choice) {
                case 1:
                    System.out.print("Introduce un número decimal: ");
                    int decimal = scanner.nextInt();
                    System.out.println("Binario: " + Integer.toBinaryString(decimal));
                    System.out.println("Octal: " + Integer.toOctalString(decimal));
                    System.out.println("Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
                    break;
                case 2:
                    System.out.print("Introduce un número binario: ");
                    String binario = scanner.nextLine();
                    int decimalBinario = Integer.parseInt(binario, 2);
                    System.out.println("Decimal: " + decimalBinario);
                    System.out.println("Octal: " + Integer.toOctalString(decimalBinario));
                    System.out.println("Hexadecimal: " + Integer.toHexString(decimalBinario).toUpperCase());
                    break;
                case 3:
                    System.out.print("Introduce un número octal: ");
                    String octal = scanner.nextLine();
                    int decimalOctal = Integer.parseInt(octal, 8);
                    System.out.println("Decimal: " + decimalOctal);
                    System.out.println("Binario: " + Integer.toBinaryString(decimalOctal));
                    System.out.println("Hexadecimal: " + Integer.toHexString(decimalOctal).toUpperCase());
                    break;
                case 4:
                    System.out.print("Introduce un número hexadecimal: ");
                    String hexadecimal = scanner.nextLine();
                    int decimalHex = Integer.parseInt(hexadecimal, 16);
                    System.out.println("Decimal: " + decimalHex);
                    System.out.println("Binario: " + Integer.toBinaryString(decimalHex));
                    System.out.println("Octal: " + Integer.toOctalString(decimalHex));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (choice != 5);

        scanner.close();
    }
}