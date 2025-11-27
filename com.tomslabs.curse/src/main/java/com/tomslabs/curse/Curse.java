package com.tomslabs.curse;

public record Curse(String curseText) {
    public static Curse createCurse(String newCurseText) {
        return new Curse(newCurseText);
    }

    @Override
    public String toString() {
        return curseText();
    }
}
