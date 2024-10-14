package imparoucen;

/**
 *
 * @author fernando.pedridomarino
 */
public class ImparOuCen {
    public static void main(String[] args) {
        // Definir o número enteiro
        int numero = 105; // Cambia este valor para probar con outros números

        // Verificar se o número é maior que 100 ou impar
        if (numero > 100 || numero % 2 != 0) {
            System.out.println("O número " + numero + " cumpre a condición");
        } else {
            System.out.println("O número " + numero + " non cumpre a condición");
        }
    }
}