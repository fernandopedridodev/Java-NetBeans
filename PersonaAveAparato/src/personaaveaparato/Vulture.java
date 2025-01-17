/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class Vulture extends Ave implements Speaker{

    public int flightSpeed;
    public int weight;

    public Vulture(int flightSpeed, int weight, String sex, int age) {
        super(sex, age);
        this.flightSpeed = flightSpeed;
        this.weight = weight;
    }

    @Override
    public void speak() {
    }
    
}
