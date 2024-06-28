public class Moeda extends Conta{
    protected double dolar;
    protected double saldoDolar;

    public Moeda(Cliente cliente, double dolar, double saldoDolar) {
        super(cliente);
        this.dolar = dolar;
        this.saldoDolar = saldoDolar;
    }

    public double getDolar() {
        return dolar;
    }

    public double getSaldoDolar() {
        return saldoDolar;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Dolar");
    }
}
