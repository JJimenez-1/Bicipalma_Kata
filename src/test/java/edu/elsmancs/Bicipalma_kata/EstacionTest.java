package edu.elsmancs.Bicipalma_kata;

import org.junit.Test;

import static org.junit.Assert.*;


public class EstacionTest {

    @Test
    public void getIdTest() {
        Estacion estacion = new Estacion(4, "Pepito de los palotes", 5);
        assertEquals(4, estacion.getId());
    }

    @Test
    public void getDireccionTest() {
        Estacion estacion = new Estacion(4, "Maria Antonia salva numero 14", 5);
        assertEquals("Maria Antonia salva numero 14", estacion.getDireccion());
    }

    @Test
    public void getAnclajesTest() {
        Estacion estacion = new Estacion(4, "Maria Antonia salva numero 14", 12);
        assertEquals(12, estacion.getNumeroAnclajes());
    }

    @Test
    public void consultarEstacionTest() {
        Estacion estacion = new Estacion(4, "Virgen Del Pilar 123", 10);
        assertEquals(4, estacion.getId());
        assertEquals("Virgen Del Pilar 123", estacion.getDireccion());
        assertEquals(10, estacion.getNumeroAnclajes());
    }

    @Test


}
