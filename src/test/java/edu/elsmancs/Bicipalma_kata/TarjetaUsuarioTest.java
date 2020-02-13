package edu.elsmancs.Bicipalma_kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class TarjetaUsuarioTest {

    @Test
    public void comprobarTarjetaActivada() {
        TarjetaUsuario tarjeta = new TarjetaUsuario(123456789, true);
        assertEquals(true, tarjeta.getActivada());
    }

    @Test
    public void comprobarTarjetaDesactivada() {
        TarjetaUsuario tarjeta = new TarjetaUsuario(123456789, false);
        assertEquals(false, tarjeta.getActivada());
    }
}
