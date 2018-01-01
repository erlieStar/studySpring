package com.knights;

import java.io.PrintStream;

public class Minstrel {

    /*
     * 吟游诗人
     */
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        System.out.println("singBeforeQuest");
    }

    public void singAfterQuest() {
        System.out.println("singAfterQuest");
    }
}
