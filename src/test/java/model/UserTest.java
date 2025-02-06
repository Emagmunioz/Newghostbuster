package model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.time.LocalDate;

public class UserTest {

    @Test
    public void testCaptureGhost() {
        User user = new User();
        Ghost ghost = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        user.captureGhost(ghost);
        assertThat(user.getCapturedGhosts(), hasSize(1));
        assertThat(user.getCapturedGhosts(), contains(ghost));
    }

    @Test
    public void testReleaseGhost() {
        User user = new User();
        Ghost ghost = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        user.captureGhost(ghost);
        user.releaseGhost(ghost);
        assertThat(user.getCapturedGhosts(), hasSize(0));
    }

    @Test
    public void testFilterByClass() {
        User user = new User();
        Ghost ghost1 = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        Ghost ghost2 = new Ghost("Shadows of Mount Naranco", GhostClass.CLASS_II, DangerLevel.MEDIUM, "Appears in mountains");
        user.captureGhost(ghost1);
        user.captureGhost(ghost2);

        List<Ghost> filtered = user.filterByClass(GhostClass.CLASS_IV);
        assertThat(filtered, hasSize(1));
        assertThat(filtered, contains(ghost1));
    }

    @Test
    public void testFilterByMonth() {
        User user = new User();
        Ghost ghost1 = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        user.captureGhost(ghost1);

        List<Ghost> filtered = user.filterByMonth(LocalDate.now().getMonthValue());
        assertThat(filtered, hasSize(1));
        assertThat(filtered, contains(ghost1));
    }
}
