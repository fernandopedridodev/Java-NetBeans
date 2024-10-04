/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formulax;

/**
 *
 * @author fernando.pedridomarino
 */
public class Formulax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double a = 1;
     double b = -2;
     double c = -15;
             
        double resultado1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        double resultado2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        
        System.out.println("O resultado é: " + resultado1);
        System.out.println("O resultado é: " + resultado2);
    }
    
}
