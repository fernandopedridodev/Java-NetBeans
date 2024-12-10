/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaraugas;

/**
 *
 * @author f.pedridomarino
 */
public class ContarAuga {

    public static int calcularAuga(int[] bloques) {
        if (bloques == null || bloques.length < 3) {
            return 0; // Non hai bloques ou menos de 3, non se pode reter auga
        }

        int esquerda = 0; // Puntero ao extremo esquerdo
        int dereita = bloques.length - 1; // Puntero ao extremo dereito
        int maxEsquerda = 0; // Máximo á esquerda
        int maxDereita = 0; // Máximo á dereita
        int totalAuga = 0; // Total de unidades de auga

        while (esquerda < dereita) {
            if (bloques[esquerda] < bloques[dereita]) {
                if (bloques[esquerda] >= maxEsquerda) {
                    maxEsquerda = bloques[esquerda]; // Actualizar máximo á esquerda
                } else {
                    totalAuga += maxEsquerda - bloques[esquerda]; // Auga atrapada nesta posición
                }
                esquerda++; // Avanzar o puntero esquerdo
            } else {
                if (bloques[dereita] >= maxDereita) {
                    maxDereita = bloques[dereita]; // Actualizar máximo á dereita
                } else {
                    totalAuga += maxDereita - bloques[dereita]; // Auga atrapada nesta posición
                }
                dereita--; // Avanzar o puntero dereito
            }
        }

        return totalAuga;
    }
}