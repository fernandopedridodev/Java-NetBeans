/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package profesores;

import java.util.Date;

/**
 *
 * @author fernando.pedridomarino
 */
public class Main {

     public static void main(String[] args) {

        // Crear obxectos de cada subclase

        Carreira carreira = new Carreira("María", "Pérez", "Rua A", 2000, 500, 2015, "Vigo");

        Interino interino = new Interino("Luis", "Gómez", "Rua B", 1800, 300, "A Coruña");

        Sustituto sustituto = new Sustituto("Ana", "López", "Rua C", 1500, 200, new Date());


        // Xerar nómina e mostrar información

        carreira.generatePay();

        System.out.println("Chámome " + carreira.name + " e o meu salario é de " + carreira.salary);

        carreira.teach();


        interino.generatePay();

        System.out.println("Chámome " + interino.name + " e o meu salario é de " + interino.salary);

        interino.teach();


        sustituto.generatePay();

        System.out.println("Chámome " + sustituto.name + " e o meu salario é de " + sustituto.salary);

        sustituto.teach();

    }

}
