package pine;

/**
 *
 * @author fernando.pedridomarino
 */
// Clase MainApp (a clase pública), debe ter o mesmo nome que o arquivo
public class MainApp {
    public static void main(String[] args) {
        // Crear dous pinos, un de 34 metros e outro de 25 metros
        Pine pine1 = new Pine(34);
        Pine pine2 = new Pine(25);

        // Cortar 7 metros ao primeiro pino
        pine1.cut(7);
        // Cortar 12 metros ao segundo pino
        pine2.cut(12);

        // Mostrar por pantalla a altura dos dous pinos
        System.out.println("Altura do primeiro pino: " + pine1.getHeight() + " metros");
        System.out.println("Altura do segundo pino: " + pine2.getHeight() + " metros");
    }
}