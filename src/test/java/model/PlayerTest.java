package model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.time.LocalDate;

public class PlayerTest {

    @Test
    public void testCaptureGhost() {
        Player player = new Player();
        Ghost ghost = new Ghost("Spirit of the Fisherman of Lastres", 
                                Ghost.GhostClass.CLASS_IV, 
                                Ghost.DangerLevel.LOW, 
                                "Appears during storms on the coast");
        player.captureGhost(ghost);
        assertThat(player.getCapturedGhosts(), hasSize(1));
        assertThat(player.getCapturedGhosts(), contains(ghost));
    }

    @Test
    public void testReleaseGhost() {
        Player player = new Player();
        Ghost ghost = new Ghost("Spirit of the Fisherman of Lastres", 
                                Ghost.GhostClass.CLASS_IV, 
                                Ghost.DangerLevel.LOW, 
                                "Appears during storms on the coast");
        player.captureGhost(ghost);
        player.releaseGhost(ghost);
        assertThat(player.getCapturedGhosts(), hasSize(0));
    }

    @Test
    public void testFilterByClass() {
        Player player = new Player();
        Ghost ghost1 = new Ghost("Spirit of the Fisherman of Lastres", 
                                 Ghost.GhostClass.CLASS_IV, 
                                 Ghost.DangerLevel.LOW, 
                                 "Appears during storms on the coast");
        Ghost ghost2 = new Ghost("Shadows of Mount Naranco", 
                                 Ghost.GhostClass.CLASS_II, 
                                 Ghost.DangerLevel.MEDIUM, 
                                 "Appears in mountains");
        player.captureGhost(ghost1);
        player.captureGhost(ghost2);

        List<Ghost> filtered = player.filterByClass(Ghost.GhostClass.CLASS_IV);
        assertThat(filtered, hasSize(1));
        assertThat(filtered, contains(ghost1));
    }

    @Test
    public void testFilterByMonth() {
        Player player = new Player();
        Ghost ghost1 = new Ghost("Spirit of the Fisherman of Lastres", 
                                 Ghost.GhostClass.CLASS_IV, 
                                 Ghost.DangerLevel.LOW, 
                                 "Appears during storms on the coast");
        player.captureGhost(ghost1);

        List<Ghost> filtered = player.filterByMonth(LocalDate.now().getMonthValue());
        assertThat(filtered, hasSize(1));
        assertThat(filtered, contains(ghost1));
    }
}
