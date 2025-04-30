/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro3av;

/**
 * Clase modelo dos usuarios
 * @author fernando.pedridomarino
 */
public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private int type;
    
    /**
     * Constante para o usuario estándar
     */
    public static final int USER = 0;

    /**
     * Constante para o usuario administrador
     */
    public static final int ADMIN = 1;

    /**
     *
     * @param username Login do usuario
     * @param password Contrasinal do usuario
     * @param name Nome real de usuario
     * @param surname Apelidos reais do usuario
     */
    public User(String username, String password, String name, String surname, int USER) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    

    /**
     *
     * @return Devolve o login do usuario
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * Dispón o login do usuario
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return Devolve o contrasinal do usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     * Dispón o contrasinal do usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return Devolve o nome real do usuario
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name 
     * Dispón o nome real do usuario
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Devolve os apelidos do usuario
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname
     * Dispón os apelidos do usuario
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
