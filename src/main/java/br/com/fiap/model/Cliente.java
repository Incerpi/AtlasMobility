package br.com.fiap.model;

public class Cliente{

    private String nomeCliente;
    private int cpfCliente;
    private int telefoneCliente;
    private String emailCliente;
    
    public Cliente(String nomeCliente, int cpfCliente, int telefoneCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
        
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public int getTelefoneCliente() {
        return telefoneCliente;
    }
    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
    public String getEmailCliente() {
        return emailCliente;
    }
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nomeCliente + "\nCPF: " + cpfCliente + "\nContato: "
                + telefoneCliente + "\nEmail: " + emailCliente;
    }

}
