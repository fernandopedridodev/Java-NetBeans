/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
*Creamos unha clase Radio, extendida dende a clase Aparato e implementamos o método Speaker
*/


public class Radio extends Aparato implements Speaker{

    public boolean cassette;
    public int power;

    public Radio(boolean cassette, int power, String consuption, int price) {
        super(consuption, price);
        this.cassette = cassette;
        this.power = power;
    }

    @Override
    public void speak() {
        System.out.println("Ola, son unha Radio e sei falar");
        System.out.println("Cassette: " + cassette);
        System.out.println("Potencia: " + power);
        System.out.println("Consumo: " + consuption);
        System.out.println("Prezo: " + price);
}
}
