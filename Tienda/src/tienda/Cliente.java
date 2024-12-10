/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedri
 */
/**
 * Clase Cliente representa a un cliente de la tienda.
 */
class Cliente {
    private String nombre; // Nombre del cliente
    private int id; // ID único del cliente
    private List<Producto> carrito; // Carrito de compras del cliente

    /**
     * Constructor de la clase Cliente.
     * @param nombre Nombre del cliente
     * @param id ID único del cliente
     */
    public Cliente(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.carrito = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del cliente.
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre Nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del cliente.
     * @return ID único del cliente
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el carrito de compras del cliente.
     * @return Lista de productos en el carrito
     */
    public List<Producto> getCarrito() {
        return carrito;
    }

    /**
     * Agrega un producto al carrito del cliente.
     * @param producto Producto a agregar
     * @param cantidad Cantidad del producto a agregar
     */
    public void agregarAlCarrito(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            carrito.add(producto);
        }
    }

}
