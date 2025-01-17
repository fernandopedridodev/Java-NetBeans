/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 * *Creamos unha clase TV, extendida dende a clase Aparato e implementamos o método Speaker
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
        System.out.println("Ola, son unha TV e sei falar");
        System.out.println("Teletexto: " + teletext);
        System.out.println("Consumo: " + consuption);
        System.out.println("Pulgadas: " + inches);
        System.out.println("Prezo: " + price);
    
}
}