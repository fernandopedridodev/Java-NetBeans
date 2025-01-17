/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class TV extends Aparato implements Speaker{

    public boolean teletext;
    public int inches;

    public TV(boolean teletext, int inches, String consuption, int price) {
        super(consuption, price);
        this.teletext = teletext;
        this.inches = inches;
    }

    @Override
    public void speak() {
    }
    
}
