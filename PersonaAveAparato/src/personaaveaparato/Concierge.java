/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class Concierge extends Persona implements Speaker{

    public String turn;
    public String seniority;

    public Concierge(String turn, String seniority, String name, int age) {
        super(name, age);
        this.turn = turn;
        this.seniority = seniority;
    }

    @Override
    public void speak() {
    }
}
