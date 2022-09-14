package br.com.gabrielly;

public class Decodificador extends Aparelhos{
    
    public Decodificador(int canal, int volume, String nome, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.nome = "Decodificador";
        this.ligado = ligado;
    }
    public Decodificador(){
        this.setNome("Decodificador");
    }
   
}
