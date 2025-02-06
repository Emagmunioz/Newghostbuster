package controler;
import model.Ghost;
import model.Player;
import model.GhostClass;
import model.DangerLevel;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ControlerTest {

    @Test
    public void testCaptureGhost() {
        User user = new User();
        GhostController controller = new GhostController(user);
        controller.captureGhost("Spirit of the Fisherman of Lastres", GhostClass.CLASS_IV, DangerLevel.LOW, "Appears during storms on the coast");
        assertThat(user.getCapturedGhosts(), hasSize(1));
    }
}
