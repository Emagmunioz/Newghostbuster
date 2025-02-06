package model;

import java.time.LocalDate;

public class Ghost {
    public enum GhostClass {
        CLASS_I, CLASS_II, CLASS_III, CLASS_IV, CLASS_V, CLASS_VI, CLASS_VII
    }

    public enum DangerLevel {
        LOW, MEDIUM, HIGH, CRITICAL
    }

    private String name;
    private GhostClass ghostClass;
    private DangerLevel dangerLevel;
    private String ability;
    private LocalDate captureDate;

    public Ghost(String name, GhostClass ghostClass, DangerLevel dangerLevel, String ability) {
        this.name = name;
        this.ghostClass = ghostClass;
        this.dangerLevel = dangerLevel;
        this.ability = ability;
        this.captureDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public GhostClass getGhostClass() {
        return ghostClass;
    }

    public DangerLevel getDangerLevel() {
        return dangerLevel;
    }

    public String getAbility() {
        return ability;
    }

    public LocalDate getCaptureDate() {
        return captureDate;
    }

    @Override
    public String toString() {
        return "Ghost{name='" + name + "', class=" + ghostClass + 
               ", danger=" + dangerLevel + ", ability='" + ability + 
               "', captured=" + captureDate + "}";
    }
}