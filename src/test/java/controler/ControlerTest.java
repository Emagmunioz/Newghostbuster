package controler;
import model.Ghost;
import model.Player;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ControlerTest {

    @Test
    public void testCaptureGhost() {
        Player player = new Player();
        GhostController controller = new GhostController(player);
        controller.captureGhost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        assertThat(player.getCapturedGhosts(), hasSize(1));
    }

@Test
public void testReleaseGhost() {
    Player player = new Player();
    Ghost ghost = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
    player.captureGhost(ghost);
    player.releaseGhost(ghost);
    assertThat(player.getCapturedGhosts(), hasSize(0));
}
}
