package org.example;

public class Televisao implements Dispositivo {
    private boolean on = false;
    private int volume = 30;
    private int canal = 1;

    @Override
    public boolean estaAtivado() {
        return on;
    }

    @Override
    public void ativado() {
        on = true;
    }

    @Override
    public void desativado() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
    }
}
