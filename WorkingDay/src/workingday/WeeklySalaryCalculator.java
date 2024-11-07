package workingday;
/**
 *
 * @author fernando.pedridomarino
 */
// Clase que representa un día de traballo
// Clase que representa un día de traballo
class WorkingDay {
    private String quenda; // "d" para diurno, "n" para nocturno
    private String dia;    // "d" para domingo, "x" para outro día
    private int horas;     // Número de horas traballadas nese día

    // Constructor que inicializa os atributos quenda, día e horas
    public WorkingDay(String quenda, String dia, int horas) {
        this.quenda = quenda;
        this.dia = dia;
        this.horas = horas;
    }

    // Método para calcular o xornal gañado neste día de traballo
    public double calcularXornal() {
        double tarifaHora = quenda.equals("d") ? 8 : 12; // Tarifa base segundo a quenda

        // Incremento do 20% se é domingo
        if (dia.equals("d")) {
            tarifaHora *= 1.20;
        }

        // Cálculo do xornal
        return tarifaHora * horas;
    }
}

// Clase principal que calcula o salario semanal
public class WeeklySalaryCalculator {

    public static double calcularSalarioSemanal(boolean incluirDomingo) {
        double salarioSemanal = 0;

        // Cálculo dos 4 primeiros días de traballo (de luns a venres)
        for (int i = 0; i < 4; i++) {
            WorkingDay diaNormal = new WorkingDay("d", "x", 8);
            salarioSemanal += diaNormal.calcularXornal();
        }

        // Engadir o salario do quinto día, que pode ser domingo ou día normal
        WorkingDay quintoDia;
        if (incluirDomingo) {
            quintoDia = new WorkingDay("d", "d", 8); // Domingo
        } else {
            quintoDia = new WorkingDay("d", "x", 8); // Día normal
        }
        salarioSemanal += quintoDia.calcularXornal();

        return salarioSemanal;
    }

    public static void main(String[] args) {
        // Calculamos o salario semanal cun día en domingo
        double salarioConDomingo = calcularSalarioSemanal(true);
        System.out.println("Salario semanal con domingo incluído: " + salarioConDomingo);

        // Calculamos o salario semanal sen domingo
        double salarioSenDomingo = calcularSalarioSemanal(false);
        System.out.println("Salario semanal sen domingo incluído: " + salarioSenDomingo);
    }
}