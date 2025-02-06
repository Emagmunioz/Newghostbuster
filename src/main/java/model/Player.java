package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Ghost> capturedGhosts;

    public Player() {
        this.capturedGhosts = new ArrayList<>();
    }

    public void captureGhost(Ghost ghost) {
        capturedGhosts.add(ghost);
    }

    public void releaseGhost(Ghost ghost) {
        capturedGhosts.remove(ghost);
    }

    public List<Ghost> filterByClass(Ghost.GhostClass ghostClass) {
        List<Ghost> filtered = new ArrayList<>();
        for (Ghost ghost : capturedGhosts) {
            if (ghost.getGhostClass() == ghostClass) {
                filtered.add(ghost);
            }
        }
        return filtered;
    }

    public List<Ghost> filterByMonth(int month) {
        List<Ghost> filtered = new ArrayList<>();
        for (Ghost ghost : capturedGhosts) {
            if (ghost.getCaptureDate().getMonthValue() == month) {
                filtered.add(ghost);
            }
        }
        return filtered;
    }

    public List<Ghost> getCapturedGhosts() {
        return capturedGhosts;
    }
}
