package Respostaloxica;

/**
 *
 * @author fernando.pedridomarino
 */
public class Respostaloxica {
    public static void main(String[] args) {
        // Expresión lóxica: 3+5<5*2|3>8&7>6-2
        
        // Desglose e evaluación
        boolean resultado = (3 + 5 < 5 * 2) | (3 > 8) & (7 > 6 - 2);
        // Utilicei un boolrano xa que evaluamos unha expresión lóxica con operadores lóxicos como & e | e polo tanto sempre buscaremos un true ou false
        // Mostrando o resultado
        System.out.println("O resultado da expresión lóxica é: " + resultado);
    }
}
