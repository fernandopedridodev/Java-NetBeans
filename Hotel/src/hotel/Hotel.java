package hotel;

/**
 *
 * @author fernando.pedridomarino
 * @param int para pedir a idade
 * @param double para pedir o prezo
 */
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        // Crear un obxecto Scanner para ler a entrada do usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar a idade do cliente
        System.out.print("Introduce a túa idade: ");
        int idade = scanner.nextInt();
        
        // Variable para saber se o cliente ten algún carné que lle permita desconto
        boolean tenCarnet = false;

        // Verificar condicións segundo a idade
        if (idade < 30) {
            System.out.print("Tes carné universitario ou estás no paro? (si/n): ");
            tenCarnet = scanner.next().equalsIgnoreCase("si");
        } else if (idade > 55) {
            System.out.print("Tes carné de xubilado ou estás no paro? (si/n): ");
            tenCarnet = scanner.next().equalsIgnoreCase("si");
        } else {
            System.out.print("Tes carné de familia numerosa? (si/n): ");
            tenCarnet = scanner.next().equalsIgnoreCase("si");
        }
        
        // Variable para gardar o prezo final
        int prezo = 0;

        // Calcular o prezo en función da idade e os descontos aplicables
        if (idade < 30) {
            if (tenCarnet) {
                prezo = 40;
            } else {
                prezo = 50;
            }
        } else if (idade > 55) {
            if (tenCarnet) {
                prezo = 45;
            } else {
                prezo = 60;
            }
        } else {
            if (tenCarnet) {
                prezo = 65;
            } else {
                prezo = 75;
            }
        }

        // Mostrar o prezo final
        System.out.println("O custo do cuarto é: " + prezo + "€");

        // Pechar o scanner
        scanner.close();
    }
}

