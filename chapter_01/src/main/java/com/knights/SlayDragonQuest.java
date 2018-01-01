package com.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

    /*
     * 杀龙探险
     */
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }


    public void embark() {
        //开始杀龙
        stream.println("Embarking on quest to slay the dragon");
    }
}
