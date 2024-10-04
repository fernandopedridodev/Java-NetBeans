/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusamaker;

/**
 *
 * @author fernando.pedridomarino
 */
public class HipotenusaMaker {
    /**
     * Imos crear un programa que sirva para calcular unha hipotenusa seguindo o teorema de Pitágoras
     * @param args
     */
    public static void main(String[] args) {
        // O primeiro e declarar as variables double que son os valores dos catetos
        double cateto1 = 4.0;
        double cateto2 = 6.0;

        // Para poder calcular correctamente a hipotenusa, debemos elevar os catetos ao cadrado
        double cateto1Squared = Math.pow(cateto1, 2);
        double cateto2Squared = Math.pow(cateto2, 2);
        double sumaCatetos = cateto1Squared + cateto2Squared;

        // Realizamos a raíz cadrada co método Math.sqrt para obter o resultado final
        double hipotenusa = Math.sqrt(sumaCatetos);

        // Mostramos o resultado na consola
        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}
