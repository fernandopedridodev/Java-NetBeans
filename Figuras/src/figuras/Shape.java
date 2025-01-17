/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.Color;

/**
 *
 * @author fernando.pedridomarino
 */
public abstract class Shape implements Coloreable {

    private Color color;

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
    public abstract void draw();

    public abstract void erase();
}
