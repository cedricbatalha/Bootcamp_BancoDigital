//classe abstrata com todos os metodos abstratos
//uma classe que obriga a implementar tudo que ela tem
public interface iConta {

    //todo métudo da interface é público. não precisa colocar

    //quando saca, saca um valor
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();

}
