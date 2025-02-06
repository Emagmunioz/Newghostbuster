package controller;

import model.Ghost;
import model.Player;
import java.util.List;

public class Controller {
    private Player player;

    public Controller(Player player) {
        this.player = player;
    }

    public void captureGhost(String name, Ghost.GhostClass ghostClass, Ghost.DangerLevel dangerLevel, String ability) {
        Ghost ghost = new Ghost(name, ghostClass, dangerLevel, ability);
        player.captureGhost(ghost);
    }

    public void releaseGhost(Ghost ghost) {
        player.releaseGhost(ghost);
    }

    public List<Ghost> filterByClass(Ghost.GhostClass ghostClass) {
        return player.filterByClass(ghostClass);
    }

    public List<Ghost> filterByMonth(int month) {
        return player.filterByMonth(month);
    }

    public List<Ghost> getCapturedGhosts() {
        return player.getCapturedGhosts();
    }
}