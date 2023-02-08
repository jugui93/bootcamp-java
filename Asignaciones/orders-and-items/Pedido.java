import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private boolean listo;
    private ArrayList<Articulo> articulos;

    public Pedido () {
        this("Invitado");
    }

    public Pedido (String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<Articulo>();
    }

    public String getNombre () {
        return this.nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public boolean estaListo(){
        return this.listo;
    }

    public void setListo () {
        this.listo = !this.listo;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public String getStatusMessage(){
        if ( this.listo){
            return "Tu pedido está listo";
        }
        return "Gracias por esperar. Tu pedido estará listo pronto";
    }

    public void display(){
        System.out.println("Nombre Cliente " + this.nombre);
        for(int i = 0; i < this.articulos.size(); i ++){
            System.out.println(this.articulos.get(i).getNombre() +": "+ this.articulos.get(i).getPrecio());
        };
        System.out.println("Total: " + this.getOrderTotal());
    }

    public double getOrderTotal(){
        double total = 0;
        for (int i = 0; i < this.articulos.size(); i++) {
            total += this.articulos.get(i).getPrecio();
        }
        return total;
    }
}