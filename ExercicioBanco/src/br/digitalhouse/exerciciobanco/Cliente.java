package br.digitalhouse.exerciciobanco;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String numCliente;
    private String rg;
    private String cpf;



    public String status() {
        return "Cliente " +
                  nome + '\'' +
                " " + sobrenome + '\n' +
                "Código " + numCliente + '\n' +
                "RG " + rg + '\n' +
                "CPF " + cpf + '\n'
                ;
    }


    public Cliente(String nome, String sobrenome, String numCliente, String rg, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numCliente = numCliente;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
