/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author pedri
 */
/**
 * Clase Tienda representa la tienda que gestiona productos y clientes.
 */
class Tienda {
    private List<Producto> productos; // Lista de productos disponibles
    Map<Integer, Cliente> clientes; // Mapa de clientes registrados

    /**
     * Constructor de la clase Tienda.
     */
    public Tienda() {
        this.productos = new ArrayList<>();
        this.clientes = new HashMap<>();
    }

    /**
     * Agrega un producto a la tienda.
     * @param producto Producto a agregar
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Registra un cliente en la tienda.
     * @param cliente Cliente a registrar
     */
    public void registrarCliente(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    /**
     * Muestra la lista de productos disponibles en la tienda.
     */
    public void mostrarProductos() {
        System.out.println("Productos disponibles:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    /**
     * Busca un producto por su nombre.
     * @param nombre Nombre del producto a buscar
     * @return Producto encontrado o null si no existe
     */
    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Ordena los productos por precio de menor a mayor.
     */
    public void ordenarProductosPorPrecio() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio));
    }
}
