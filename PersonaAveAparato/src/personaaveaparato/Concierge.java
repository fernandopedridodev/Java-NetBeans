/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 *Creamos unha clase Concierge, extendida dende a clase Persona e implementamos o método Speaker
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
        System.out.println("Ola, son un Bedel e sei falar");
        System.out.println("Nome: " + name);
        System.out.println("Turno: " + turn);
        System.out.println("Antigüidade: " + seniority);
        System.out.println("Idade: " + age);
    }
}
