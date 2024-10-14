package ascensorswitch;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;
public class AscensorSwitch {

    // Creamos unha clase para establecer as funcións dun ascensor
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce unha acción ('a' para abrir, 'p' para pechar, 's' para subir, 'b' para baixar): ");
            
            char ascensor = scanner.next().charAt(0);
            //Creamos os casos que debe valorar a función switch
            switch (ascensor) {
                case 'a':
                    System.out.println("a fai que o ascensor se abra");
                    break;
                case 'b':
                    System.out.println("b fai que ascensor baixe");
                    break;
                case 'p':
                    System.out.println("p fai que o ascensor se peche");
                    break;
                case 's':
                    System.out.println("s fai que o ascensor suba");
                    break;
                //Establecemos a acción que ocorre ao introducir un valor que non son os establecidos anteriormente
                default:
                    System.out.println("Erro: Acción non válida.");
            }
        }
    }
    
}
