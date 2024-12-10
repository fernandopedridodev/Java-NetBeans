/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroommanager;

/**
 *
 * @author f.pedridomarino
 */
import java.util.ArrayList;
import java.util.List;

public class ClassroomManager {

    public void distributeStudents(String[][] classroom, String[][] studentList) {
        List<String[]> students = new ArrayList<>();
        for (String[] student : studentList) {
            students.add(student);
        }

        // Intentar resolver mediante backtracking
        while (!backtrack(classroom, students, 0)) {
            // Si falla, reiniciar y volver a intentar
            clearClassroom(classroom);
        }
    }

    // Método principal para realizar el backtracking
    private boolean backtrack(String[][] classroom, List<String[]> students, int index) {
        if (index == students.size()) {
            return true; // Todos los estudiantes han sido colocados correctamente
        }

        String[] currentStudent = students.get(index);

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                if (classroom[i][j] == null && isValidPlacement(classroom, currentStudent, i, j)) {
                    classroom[i][j] = currentStudent[0];
                    if (backtrack(classroom, students, index + 1)) {
                        return true;
                    }
                    classroom[i][j] = null; // Retroceder
                }
            }
        }

        return false; // No se encontró solución para este índice
    }

    // Verifica si un estudiante puede sentarse en una posición específica
    private boolean isValidPlacement(String[][] classroom, String[] student, int row, int col) {
        String name = student[0];
        String restriction1 = student[1];
        String restriction2 = student[2];

        // Verificar la izquierda
        if (col > 0 && classroom[row][col - 1] != null) {
            if (classroom[row][col - 1].equals(restriction1) || classroom[row][col - 1].equals(restriction2)) {
                return false;
            }
        }

        // Verificar la derecha
        if (col < classroom[row].length - 1 && classroom[row][col + 1] != null) {
            if (classroom[row][col + 1].equals(restriction1) || classroom[row][col + 1].equals(restriction2)) {
                return false;
            }
        }

        // Verificar arriba
        if (row > 0 && classroom[row - 1][col] != null) {
            if (classroom[row - 1][col].equals(restriction1) || classroom[row - 1][col].equals(restriction2)) {
                return false;
            }
        }

        // Verificar abajo
        if (row < classroom.length - 1 && classroom[row + 1][col] != null) {
            if (classroom[row + 1][col].equals(restriction1) || classroom[row + 1][col].equals(restriction2)) {
                return false;
            }
        }

        return true;
    }

    // Limpia el aula antes de reiniciar
    private void clearClassroom(String[][] classroom) {
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                classroom[i][j] = null;
            }
        }
    }

    // Muestra el contenido del aula
    public void showClassroom(String[][] classroom) {
        for (String[] row : classroom) {
            for (String seat : row) {
                System.out.print((seat == null ? "Empty" : seat) + "\t");
            }
            System.out.println();
        }
    }
}