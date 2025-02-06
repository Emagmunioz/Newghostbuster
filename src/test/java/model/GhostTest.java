package model;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GhostTest {

    @Test
    public void testCreateGhost() {
        Ghost ghost = new Fantasma("Espíritu del Pescador de Lastres", ClaseFantasma.CLASE_IV, NivelPeligro.BAJO, "Aparecer durante tormentas en la costa");
        assertThat(ghost.getName(), is("Espíritu del Pescador de Lastres"));
        assertThat(ghost.getClass(), is(ClaseFantasma.CLASE_IV));
        assertThat(ghost.getDangerLevel(), is(NivelPeligro.BAJO));
        assertThat(ghost.getAbilityd(), is("Aparecer durante tormentas en la costa"));
    }
}