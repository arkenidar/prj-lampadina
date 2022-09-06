package org.example;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private static final PrintStream out = System.out;

    public static void main(String[] args) {

        out.println("Exercise: Light+Buttons");
        Light l1 = new Light(3);
        Button b1 = new Button(l1);
        Button b2 = new Button(l1);
        b1.press();
        b2.press();
        b1.press();
        b1.press();
        b1.press();
        b2.press();
    }
}