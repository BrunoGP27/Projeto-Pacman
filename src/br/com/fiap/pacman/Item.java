package br.com.fiap.pacman;

public abstract class Item extends GameObject{
    private boolean visible;

    public Item(int x, int y) {
        super(x, y);
    }

    public Item() {
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
}
