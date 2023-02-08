public class TestBaristaChallenge {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("moka",2.5);
        Articulo articulo2 = new Articulo("latte", 3.5);
        Articulo articulo3 = new Articulo("café de goteo", 2.9);
        Articulo articulo4 = new Articulo("capuchino", 5.3);

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido("Jimmy");
        Pedido pedido4 = new Pedido("Noah");
        Pedido pedido5 = new Pedido("Sam");

        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo2);
        pedido2.addArticulo(articulo1);
        pedido2.addArticulo(articulo3);
        pedido3.addArticulo(articulo1);
        pedido3.addArticulo(articulo4);
        pedido4.addArticulo(articulo2);
        pedido4.addArticulo(articulo3);
        pedido5.addArticulo(articulo2);
        pedido5.addArticulo(articulo4);

        pedido1.display();
        pedido2.display();
        pedido3.display();
        pedido4.display();
        pedido5.display();

        pedido1.setListo();
        pedido3.setListo();
        pedido5.setListo();

        System.out.println(pedido1.getStatusMessage());
        System.out.println(pedido2.getStatusMessage());
        System.out.println(pedido3.getStatusMessage());
        System.out.println(pedido4.getStatusMessage());

    
    }
}
