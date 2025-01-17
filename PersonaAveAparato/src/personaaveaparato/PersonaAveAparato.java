/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personaaveaparato;

/**
 *
 * @author fernando.pedridomarino
 * Creamos o metodo Main que inclue un arraylist de 7 posicions que executa o metodo Speaker
 * e amosa resultados por pantalla
 */
public class PersonaAveAparato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Speaker[] speakers = new Speaker [7];
                
                speakers[0]= new Loro("Europa", "azul", "Macho", 5);
                speakers[1]= new TV(true, 5, "100", 50);
                speakers[2]= new Student("Historia", "1º", "Arturo", 19);
                speakers[3]= new Teacher("Antropoloxía", "abc123@tmail.com", "Fermín", 50);
                speakers[4]= new Concierge("Noite", "15", "Eladio", 60);
                speakers[5]= new Tweety("10", "Opera", "Macho", 6);
                speakers[6]= new Radio(true, 12, "1000", 45);
    
                        
                for (Speaker speaker : speakers){
                speaker.speak();
                    System.out.println();
                }
                        }

}
