/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarot;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;

/**
 * Clase Tarot para calcular o número de tarot a partir dunha data.
 * Verifica se a data é válida e considera se o ano é bisesto.
 */
public class Tarot {

    /**
     * Método main para executar o programa.
     * Pide ao usuario que introduza unha data, verifica se é válida e calcula o número de tarot.
     *
     * @param args Argumentos da liña de comandos (non utilizados).
     */
    public static void main(String[] args) {
        // Crear un obxecto Scanner para ler datos do usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuario que introduza a data
        System.out.print("Introduce o día: ");
        int day = scanner.nextInt();
        
        System.out.print("Introduce o mes: ");
        int month = scanner.nextInt();
        
        System.out.print("Introduce o ano: ");
        int year = scanner.nextInt();

        // Pechar o scanner despois de recoller os datos
        scanner.close();

        // Creación dun obxecto da clase Tarot
        Tarot tarot = new Tarot();

        // Verificar se a data é correcta
        if (tarot.checkDate(day, month, year)) {
            // Calcular e mostrar o número de tarot
            int tarotNumber = tarot.calculateTarot(day, month, year);
            System.out.println("O número de tarot é: " + tarotNumber);
        } else {
            // Mensaxe de erro en caso de data incorrecta
            System.out.println("Erro: a data introducida non é válida.");
        }
    }

    /**
     * Verifica se un ano é bisesto.
     *
     * @param year Ano a comprobar.
     * @return true se o ano é bisesto, false se non o é.
     */
    public boolean isLeapYear(int year) {
        // Ano bisesto se é divisible por 4, pero non por 100, a non ser que sexa divisible por 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Comproba se unha data é correcta, tendo en conta días, meses e anos bisestos.
     *
     * @param day Día da data.
     * @param month Mes da data.
     * @param year Ano da data.
     * @return true se a data é válida, false se non o é.
     */
    public boolean checkDate(int day, int month, int year) {
        // Verificación do rango do mes
        if (month < 1 || month > 12) {
            return false;
        }

        // Determinación do número de días no mes
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // Febreiro ten 29 días en anos bisestos
        }

        // Verificación do rango do día
        return day > 0 && day <= daysInMonth[month - 1];
    }

    /**
     * Calcula o número de tarot sumando os díxitos do día, mes e ano ata obter un só díxito.
     *
     * @param day Día da data.
     * @param month Mes da data.
     * @param year Ano da data.
     * @return Número de tarot (dígito único resultante da suma).
     */
    public int calculateTarot(int day, int month, int year) {
        // Suma dos compoñentes da data
        int sum = day + month + year;

        // Suma iterativa dos díxitos ata quedar cun só díxito
        while (sum > 9) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }

        return sum;
    }
}