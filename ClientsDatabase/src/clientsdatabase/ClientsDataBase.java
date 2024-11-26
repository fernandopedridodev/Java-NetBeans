/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientsdatabase;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ClientsDataBase {
    public static void main(String[] args) {
        // Crear obxecto de tipo DataBase
        DataBase database = new DataBase();
        Scanner scanner = new Scanner(System.in);
        int option;

        // Menu de opcións
        do {
            System.out.println("\n--- Menú de accións ---");
            System.out.println("1. Engadir cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Número de clientes");
            System.out.println("5. Saír");
            System.out.print("Elixe unha opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer despois de ler un número

            switch (option) {
                case 1:
                    database.addClient();
                    break;
                case 2:
                    database.showClients();
                    break;
                case 3:
                    System.out.print("Introduce o NIF do cliente a eliminar: ");
                    String nifToRemove = scanner.nextLine();
                    database.removeClient(nifToRemove);
                    break;
                case 4:
                    System.out.println("Número de clientes: " + database.numClients());
                    break;
                case 5:
                    System.out.println("Saíndo do programa...");
                    break;
                default:
                    System.out.println("Opción non válida. Inténtao de novo.");
            }
        } while (option != 5);
    }
}

class Client {
    private String nif;
    private String name;
    private String surname;

    // Constructor
    public Client(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    // Métodos getters e setters
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

class DataBase {
    private ArrayList<Client> clients;

    // Constructor
    public DataBase() {
        this.clients = new ArrayList<>();
    }

    // Método para engadir un cliente
    public void addClient() {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir os datos do cliente
        System.out.print("Introduce o NIF do cliente: ");
        String nif = scanner.nextLine();
        
        System.out.print("Introduce o nome do cliente: ");
        String name = scanner.nextLine();
        
        System.out.print("Introduce os apelidos do cliente: ");
        String surname = scanner.nextLine();

        // Crear o obxecto Client e engadilo á lista
        Client newClient = new Client(nif, name, surname);
        clients.add(newClient);
        
        System.out.println("Cliente engadido con éxito!");
    }

    // Método para amosar os NIF de todos os clientes
    public void showClients() {
        if (clients.isEmpty()) {
            System.out.println("Non hai clientes na base de datos.");
            return;
        }

        System.out.println("Clientes na base de datos:");
        for (Client client : clients) {
            System.out.println("NIF: " + client.getNif());
        }
    }

    // Método para eliminar un cliente por NIF
    public void removeClient(String nif) {
        boolean found = false;
        
        // Buscar o cliente e eliminar se o atopamos
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getNif().equals(nif)) {
                clients.remove(i);
                found = true;
                System.out.println("Cliente eliminado con éxito.");
                break;
            }
        }
        
        if (!found) {
            System.out.println("Non se atopou un cliente co NIF proporcionado.");
        }
    }

    // Método para obter o número de clientes
    public int numClients() {
        return clients.size();
    }
}