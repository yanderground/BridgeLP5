package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisaoTest {
    @Test
    public void testEstaAtivado() {
        Televisao tv = new Televisao();
        assertFalse(tv.estaAtivado()); // A televisão deve estar desligada inicialmente

        tv.ativado();
        assertTrue(tv.estaAtivado()); // A televisão deve estar ligada após chamar ativado()

        tv.desativado();
        assertFalse(tv.estaAtivado()); // A televisão deve estar desligada após chamar desativado()
    }

    @Test
    public void testGetVolume() {
        Televisao tv = new Televisao();
        assertEquals(30, tv.getVolume()); // o volume inicia como 30
    }

    @Test
    public void testSetVolume() {
        Televisao tv = new Televisao();
        tv.setVolume(50);
        assertEquals(50, tv.getVolume()); // ajusta pra 50

        tv.setVolume(120);
        assertEquals(100, tv.getVolume()); // o volume máximo é 100, então deve ser ajustado para 100

        tv.setVolume(-10);
        assertEquals(0, tv.getVolume()); // o volume mínimo é 0, então deve ser ajustado para 0
    }

    @Test
    public void testGetCanal() {
        Televisao tv = new Televisao();
        assertEquals(1, tv.getCanal()); // O canal deve ser inicializado como 1
    }

    @Test
    public void testSetCanal() {
        Televisao tv = new Televisao();
        tv.setCanal(5);
        assertEquals(5, tv.getCanal()); // O canal deve ser ajustado para 5

        tv.setCanal(-3);
        assertEquals(-3, tv.getCanal()); // Deve aceitar números negativos como canal
    }
}