
package expresionloxica;

/**
 *
 * @author fernando.pedridomarino
 */
public class ExpresionLoxica {

public static void main(String[] args) {
        boolean resultado = (3 + 5 < 5 * 2) | (3 > 8 & 7 > 6 - 2);
        System.out.println("O resultado da expresión lóxica é: " + resultado);
    }
}
