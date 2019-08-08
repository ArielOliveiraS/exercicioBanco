package br.digitalhouse.exerciciobanco;

public class Principal {
    public static void main(String[] args) {
        Cliente ariel = new Cliente( "Ariel", "Oliveira", "0909", "0000000", "000000000");
        ContaCorrente conta1 = new ContaCorrente();
        System.out.println(ariel.status());
        conta1.deposito(100);
        conta1.depositarcheque(10);
        conta1.consultar();

    }
}
