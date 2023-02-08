import java.util.ArrayList;

public class PedidoKiosko {
    ArrayList<Articulo> menu;
    ArrayList<Pedido> pedidos;

    public PedidoKiosko() {
        menu = new ArrayList<Articulo>();
        pedidos = new ArrayList<Pedido>();
    }

    public void addMenuItem(String nombre, double precio) {
        Articulo nuevoArticulo = new Articulo(nombre, precio);
        menu.add(nuevoArticulo);
        nuevoArticulo.setIndex(menu.indexOf(nuevoArticulo));
    }

    public void addMenuItem() {
        System.out.println("Ingrese el nombre de su nuevo producto:");
        String nombre = System.console().readLine();
        System.out.println("Ingrese el precio de su nuevo producto:");
        String precio = System.console().readLine();
        Articulo nuevoArticulo = new Articulo(nombre, Double.parseDouble(precio));
        menu.add(nuevoArticulo);
        nuevoArticulo.setIndex(menu.indexOf(nuevoArticulo));
    }

    public void displayMenu(){
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).getIndex()+" "+menu.get(i).getNombre()+" --- $"+ menu.get(i).getPrecio());
        }
    }

    public void newOrder() {
        
    	// Mostrar al usuario un aviso de mensaje y luego establece su entrada en una variable, nombre
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();
    
    	// Tu código:
        // Crea un nuevo pedido con la cadena de entrada dada
        Pedido nuevoPedido = new Pedido(name);
        pedidos.add(nuevoPedido);
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        displayMenu();
    	// Pedir al usuario que ingrese un número de artículo
        System.out.println("Ingrese un índice de artículo del menú o q para salir:");
        String itemNumber = System.console().readLine();
        
        // Escribir un bucle while para recopilar todos los artículos del pedido del usuario
        while(!itemNumber.equals("q")) {
            
            // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            nuevoPedido.addArticulo(menu.get(Integer.parseInt(itemNumber)));
            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su entrada
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = System.console().readLine();
        }
        // Después de haber completado su pedido, imprime los detalles del pedido
        nuevoPedido.display();
    	// como el ejemplo de abajo. Puedes utilizar el método de visualización del pedido
    }

}
