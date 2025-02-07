package controler;
import model.Ghost;
import model.Ghost.DangerLevel;
import model.Ghost.GhostClass;
import model.Player;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
public class ControlerTest {

@Test
 public void testCaptureGhost() {
    Player player = new Player();
    Controler controler = new Controler(player);
    controler.captureGhost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
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
 @Test
    public void testFilterByClass() {
        Player player = new Player();
        Ghost ghost1 = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        Ghost ghost2 = new Ghost("Shadows of Mount Naranco", GhostClass.CLASS_II, DangerLevel.MEDIUM, "Appears in mountains");
        player.captureGhost(ghost1);
        player.captureGhost(ghost2);

        List<Ghost> filtered = player.filterByClass(GhostClass.CLASS_IV);
        assertThat(filtered, hasSize(1));
        assertThat(filtered, contains(ghost1));
    }
 @Test
    public void testFilterByMonth() {
        Player player = new Player();
        Ghost ghost1 = new Ghost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        player.captureGhost(ghost1);

        List<Ghost> filtered = player.filterByMonth(LocalDate.now().getMonthValue());
        assertThat(filtered, hasSize(1));
        assertThat(filtered, contains(ghost1));
    }

}
