/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
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
    }
}
