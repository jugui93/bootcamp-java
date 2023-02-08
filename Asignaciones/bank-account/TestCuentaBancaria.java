public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();

        cuentaBancaria1.depositarDineroCuentaCorriente(5000);
        cuentaBancaria1.consultarSaldo();

        System.out.println(cuentaBancaria1.getNumeroDeCuenta());
    }
}
