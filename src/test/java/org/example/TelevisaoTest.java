package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisaoTest {
    @Test
    public void testEstaAtivado() {
        Televisao tv = new Televisao();
        assertFalse(tv.estaAtivado());

        tv.ativado();
        assertTrue(tv.estaAtivado());

        tv.desativado();
        assertFalse(tv.estaAtivado());
    }

    @Test
    public void testGetVolume() {
        Televisao tv = new Televisao();
        assertEquals(30, tv.getVolume()); 
    }

    @Test
    public void testSetVolume() {
        Televisao tv = new Televisao();
        tv.setVolume(50);
        assertEquals(50, tv.getVolume());

        tv.setVolume(120);
        assertEquals(100, tv.getVolume()); 

        tv.setVolume(-10);
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void testGetCanal() {
        Televisao tv = new Televisao();
        assertEquals(1, tv.getCanal()); 
    }

    @Test
    public void testSetCanal() {
        Televisao tv = new Televisao();
        tv.setCanal(5);
        assertEquals(5, tv.getCanal()); 

        tv.setCanal(-3);
        assertEquals(-3, tv.getCanal()); 
    }
}
