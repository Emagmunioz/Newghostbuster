package model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GhostTest {

    @Test
    public void testCreateGhost() {
        Ghost ghost = new Ghost(
            "Spirit of the Fisherman of Lastres",
            Ghost.GhostClass.CLASS_IV, 
            Ghost.DangerLevel.LOW,      
            "Appears during storms on the coast"
        );

        assertThat(ghost.getName(), is("Spirit of the Fisherman of Lastres"));
        assertThat(ghost.getGhostClass(), is(Ghost.GhostClass.CLASS_IV));  
        assertThat(ghost.getDangerLevel(), is(Ghost.DangerLevel.LOW));      
        assertThat(ghost.getAbility(), is("Appears during storms on the coast"));
    }
}
