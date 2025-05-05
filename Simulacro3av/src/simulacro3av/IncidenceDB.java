/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro3av;

import java.util.ArrayList;

/**
 * Gardamos as incidencias nunha clase de persistencia cun Arraylist
 *
 * @author fernando.pedridomarino
 */
public class IncidenceDB {

    private static ArrayList<Incidence> incidences = new ArrayList<>();

    public static ArrayList<Incidence> findByUser(String username) {
        ArrayList<Incidence> result = new ArrayList<>();
        for (Incidence inc : incidences) {
            if (inc.getSender().getUsername().equals(username)) {
                result.add(inc);
            }
        }
        return result;
    }

    public static ArrayList<Incidence> findByStatus(int status) {
        ArrayList<Incidence> result = new ArrayList<>();
        for (Incidence inc : incidences) {
            if (inc.getSender().equals(status)) {
                result.add(inc);
            }
        }
        return result;
    }

    public static void save(Incidence incidence) {
        incidence.setId(incidences.size());
        incidences.add(incidence);
    }

    public static void update(Incidence incidence) {
        // Neste exemplo, os obxectos están referenciados directamente, polo que non é necesario facer nada
       
    }

}
