/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
 public abstract class Aparato {

    protected String consuption;
    protected int price;

    public Aparato(String consuption, int price) {
        this.consuption = consuption;
        this.price = price;
    }
}
