package br.com.fiap.model;

public class Destino {

    private String enderecoDestino;
    private String cidadeDestino;
    private String estadoDestino;
    
    
    public Destino(String enderecoDestino, String cidadeDestino, String estadoDestino) {
        this.enderecoDestino = enderecoDestino;
        this.cidadeDestino = cidadeDestino;
        this.estadoDestino = estadoDestino;
    }
    
    public String getEnderecoDestino() {
        return enderecoDestino;
    }
    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }
    public String getCidadeDestino() {
        return cidadeDestino;
    }
    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }
    public String getEstadoDestino() {
        return estadoDestino;
    }
    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }
    
    @Override
    public String toString() {
        return "Destino [enderecoDestino=" + enderecoDestino + ", cidadeDestino=" + cidadeDestino + ", estadoDestino="
                + estadoDestino + "]";
    }
}
