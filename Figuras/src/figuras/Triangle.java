/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author fernando.pedridomarino
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Debuxando un triangulo");
    }

    @Override
    public void erase() {
        System.out.println("Borrando o triangulo");
    }
}