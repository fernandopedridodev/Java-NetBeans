package circle;
/**
 *
 * @author fernando.pedridomarino
 * A clase Circle representa un círculo cun atributo radio.
 */
/**
 * A clase Circle representa un círculo cun atributo radio.
 * Inclúe unha constante estática MAX_RADIUS para limitar o valor máximo do radio.
 */
public class Circle {
    
    // Atributo que representa o radio do círculo
    private int radius;
    
    // Atributo estático constante que define o radio máximo permitido
    public static final int MAX_RADIUS = 10;

    /**
     * Constructor da clase Circle.
     * Comproba que o valor do radio non supere o valor máximo.
     * 
     * @param radius O radio do círculo
     */
    public Circle(int radius) {
        if (radius > MAX_RADIUS) {
            this.radius = MAX_RADIUS;
        } else {
            this.radius = radius;
        }
    }

    /**
     * Método para modificar o radio do círculo.
     * Comproba que o novo radio non supere o valor máximo.
     * 
     * @param radius O novo radio a establecer
     */
    public void setRadius(int radius) {
        if (radius > MAX_RADIUS) {
            this.radius = MAX_RADIUS;
        } else {
            this.radius = radius;
        }
    }

    /**
     * Método que agranda o círculo duplicando o seu radio.
     * Comproba que o novo valor non supere o valor de MAX_RADIUS.
     */
    public void enlarge() {
        if (this.radius * 2 > MAX_RADIUS) {
            this.radius = MAX_RADIUS;
        } else {
            this.radius *= 2;
        }
    }

    /**
     * Método para mostrar por pantalla unha mensaxe co valor do radio.
     * Mostra "Son un círculo de radio x", onde x é o valor do radio.
     */
    public void show() {
        System.out.println("Son un círculo de radio " + this.radius);
    }

    /**
     * Método estático para obter o valor da constante MAX_RADIUS.
     * 
     * @return O valor máximo permitido para o radio.
     */
    public static int getMaxRadius() {
        return MAX_RADIUS;
    }
}