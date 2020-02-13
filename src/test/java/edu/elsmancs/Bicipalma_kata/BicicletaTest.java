package edu.elsmancs.Bicipalma_kata;
import org.junit.Test;

import static org.junit.Assert.*;

public class BicicletaTest {

    @Test
    public void getIdTest() {
        Bicicleta bici = new Bicicleta(323);
        assertEquals(3, bici.getId());
    }
}
