/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author f.pedridomarino
 */
class Producto {
    private String nombre; // Nombre del producto
    private double precio; // Precio del producto
    private int stock; // Stock disponible del producto

    /**
     * Constructor de la clase Producto.
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param stock Stock disponible del producto
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos Getters y Setters con documentación Javadoc

    /**
     * Obtiene el nombre del producto.
     * @return Nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre Nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     * @return Precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * @param precio Nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el stock del producto.
     * @return Stock disponible
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock del producto.
     * @param stock Nuevo stock disponible
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Reduce el stock del producto si la cantidad requerida está disponible.
     * @param cantidad Cantidad a reducir
     * @return true si se reduce el stock, false en caso contrario
     */
    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Representación en cadena del producto.
     * @return Detalles del producto
     */
    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio + " - Stock: " + stock;
    }
}
