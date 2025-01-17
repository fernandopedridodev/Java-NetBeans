/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 * Creamos unha clase Radio, extendida dende a clase Canario e implementamos o método Speaker
 */
public class Tweety extends Canario implements Speaker {

    public String numberOfFilms;

    public Tweety(String numberOfFilms, String sing, String sex, int age) {
        super(sing, sex, age);
        this.numberOfFilms = numberOfFilms;
    }

    @Override
    public void speak() {
        System.out.println("Ola, son Piolín e sei falar");
        System.out.println("Peliculas: " + numberOfFilms);
        System.out.println("Sexo: " + sex);
        System.out.println("Canto: " + sing);
        System.out.println("Idade: " + age);
    }

}
