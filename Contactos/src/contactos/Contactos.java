/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactos;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.HashMap;
import java.util.Scanner;
public class Contactos {
  // Atributo: HashMap onde almacenamos os números de teléfono (Integer) e os obxectos Client
    private HashMap<Integer, Client> phonebook;

    // Constructor
    public Contactos() {
        phonebook = new HashMap<>();
    }

    // Método para inserir un cliente no teléfono
    public void insert(int tel, Client cli) {
        phonebook.put(tel, cli);  // Engadir o cliente co número de teléfono como chave
        System.out.println("Cliente inserido correctamente!");
    }

    // Método para eliminar un cliente por número de teléfono
    public void remove(int tel) {
        if (phonebook.containsKey(tel)) {
            phonebook.remove(tel);
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("Non se atopou un cliente co número de teléfono proporcionado.");
        }
    }

    // Método para buscar un cliente por número de teléfono
    public Client findByNumber(int tel) {
        if (phonebook.containsKey(tel)) {
            return phonebook.get(tel);
        } else {
            System.out.println("Non se atopou un cliente co número de teléfono proporcionado.");
            return null;
        }
    }

    // Método para obter o número total de contactos
    public int numContactos() {
        return phonebook.size();
    }

    // Método principal para probar a clase Contacts
    public static void main(String[] args) {
        Contactos contactos = new Contactos();
        Scanner scanner = new Scanner(System.in);
        int option;

        // Menú de accións
        do {
            System.out.println("\n--- Menú de accións ---");
            System.out.println("1. Inserir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar por número de teléfono");
            System.out.println("4. Número total de contactos");
            System.out.println("5. Saír");
            System.out.print("Elixe unha opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer despois de ler un número

            switch (option) {
                case 1:
                    System.out.print("Introduce o número de teléfono: ");
                    int tel = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer
                    System.out.print("Introduce o NIF do cliente: ");
                    String nif = scanner.nextLine();
                    System.out.print("Introduce o nome do cliente: ");
                    String name = scanner.nextLine();
                    System.out.print("Introduce os apelidos do cliente: ");
                    String surname = scanner.nextLine();

                    // Crear o cliente e engadir ao teléfono
                    Client client = new Client(nif, name, surname);
                    contactos.insert(tel, client);
                    break;
                case 2:
                    System.out.print("Introduce o número de teléfono do cliente a eliminar: ");
                    int telToRemove = scanner.nextInt();
                    contactos.remove(telToRemove);
                    break;
                case 3:
                    System.out.print("Introduce o número de teléfono do cliente a buscar: ");
                    int telToFind = scanner.nextInt();
                    Client foundClient = contactos.findByNumber(telToFind);
                    if (foundClient != null) {
                        System.out.println("Cliente atopado: " + foundClient.getName() + " " + foundClient.getSurname());
                    }
                    break;
                case 4:
                    System.out.println("Número total de contactos: " + contactos.numContactos());
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
