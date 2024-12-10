/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegodedados;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.*;

public class JuegoDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tiradas = new int[5];
        System.out.println("Lanzando 5 dados...");

        for (int i = 0; i < tiradas.length; i++) {
            tiradas[i] = random.nextInt(6) + 1;
        }

        System.out.println("Tiradas: " + Arrays.toString(tiradas));
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int valor : tiradas) {
            frecuencia.put(valor, frecuencia.getOrDefault(valor, 0) + 1);
        }

        System.out.println("Frecuencia de valores: " + frecuencia);
    }
}