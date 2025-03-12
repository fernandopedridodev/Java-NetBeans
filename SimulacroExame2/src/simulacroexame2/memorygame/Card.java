/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexame2.memorygame;

import java.util.Objects;

/**
 *
 * @author fernando.pedridomarino
 */
// Definimos  clase abstracta Card e os seus atributos e constructor
abstract class Card {
    protected String text;
    protected boolean hit;

    public Card(String text, boolean hit) {
        this.text = text;
        this.hit = hit;
    }
    // definimos o metodo abstracto isEquals
    abstract void isEquals();

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.hit != other.hit) {
            return false;
        }
        return Objects.equals(this.text, other.text);
    }
}
