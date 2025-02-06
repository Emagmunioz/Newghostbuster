package model;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GhostTest {

    @Test
    public void testCreateGhost() {
        Ghost ghost = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        assertThat(ghost.getName(), is("Spirit of the Fisherman of Lastres"));
        assertThat(ghost.getGhostClass(), is(GhostClass.CLASS_IV));
        assertThat(ghost.getDangerLevel(), is(DangerLevel.LOW));
        assertThat(ghost.getAbility(), is("Appears during storms on the coast"));
    }
}