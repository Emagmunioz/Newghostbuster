package model;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GhostTest {

    @Test
    public void testCrearFantasma() {
        Ghost ghost = new Fantasma("Espíritu del Pescador de Lastres", ClaseFantasma.CLASE_IV, NivelPeligro.BAJO, "Aparecer durante tormentas en la costa");
        assertThat(ghost.getNombre(), is("Espíritu del Pescador de Lastres"));
        assertThat(ghost.getClase(), is(ClaseFantasma.CLASE_IV));
        assertThat(ghost.getNivelPeligro(), is(NivelPeligro.BAJO));
        assertThat(ghost.getHabilidad(), is("Aparecer durante tormentas en la costa"));
    }
}