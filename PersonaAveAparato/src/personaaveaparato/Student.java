/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 *Creamos unha claseStudent, extendida dende a clase Persona e implementamos o método Speaker
 */
public class Student extends Persona implements Speaker{

    public String career;
    public String course;

    public Student(String career, String course, String name, int age) {
        super(name, age);
        this.career = career;
        this.course = course;
    }

    @Override
    public void speak() {
    }

}
