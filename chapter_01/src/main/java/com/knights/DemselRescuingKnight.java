package com.knights;

public class DemselRescuingKnight implements Knight {

    /*
     * 少女营救骑士类
     */
    private RescueDamselQuest quest;//探秘

    public DemselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    //走上探险
    public void embarkOnQuest() {
        quest.embark();
    }
}
