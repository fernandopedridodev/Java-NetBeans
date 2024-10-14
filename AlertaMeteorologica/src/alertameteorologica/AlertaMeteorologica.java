package alertameteorologica;

/**
 *
 * @author fernando.pedridomarino
 */
public class AlertaMeteorologica {
// Definir constantes
    public static final int TEMPERATURA_ALTA = 24;  // Graos centígrados
    public static final int HUMIDADE_ALTA = 50;     // Porcentaxe (%)

    public static void main(String[] args) {
        // Variables de temperatura e humidade (poden modificarse para probar)
        int temperatura = 25;  // Exemplos de valores
        int humidade = 60;

        // Verificar as condicións e amosar a alerta correspondente
        if (temperatura > TEMPERATURA_ALTA && humidade > HUMIDADE_ALTA) {
            System.out.println("Alerta vermella");
        } else if (temperatura <= TEMPERATURA_ALTA && humidade <= HUMIDADE_ALTA) {
            System.out.println("Alerta verde");
        } else {
            System.out.println("Alerta amarela");
        }
    }
}