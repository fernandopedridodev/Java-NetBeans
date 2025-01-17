/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesores;

/**
 *
 * @author fernando.pedridomarino
 */
class Interino extends Teacher {
    private double complementoInterino;
    private String destino;
    
    public Interino(String name, String Surname, String address, double baseSalary, double complementoInterino, String destino){
        super(name, Surname, address, baseSalary);
        this.complementoInterino = complementoInterino;
        this.destino = destino;
    }
    @Override
    public void generatePay(){
        this.salary = this.baseSalary + this.complementoInterino;
    }
}
