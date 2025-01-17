/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesores;

/**
 *
 * @author fernando.pedridomarino
 */
class Carreira extends Teacher {
    private double postoComplemento;
    private int anoOposicion;
    private String lugarOposicion;
    
    public Carreira(String name, String surname, String address, double baseSalary, double postoComplemento, int anoOposicion, String lugarOposicion){
        super(name, surname, address, baseSalary);
        this.postoComplemento = postoComplemento;
        this.anoOposicion = anoOposicion;
        this.lugarOposicion = lugarOposicion;
        
    }
    @Override
    public void generatePay(){
        this.salary = this.baseSalary + this.postoComplemento;
    }
}
