class Vehiculo {
    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;
    //una variable static se comparte entre todas las instancias de la clase
    private static int cantidadVahiculos = 0;
    //Metodo constructor: metodo que se encarga de inicializar nuestra instancia
    public Vehiculo() {
        cantidadVahiculos++;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
        cantidadVahiculos++;
    }

    public Vehiculo(String marca, String color){
        this.marca = marca;
        this.color = color;
        cantidadVahiculos++;
    }

    public int getAnio(){
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

}