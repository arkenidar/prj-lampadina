package org.example;

import java.io.PrintStream;

public class Light {
    private static final PrintStream out = System.out;
    private State state;
    private int uses;
    private int limit;

    Light(int limit) {
        state = State.OFF;
        uses = 0;
        this.limit = limit;
    }

    public void click() {
        uses++;
        if (uses > limit) {
            state = State.BROKEN;
        }
        switch (state) {
            case ON -> state = State.OFF;
            case OFF -> state = State.ON;
        }
        state();
    }

    public void state() {
        switch (state) {
            case BROKEN -> out.println("broken");
            case ON -> out.println("on");
            case OFF -> out.println("off");
        }
    }
}
