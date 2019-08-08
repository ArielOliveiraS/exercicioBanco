package br.digitalhouse.exerciciobanco;

public class ContaPoupanca extends Conta {
    @Override
    public void deposito(double valor) {
        super.deposito(valor);
        valor += getSaldo();
        System.out.println("O depósito foi realizado com sucesso!");
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

    public void recolhimentoDeJuros(){
        double  saldoSoma = getSaldo() + (getSaldo()*0.01);
        System.out.println("Seu novo saldo é de R$ "+ saldoSoma);
//        System.out.println("O valor para recolhimento foi de R$" + (getSaldo()*0.01) + ".");
//        System.out.println("Seu novo saldo é de R$" + getSaldo() + (getSaldo()*0.01));

    }

    public ContaPoupanca() {
    }
}
