public class ConvertirTempo {
    public static void main(String[] args) {
        // Declaramos unha variable para almacenar o numero de segundos
        int totalSegundos = 150000;
        // Calculamos o numero de horas dividindo o total de segundos entre 3600 (segundos nunha hora)
        int horas = totalSegundos / 3600;
        // Calculamos os segundos restantes despois de sacar as horas
        int segundosRestantes = totalSegundos % 3600;
        // Calculamos os minutos dividindo os segundos restantes entre 60 (segundos nun minuto)
        int minutos = segundosRestantes / 60;
        // Calculamos os segundos restantes despois de sacar os minutos
        int segundos = segundosRestantes % 60;
        // Imprimimos o resultado da conversion en formato de horas, minutos e segundos
        System.out.println(totalSegundos + " segundos son " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
    }
}