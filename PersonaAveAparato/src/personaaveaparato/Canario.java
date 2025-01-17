/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class Canario extends Ave {

    public String sing;

    public Canario(String sing, String sex, int age) {
        super(sex, age);
        this.sing = sing;
    }
}
