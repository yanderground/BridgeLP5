package org.example;


public class ControleUniversal implements Controle {
    protected Dispositivo dispositivo;


    @Override
    public void power() {
        if (dispositivo.estaAtivado()) {
            dispositivo.desativado();
        } else {
            dispositivo.ativado();
        }
    }

    @Override
    public void volumeMenos() {
        dispositivo.setVolume(dispositivo.getVolume() - 10);
    }

    @Override
    public void volumeMais() {
        dispositivo.setVolume(dispositivo.getVolume() + 10);
    }

    @Override
    public void canalMenos() {
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }

    @Override
    public void canalMais() {
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }
}
