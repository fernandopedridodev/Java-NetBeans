/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 * *Creamos unha clase WashingMachine, extendida dende a clase Aparato
 */
public class WashingMachine extends Aparato {

    public int height;
    public int weight;

    public WashingMachine(int height, int weight, String consuption, int price) {
        super(consuption, price);
        this.height = height;
        this.weight = weight;
    }
}
