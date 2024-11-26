/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examedepuracion;

/*Esta clase representa un  depósito cilíndrico onde se almacena aceite  */

public class Deposito {    

    private float diametro;
    private float altura;
    private String idDeposito;
    
    public Deposito () { 
        this.diametro=0;
        this.altura=0;
        this.idDeposito="";
    } 

    public Deposito (float valor_diametro, float valor_altura, String    	valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado depósito con valores por defecto 			diametro 10 metros altura 5 metros id 000");
        }   
	} 

    public void setValoresDeposito (String valor_idDeposito, float 	valor_diametro, float valor_altura) {

        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println ("Valores no admisibles. No se han 				establecido valores para el depósito");
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     
} 

    public float getDiametro () { 
    	return diametro; 
    } 
    public float getAltura () { 
    	return altura; 
    } 
    public String getId() {
    	
    	return idDeposito;
    }
    public float valorCapacidad () { 
        float capacidad;
        float pi = 3.1416f; 
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    

} 