/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

/**
 *
 * @author f.pedridomarino
 */
/**
 * Proyecto: Gestión de Tienda en Línea
 * Este programa simula una tienda en línea que permite a los clientes buscar productos,
 * agregarlos a un carrito de compras y realizar compras. Utiliza conceptos de programación
 * orientada a objetos como clases, métodos, constructores, y colecciones.
 */

import java.util.*;

/**
 * Clase principal que gestiona la interacción del usuario con la tienda.
 */
class GestionTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();

        // Agregar productos iniciales
        tienda.agregarProducto(new Producto("Laptop", 1000.0, 5));
        tienda.agregarProducto(new Producto("Smartphone", 600.0, 10));
        tienda.agregarProducto(new Producto("Tablet", 300.0, 7));

        // Registrar clientes iniciales
        tienda.registrarCliente(new Cliente("Juan Perez", 1));
        tienda.registrarCliente(new Cliente("Maria Lopez", 2));

        boolean salir = false;

        while (!salir) {
            // Mostrar menú principal
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar productos disponibles");
            System.out.println("2. Ordenar productos por precio");
            System.out.println("3. Buscar producto");
            System.out.println("4. Comprar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    // Mostrar productos
                    tienda.mostrarProductos();
                    break;

                case 2:
                    // Ordenar productos por precio
                    tienda.ordenarProductosPorPrecio();
                    System.out.println("Productos ordenados por precio.");
                    break;

                case 3:
                    // Buscar producto por nombre
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    Producto productoBuscado = tienda.buscarProducto(nombreProducto);
                    if (productoBuscado != null) {
                        System.out.println("Producto encontrado: " + productoBuscado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    // Comprar producto
                    System.out.print("Ingrese su ID de cliente: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea

                    Cliente cliente = tienda.clientes.get(idCliente);
                    if (cliente == null) {
                        System.out.println("Cliente no registrado.");
                        break;
                    }

                    System.out.print("Ingrese el nombre del producto que desea comprar: ");
                    String nombreCompra = scanner.nextLine();
                    Producto productoCompra = tienda.buscarProducto(nombreCompra);

                    if (productoCompra != null) {
                        System.out.print("Ingrese la cantidad: ");
                        int cantidad = scanner.nextInt();

                        if (productoCompra.reducirStock(cantidad)) {
                            cliente.agregarAlCarrito(productoCompra, cantidad);
                            System.out.println("Producto agregado al carrito.");
                        } else {
                            System.out.println("Stock insuficiente.");
                        }
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Gracias por usar el sistema de la tienda en línea.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}


