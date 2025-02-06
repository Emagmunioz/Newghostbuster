package model;

import java.time.LocalDate;

public class Ghost {
private String name;
    private ClassGhost class;
    private DangerLevel dangerLevel;
    private String ability;
    private LocalDate dateBusted;
    public String getName() {
        return name;
    }
    public ClassGhost getClass() {
        return class;
    }
    public DangerLevel getDangerLevel() {
        return DangerLevel;
    }
    public String getAbility() {
        return ability;
    }
    public LocalDate getDateBusted() {
        return dateBusted;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClass(ClassGhost class) {
        this.class = class;
    }
    public void setDangerLevel(DangerLevel dangerLevel) {
        this.dangerLevel = dangerLevel;
    }
    public void setAbility(String ability) {
        this.ability = ability;
    }
    public void setDateBusted(LocalDate dateBusted) {
        this.dateBusted = dateBusted;
    }
}
