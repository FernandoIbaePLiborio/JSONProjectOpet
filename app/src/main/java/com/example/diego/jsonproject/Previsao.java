package com.example.diego.jsonproject;

/**
 * Created by Lab. Desenvolvimento on 20/03/2017.
 */

public class Previsao {
    private String cidade;
    private Double temperatura;

    public Previsao() {  }//alt + insert (atalho construtor)

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
}
