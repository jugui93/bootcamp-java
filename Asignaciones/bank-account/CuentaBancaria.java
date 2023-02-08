import java.util.Random;

/**
 * CuentaBancaria
 */
public class CuentaBancaria {

    private double saldoCuentaCorriente;
    private double saldoCuentaAhorros;
    private long numeroDeCuenta;

    private static int numeroDeCuentasCreadas;
    private static int cantidadTotalDinero;

    public CuentaBancaria(){
        numeroDeCuentasCreadas++;
        this.numeroDeCuenta = generarNumeroDeCuenta();
    }
    
    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
    }

    public void depositarDineroCuentaCorriente(double cantidadDinero) {
        this.saldoCuentaCorriente += cantidadDinero;
        cantidadTotalDinero += cantidadDinero;
    }

    public void retirarDineroCuentaCorriente(double cantidadDinero) {
        if (cantidadDinero > this.saldoCuentaCorriente){
            System.out.println("Fondos insuficientes");
        }else{ 
            this.saldoCuentaCorriente -= cantidadDinero;
            cantidadTotalDinero -= cantidadDinero;
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo cuenta corriente: " + this.saldoCuentaCorriente);
        System.out.println("Saldo cuenta ahorros: " + this.saldoCuentaAhorros);
        System.out.println("Saldo total: " + (this.saldoCuentaCorriente + this.saldoCuentaAhorros));
    }

    private long generarNumeroDeCuenta() {
        Random random = new Random();
        return (long) (random.nextDouble() * 10000000000L );
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
}