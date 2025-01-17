/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

/**
 *
 * @author fernando.pedridomarino
 */
public class PaintingSession {

    public static void main(String[] args){
        Board board = new Board();
        
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        
        board.addFigura(square);
        board.addFigura(triangle);
        board.addFigura(circle);
        
        board.clearBoard();
    }
    
    
}
