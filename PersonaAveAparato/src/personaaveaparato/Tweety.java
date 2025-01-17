/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 */
public class Tweety extends Canario implements Speaker {

    public String numberOfFilms;

    public Tweety(String numberOfFilms, String sing, String sex, int age) {
        super(sing, sex, age);
        this.numberOfFilms = numberOfFilms;
    }

    @Override
    public void speak() {
        System.out.println("Ola, son Piolín e sei falar, e fixen" + numberOfFilms + "peliculas");
        System.out.println("Sexo:"+ sex + "Canta:" +sing+ "Idade:"+age+ "Peliculas:"+numberOfFilms);
    }

}
