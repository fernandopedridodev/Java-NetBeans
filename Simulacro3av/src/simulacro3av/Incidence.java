/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro3av;

/**
 * Declaramos a clase modelo de incidencia
 * @author fernando.pedridomarino
 */
public class Incidence {

    private int id;
    private String description;
    private String computer;
    private String resolution;
    private User sender;

  
    private int status;
    private static final int STATUS_UNSOLVED = 0;
    private static final int STATUS_PENDING = 1;
    private static final int STATUS_SOLVED = 2;

    public static int getSTATUS_UNSOLVED() {
        return STATUS_UNSOLVED;
    }

    public static int getSTATUS_PENDING() {
        return STATUS_PENDING;
    }

    public static int getSTATUS_SOLVED() {
        return STATUS_SOLVED;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    /**
     *
     * @param id Identifica a incidencia
     * @param description Describe o problema da incidencia
     * @param computer Nome do equipo que ten a incidencia
     * @param resolution Descricion da resolucion da incidencia
     * @param sender Usuario que xerou a incidencia
     */
    public Incidence(int id, String description, String computer, String resolution, User sender) {
        this.id = id;
        this.description = description;
        this.computer = computer;
        this.resolution = resolution;
        this.sender = sender;
        this.status = status;
    }

    /**
     *
     * @return Devolve o id da incidencia
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id Establece o id da incidencia
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return Devolve a descricion da incidencia
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description Establece a descricion da incidencia
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return Devolve o nome do equipo da incidencia
     */
    public String getComputer() {
        return computer;
    }

    /**
     *
     * @param computer Establece o nome do equipo da incidencia
     */
    public void setComputer(String computer) {
        this.computer = computer;
    }

    /**
     *
     * @return Devolve a resolucion da incidencia
     */
    public String getResolution() {
        return resolution;
    }

    /**
     *
     * @param resolution Establece a resolución da incidencia
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     *
     * @return Devolve o usuario que enviou a incidencia
     */
    public User getSender() {
        return sender;
    }

    /**
     *
     * @param sender establece o usuario que envia a incidencia
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

}