package circle;

/**
 *
 * @author fernando.pedridomarino
 */
//** Clase principal que contén o método main para crear obxectos da clase Circle

public class MainApp {

    public static void main(String[] args) {
        // Mostrar o valor máximo permitido para o radio
        System.out.println("O valor máximo para o radio é: " + Circle.getMaxRadius());

        // Crear dous círculos cos radios de 3 e 9
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(9);

        // Agrandar os círculos (duplicar os seus radios)
        circle1.enlarge();
        circle2.enlarge();

        // Mostrar os círculos invocando o método show
        circle1.show();
        circle2.show();
    }
}