package br.com.gabrielly;

public class Aparelhos {

    int canal, volume;
    String nome;
    boolean ligado;
    final int cMax = 100, vMax = 100;

    public Aparelhos(int canal, int volume, String nome, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.nome = nome;
        this.ligado = ligado;
    }

    public Aparelhos() {
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setarCanal(int canal) {
        if (canal <= cMax) {
            setCanal(canal);
        } else {
            System.out.println("Canal escolhido nao existe");
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void setarVolume(int volume) {
        if (volume <= vMax) {
            setVolume(volume);
        } else {
            setVolume(100);
            System.out.println("Volume maior que o máximo permitido, setado o valor máximo");
        }
    }
}
