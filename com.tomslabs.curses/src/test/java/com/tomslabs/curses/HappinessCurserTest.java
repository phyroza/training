package com.tomslabs.curses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappinessCurserTest {
    private final HappinessCurser curser = new HappinessCurser();

    @Test
    void castCurse() {
        assertEquals("May your shoelaces always be tied together!", curser.castCurse().toString());
    }
}