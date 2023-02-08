public class TestVehiculo {
    public static void main(String[] args) {
        
        //Crear un vehiculo
        Vehiculo auto1 = new Vehiculo();//hacemos una nueva instancia de vehiculo
        auto1.setAnio(2018);
        auto1.setMarca("Renault");
        auto1.setModelo("Sandero");
        auto1.setColor("Gris comet");
        auto1.setRuedas(4);

        System.out.println("Marca Auto1: " + auto1.getMarca());

        //Crear un vehiculo
        // Vehiculo auto2 = new Vehiculo();//hacemos una nueva instancia de vehiculo
        // auto2.anio = 2001;
        // auto2.marca = "Honda";
        // auto2.modelo ="Civic";
        // auto2.color = "blanco";
        // auto2.ruedas = 4;

        // System.out.println("Marca Auto2: " + auto2.marca);

        Vehiculo auto3 = new Vehiculo("Chevrolet");

        Vehiculo auto4 = new Vehiculo("Kia", "Negro");
    }
}
