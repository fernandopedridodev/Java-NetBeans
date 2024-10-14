package tresenteiros;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;
public class TresEnteiros {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir ao usuario os tres números enteiros
        System.out.print("Introduce o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce o terceiro número: ");
        int num3 = sc.nextInt();

        // Calcular cal é o maior dos tres
        int maior;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        // Amosar o maior número
        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}