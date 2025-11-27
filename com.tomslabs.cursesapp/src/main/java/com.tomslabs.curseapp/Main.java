package com.tomslabs.curseapp;

import com.tomslabs.curses.HappinessCurses;
import com.tomslabs.math.integer.IntOperations;

public class Main {
    static void main() {
        String curse = HappinessCurses.smallCurse();
        IO.println(curse);

        for (int i = 1; i <= 5; i++) {
            IO.println(i + " + 10 = " + IntOperations.add(i, 10));
        }
    }
}
