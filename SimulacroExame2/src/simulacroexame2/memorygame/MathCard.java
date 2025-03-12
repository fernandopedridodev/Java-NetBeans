/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexame2.memorygame;

/**
 *
 * @author fernando.pedridomarino
 */
// Creamos a clase MatchCard, que herda atributos de Card 
class MathCard extends Card{
// Definimos as constantes de operadores, que son un char
    static char MULT;
    static char SUB;
    static char SUM;
//Implementamos o constructor con atributos herdados e propios
    public MathCard(String text, boolean hit, int operators1, int operators2, char operation) {
        super(text, hit);
    // Definimos o método getValue
    }
    public void getValue(){
           
    }
    @Override
    void isEquals() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
