// classe abstrata não pode ser instanciada (estratégia)
public abstract class Conta implements iConta{

    //CONSTANTE
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    double dolar = 5.19;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double saldoDolar;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //Implementar todos os métodos como obrigação:
    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
        //saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
        //saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void converterSaldoEmDolar(double valor) {
        saldoDolar = valor / dolar;
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
        System.out.println(String.format("Converter o valore de R$ " + this.saldo + " em dolar a US$ " + this.dolar));
        System.out.println(String.format("Valor do saldo convertido em dolar: US$ %.2f", this.saldoDolar));
        System.out.println(String.format("=="));

    }
}
