package br.com.fiap.pacman;

public class Booster extends Item {
    private int duracao;
    

    public Booster(int duracao, int x, int y) {
        super(x, y);
        this.duracao = duracao;
    }

    public Booster(int i, int j) {
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
}
