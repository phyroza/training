package com.tomslabs.curseapp;

import com.tomslabs.curse.Curser;
import com.tomslabs.math.integer.IntOperations;

import java.util.ServiceLoader;

public class Main {
    static void main() {
        Curser curser = ServiceLoader.load(Curser.class).findFirst().orElseThrow();
        IO.println(curser.castCurse());

        for (int i = 1; i <= 5; i++) {
            IO.println(i + " + 10 = " + IntOperations.add(i, 10));
        }
    }
}
