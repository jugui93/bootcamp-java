public class TestPedidoKiosko {
    public static void main(String[] args) {
        PedidoKiosko kiosko1 = new PedidoKiosko();

        kiosko1.addMenuItem("banana", 1600);
        kiosko1.addMenuItem("café", 1200);
        kiosko1.addMenuItem("latte", 3600);
        kiosko1.addMenuItem("capuchino", 2400);
        kiosko1.addMenuItem("muffin", 3200);
        kiosko1.addMenuItem();
        kiosko1.newOrder();
    }
}
