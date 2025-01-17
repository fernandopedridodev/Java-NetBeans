/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 * Creamos unha clase abstracta Ave, que logo sera extendida en outras, con atributos base
 */
public abstract class Ave {

    protected String sex;
    protected int age;

    public Ave(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }
}
