package br.com.gabrielly;

public class Televisao extends Aparelhos {

    public Televisao(int canal, int volume, String nome, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.nome = "Televisão";
        this.ligado = ligado;
    }
    
    public Televisao(){
        this.setNome("Televisão");
    }

}
