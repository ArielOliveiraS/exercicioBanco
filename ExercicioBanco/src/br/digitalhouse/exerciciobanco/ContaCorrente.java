package br.digitalhouse.exerciciobanco;

public class ContaCorrente extends Conta {

    @Override
    public void deposito(double valor) {
        super.deposito(valor);
        valor += getSaldo();
        System.out.println("O depósito de: "+ valor +" foi realizado com sucesso!");
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        valor-= getSaldo();
        System.out.println("O saque foi realizado com  sucesso!");
    }

    @Override
    public void consultar() {
        super.consultar();

        System.out.println("Seu saldo é R$: "+ getSaldo());
    }

    public void depositarcheque(double valor){
        Cheque cheque;
        System.out.println("O depósito de: "+ valor+ " foi realizado com sucesso!");
    }
    public ContaCorrente(){

    }
}
