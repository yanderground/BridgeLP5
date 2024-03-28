package org.example;

public interface Dispositivo {
    boolean estaAtivado();

    void ativado();

    void desativado();

    int getVolume();

    void setVolume(int percent);

    int getCanal();

    void setCanal(int channel);

}