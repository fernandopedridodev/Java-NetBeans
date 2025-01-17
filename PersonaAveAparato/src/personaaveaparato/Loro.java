/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class Loro extends Ave implements Speaker{

    public String region;
    public String color;

    public Loro(String region, String color, String sex, int age) {
        super(sex, age);
        this.region = region;
        this.color = color;
    }

   

    @Override
    public void speak() {
        System.out.println("Ola, son un loro e sei falar");
}
}