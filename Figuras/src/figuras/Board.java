/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.util.ArrayList;

/**
 *
 * @author fernando.pedridomarino
 */
class Board {
    protected ArrayList<Shape> figuras;
    protected Board() {
        figuras = new ArrayList<>();
    } 
    protected void addFigura (Shape shape) {
    shape.draw();
    figuras.add(shape);
    }
    protected void clearBoard(){
        for(Shape shape : figuras) {
            shape.erase();
        }
        figuras.clear();        
    }
}
