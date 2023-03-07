package br.com.fiap.model;

public class Trajeto{

    private String veiculoTrajeto;
    private String horarioSaidaTrajeto;
    private String previsaoChegadaTrajeto;
    
    public Trajeto(String veiculoTrajeto, String horarioSaidaTrajeto, String previsaoChegadaTrajeto) {
        this.veiculoTrajeto = veiculoTrajeto;
        this.horarioSaidaTrajeto = horarioSaidaTrajeto;
        this.previsaoChegadaTrajeto = previsaoChegadaTrajeto;
    }
    
    public String getVeiculoTrajeto() {
        return veiculoTrajeto;
    }
    public void setVeiculoTrajeto(String veiculoTrajeto) {
        this.veiculoTrajeto = veiculoTrajeto;
    }
    public String getHorarioSaidaTrajeto() {
        return horarioSaidaTrajeto;
    }
    public void setHorarioSaidaTrajeto(String horarioSaidaTrajeto) {
        this.horarioSaidaTrajeto = horarioSaidaTrajeto;
    }
    public String getPrevisaoChegadaTrajeto() {
        return previsaoChegadaTrajeto;
    }
    public void setPrevisaoChegadaTrajeto(String previsaoChegadaTrajeto) {
        this.previsaoChegadaTrajeto = previsaoChegadaTrajeto;
    }

    @Override
    public String toString() {
        return "Veículo utilizado: " + veiculoTrajeto + "\nHorário de Saída: " + horarioSaidaTrajeto
                + "\nHorário de Chegada: " + previsaoChegadaTrajeto;
    }

}
