/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexame2.memorygame;

/**
 *
 * @author fernando.pedridomarino
 */
// Xeramos unha Clase para definir os elementos que serán as cartas nun array que implementa a interfaz CardGenerator
public class ArrayCardGenerator implements CardGenerator{
    private static final String[] words = new String[]{"Boi", "Vaca", "Nubeiro"};
    private static final int[] operators1 = new int[]{4, 7, 6};
    private static final int[] operators2 = new int[]{9, 5, 7};
    private static final char[] operation = new char[]{MathCard.SUM, MathCard.MULT, MathCard.SUB};
//Sobrecargamos co metodo generateCards herdado da interfaz CardGeneratorS
    @Override
    public void generateCards() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
