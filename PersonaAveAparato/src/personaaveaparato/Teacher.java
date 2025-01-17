/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class Teacher extends Persona implements Speaker{

    public String office;
    public String email;

    public Teacher(String office, String email, String name, int age) {
        super(name, age);
        this.office = office;
        this.email = email;
    }

    @Override
    public void speak() {
    }

}
