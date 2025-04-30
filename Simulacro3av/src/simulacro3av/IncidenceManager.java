/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro3av;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase controladora da aplicación
 * @author fernando.pedridomarino
 */
public class IncidenceManager {

    private Scanner scanner = new Scanner(System.in);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        IncidenceManager app = new IncidenceManager();
        app.showInitMenu();

    }

    private void showInitMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Benvido ao sistema de notificacion de incidencias");
            User user = null;
            while (user == null) {
                System.out.println("Nome do usuario:\n");
                String username = scanner.nextLine();
                System.out.println("Contrasinal:\n");
                String password = scanner.nextLine();
                user = UserDB.findByName(username);
                if (user == null || !user.getPassword().equals(password)) {
                    System.out.println("Claves incorrectas, volve a intentalo");
                    user = null;
                }
            }
            System.out.println("Benvid@ " + user.getName());
            showIncidencesMenu(user);
            System.out.println("Queres sair da aplicacion?(s/n)\n");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("s")) {
                exit = true;
            }

        }

    }

    private void showIncidencesMenu(User user) {
        while (true) {
            System.out.println("As túas incidencias:");
            ArrayList<Incidence> list = IncidenceDB.findByUser(user.getUsername());

            if (list.isEmpty()) {
                System.out.println("Non tes ningunha incidencia rexistrada.");
            } else {
                for (Incidence inc : list) {
                    String status;
                    int incStatus = inc.getStatus();
                    if (incStatus == Incidence.getSTATUS_UNSOLVED()) {
                        status = "sen resolver";
                    } else if (incStatus == Incidence.getSTATUS_PENDING()) {
                        status = "pendente";
                    } else if (incStatus == Incidence.getSTATUS_SOLVED()) {
                        status = "resolta";
                    } else {
                        status = "descoñecido";
                    }

                    System.out.println("ID: " + inc.getId());
                    System.out.println("Equipo: " + inc.getComputer());
                    System.out.println("Descrición: " + inc.getDescription());
                    System.out.println("Estado: " + status);
                    System.out.println("-----------------------");
                }
            }

            System.out.println("Elixe unha opción:");
            System.out.println("1. Crear nova incidencia");
            System.out.println("2. Pechar sesión");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Descrición do problema:");
                String description = scanner.nextLine();

                System.out.println("Nome do equipo:");
                String computer = scanner.nextLine();

                Incidence newInc = new Incidence(
                        0, // ID temporal (supostamente será xerado na base de datos)
                        description,
                        computer,
                        "", // resolución baleira ao crear
                        user
                );

                IncidenceDB.save(newInc);
                System.out.println("Incidencia gardada con éxito.\n");

            } else if (option.equals("2")) {
                System.out.println("Sesión pechada.\n");
                break;
            } else {
                System.out.println("Opción non válida, proba de novo.\n");
            }
        }
    }

}
