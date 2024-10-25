package sumamultiplosde5;
import java.util.Scanner;
public class SumaMultiplosDe5 {

     public static void main(String[] args) {
        // Crear objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los dos números
        System.out.print("Introduce el primer número (a): ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = scanner.nextInt();

        // Verificar cuál número es mayor para establecer el rango correctamente
        int menor, mayor;
        if (a < b) {
            menor = a;
            mayor = b;
        } else {
            menor = b;
            mayor = a;
        }

        // Calcular la suma de los múltiplos de 5 entre a y b
        int suma = 0;
        for (int i = menor; i <= mayor; i++) {
            if (i % 5 == 0) {
                suma += i;
            }
        }

        // Mostrar el resultado
        System.out.println("La suma de los múltiplos de 5 entre " + menor + " y " + mayor + " es: " + suma);

        // Cerrar el objeto scanner
        scanner.close();
    }
}