package br.com.fiap.model;

public class Usuario {
    
    private String nomeUsuario;
    private String senhaUsuario;
    
    
    public Usuario(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public String toString() {
        return "Usuario [nomeUsuario=" + nomeUsuario + ", senhaUsuario=" + senhaUsuario + "]";
    }
}