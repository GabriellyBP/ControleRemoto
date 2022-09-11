package br.com.gabrielly;

public class aparelhos {

    int canal, volume;
    String nome;
    boolean ligado;

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

    public void setCanal(int canal) {
        if (canal <= 100) {
            this.canal = canal;
        } else {
            System.out.println("Canal escolhido nao existe");
        }
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setVolume(int volume) {
        if (volume <= 100) {
            this.volume = volume;
        } else {
            this.volume = 100;
            System.out.println("Volume maior que o maximo permitido, setado o valor maximo");
        }
    }

    public void ligaDesliga(boolean ligaDesliga) {
        this.setLigado(ligaDesliga);

    }
}
