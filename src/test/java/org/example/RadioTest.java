package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testaLigaEDesliga() {
        Radio radio = new Radio();
        assertFalse(radio.estaAtivado());

        radio.ativado();
        assertTrue(radio.estaAtivado());

        radio.desativado();
        assertFalse(radio.estaAtivado());
    }

    @Test
    public void testGetVolume() {
        Radio radio = new Radio();
        assertEquals(30, radio.getVolume());
    }

    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        assertEquals(50, radio.getVolume());

        radio.setVolume(120);
        assertEquals(100, radio.getVolume());

        radio.setVolume(-10);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void testGetCanal() {
        Radio radio = new Radio();
        assertEquals(1, radio.getCanal());
    }

    @Test
    public void testSetCanal() {
        Radio radio = new Radio();
        radio.setCanal(5);
        assertEquals(5, radio.getCanal());

        radio.setCanal(-3);
        assertEquals(-3, radio.getCanal());
    }

}