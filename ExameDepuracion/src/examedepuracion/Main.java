/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examedepuracion;

/**
 *
 * @author f.pedridomarino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float diametro = 4;
        float altura = 20;
        float capacidad = 0;

        System.out.println("DEPÓSITOS SIMPLES\n");

        Deposito c = new Deposito(7, 10, "001");
        Deposito l = new Deposito();
        Deposito r = new Deposito();

        l.setValoresDeposito("002", diametro, altura);

        diametro = c.getDiametro();
        altura = c.getAltura();

        r.setValoresDeposito("003", diametro, altura);

        //Capacidade do depósito c
        capacidad = c.valorCapacidad();

        //Capacidade do depósito l
        capacidad = l.valorCapacidad();

        //Capacidade do depósito r
        capacidad = r.valorCapacidad();

        System.out.println("El depósito " + c.getId() + 
                " tiene una altura de " + c.getAltura() + " y un diámetro de " + c.getDiametro() + "\n");

        System.out.println("El depósito " + l.getId() +
                " tiene una altura de " + l.getAltura() + 
                " y un diámetro de " + l.getDiametro() + "\n");

        System.out.println("El depósito " + r.getId() + 
                " tiene una altura de " + r.getAltura() + " y un diámetro de " + r.getDiametro() + "\n");

        System.out.println("GRUPO DE DEPÓSITOS\n");

        GrupoDepositos khp = new GrupoDepositos(3, "KHP");

        System.out.println("El grupo " + khp.getIdGrupo() + 
                " tiene " + khp.getNumeroDepositosGrupo() + 
                " depósitos de " + khp.capacidadDelGrupo() + 
                " de capacidad");
    
    }
    
}
