package br.com.fiap.model;

public class Localizacao {
    
    private String enderecoLocalizacao;
    private String cidadeLocalizacao;
    private String estadoLocalizacao;
    
    public Localizacao(String enderecoLocalizacao, String cidadeLocalizacao, String estadoLocalizacao) {
        this.enderecoLocalizacao = enderecoLocalizacao;
        this.cidadeLocalizacao = cidadeLocalizacao;
        this.estadoLocalizacao = estadoLocalizacao;
    }
    
    public String getEnderecoLocalizacao() {
        return enderecoLocalizacao;
    }
    public void setEnderecoLocalizacao(String enderecoLocalizacao) {
        this.enderecoLocalizacao = enderecoLocalizacao;
    }
    public String getCidadeLocalizacao() {
        return cidadeLocalizacao;
    }
    public void setCidadeLocalizacao(String cidadeLocalizacao) {
        this.cidadeLocalizacao = cidadeLocalizacao;
    }
    public String getEstadoLocalizacao() {
        return estadoLocalizacao;
    }
    public void setEstadoLocalizacao(String estadoLocalizacao) {
        this.estadoLocalizacao = estadoLocalizacao;
    }

    @Override
    public String toString() {
        return "Localizacao [enderecoLocalizacao=" + enderecoLocalizacao + ", cidadeLocalizacao=" + cidadeLocalizacao
                + ", estadoLocalizacao=" + estadoLocalizacao + "]";
    }

}


