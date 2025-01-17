/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesores;

import java.util.jar.Attributes;
import java.util.Date;
/**
 *
 * @author fernando.pedridomarino
 */
abstract class Teacher {
    protected String name;
    protected String surname;
    protected String address;
    protected double baseSalary;
    protected double salary;
    
    
public Teacher(String name, String surname, String address, double baseSalary){
    this.name = name;
    this.surname = surname;
    this.address = address;
    this.baseSalary = baseSalary;
}

public void teach(){
    System.out.println("Dou unha clase de programación en Java");
}

public abstract void generatePay();
}
