/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 * Creamos a clase abstracta Persona con atributos que logo se extenderán a outras
 */
public abstract class Persona {

    protected String name;
    protected int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
