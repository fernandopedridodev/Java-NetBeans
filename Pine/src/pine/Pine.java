package pine;

/**
 *
 * @author fernando.pedridomarino
 */
// Clase Pine (Pino), non pública
class Pine {
    // Atributo que representa a altura do pino
    private int height;

    // Constructor que inicializa a altura do pino
    public Pine(int height) {
        this.height = height;
    }

    // Método get para obter a altura do pino
    public int getHeight() {
        return height;
    }

    // Método set para cambiar a altura do pino
    public void setHeight(int height) {
        this.height = height;
    }

    // Método cut para cortar o pino restándolle unha cantidade dada
    public void cut(int amount) {
        if (amount < height) {
            this.height -= amount;
        } else {
            this.height = 0; // Non pode ser menor que 0
        }
    }
}