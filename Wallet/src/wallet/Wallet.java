/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wallet;

/**
 *
 * @author fernando.pedridomarino
 */
public class Wallet {
 private double money;
    private boolean card;

    /**
     * Construtor da clase Wallet.
     * 
     * @param money Cantidade de diñeiro dispoñible na carteira.
     * @param card  Se a carteira contén ou non unha tarxeta.
     */
    public Wallet(double money, boolean card) {
        this.money = money;
        this.card = card;
    }

    /**
     * Método que devolve unha mensaxe sobre a dispoñibilidade de diñeiro ou alternativas.
     * 
     * @return Unha cadea (String) indicando se hai diñeiro suficiente ou outras opcións.
     */
    public String available() {
        if (money > 100) {
            return "Si, teño suficiente efectivo";
        } else if (money <= 100 && card) {
            return "Teño que ir ao caixeiro";
        } else {
            return "Teño que ir á sucursal";
        }
    }

    /**
     * Método principal (main) que crea diferentes carteiras e mostra o resultado do método available para cada unha.
     * 
     * @param args Non se usan neste programa.
     */
    public static void main(String[] args) {
        // Crear tres carteiras con diferentes valores
        Wallet carteira1 = new Wallet(250, false);   // Carteira con 250€
        Wallet carteira2 = new Wallet(25, true);     // Carteira con 25€ e tarxeta
        Wallet carteira3 = new Wallet(10, false);    // Carteira con 10€ e sen tarxeta

        // Mostrar os resultados de available para cada carteira
        System.out.println("Carteira 1: " + carteira1.available());
        System.out.println("Carteira 2: " + carteira2.available());
        System.out.println("Carteira 3: " + carteira3.available());
    }
}