/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package year;

/**
 *
 * @author fernando.pedridomarino
 */
public class Year {

   private boolean leapYear;

    // Constructor que recibe o valor para o atributo leapYear
    public Year(boolean leapYear) {
        this.leapYear = leapYear;
    }

    // Método que mostra o número de días dun mes
    public void showDaysOfMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("O mes proporcionado non é válido. Debe estar entre 1 e 12.");
            return;
        }

        int days;
        switch (month) {
            case 2: // Febreiro
                days = leapYear ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11: // Abril, Xuño, Setembro, Novembro
                days = 30;
                break;
            default: // Xaneiro, Marzo, Maio, Xullo, Agosto, Outubro, Decembro
                days = 31;
                break;
        }

        System.out.println("O mes " + month + " ten " + days + " días.");
    }

    // Método main para probar o funcionamento
    public static void main(String[] args) {
        // Ano non bisesto
        Year year2023 = new Year(false);
        year2023.showDaysOfMonth(2);  // Febreiro (28 días)
        year2023.showDaysOfMonth(4);  // Abril (30 días)
        year2023.showDaysOfMonth(12); // Decembro (31 días)
        year2023.showDaysOfMonth(13); // Mes non válido

        // Ano bisesto
        Year year2024 = new Year(true);
        year2024.showDaysOfMonth(2);  // Febreiro (29 días)
    }
}