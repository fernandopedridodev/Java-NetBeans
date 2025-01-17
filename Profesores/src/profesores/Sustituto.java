/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesores;

import java.util.Date;

/**
 *
 * @author fernando.pedridomarino
 */
class Sustituto extends Teacher {
    private double desplazamento;
    private Date dataInicio;
    
    public Sustituto (String name, String surname, String address, double baseSalary, double desplazamento, Date dataInicio){
        super(name, surname, address, baseSalary);
        this.desplazamento = desplazamento;
        this.dataInicio = dataInicio;
    }
    @Override
    public void generatePay(){
        this.salary = this.desplazamento + this.baseSalary;
    }
}
