/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examedepuracion;

import examedepuracion.Deposito;

/**
 *
 * @author Esther Ferreiro
 */
public class GrupoDepositos {
    private Deposito deposito1;
    private Deposito deposito2;
    private Deposito deposito3;
    private String idGrupo;
    private int numeroDepositosGrupo;

   
    public GrupoDepositos (int numeroDeDepositosGrupo, String 	valor_idGrupo) {
    idGrupo = valor_idGrupo;        
    switch (numeroDeDepositosGrupo) {
            case 1: System.out.println ("Un grupo ha de tener más de un"
                    + "depósito"); 
            break;
            
            case 2:            
            deposito1 = new Deposito(10,3,idGrupo.concat("grupo2")); 
            deposito2 = new Deposito(10,3,idGrupo.concat("grupo2"));       
            numeroDepositosGrupo = 2;
            break;

            case 3: 
            deposito1 = new Deposito(10,5,idGrupo.concat("grupo3")); 
            deposito2 = new Deposito(10,5,idGrupo.concat("grupo3")); 
            deposito3 = new Deposito(10,5,idGrupo.concat("grupo3"));
            numeroDepositosGrupo = 3;
            break;

            default: System.out.println("No se admiten más de tres"
                    + "depósitos");
            break;
        } 
    } 

    
public int getNumeroDepositosGrupo () { 
    	return numeroDepositosGrupo; 
    }

    public String getIdGrupo () { 
    	return idGrupo; 
    }
    public float capacidadDelGrupo () {      
        if (numeroDepositosGrupo == 2) { 
        	return (deposito1.valorCapacidad()+deposito2.valorCapacidad());
        } else { 
        	return (deposito1.valorCapacidad()+deposito2.valorCapacidad()+
                        deposito3.valorCapacidad()); 
        }   
    } 
}
