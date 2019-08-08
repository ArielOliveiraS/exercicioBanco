package br.digitalhouse.exerciciobanco;

public abstract class Conta {
    protected Cliente cliente;
    private double saldo;


    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente novoCliente){
        cliente = novoCliente;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }

    public void deposito(double valor){};

//    public void deposito(double valor){
//     this.saldo += valor;
//        System.out.println("O depósito "+ this.saldo+ " foi realizado com sucesso!");
//    }
    public void sacar (double valor){
//        this.saldo -= valor;
//        System.out.println("Saque realizado com sucesso!");
    }
    public void consultar(){
//         System.out.println("Seu saldo é: "+ saldo);
    }

}
