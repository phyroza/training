package com.tomslabs.curses;

import com.tomslabs.curse.Curse;
import com.tomslabs.curse.Curser;

public class HappinessCurser implements Curser {
    @Override
    public Curse castCurse() {
        return Curse.createCurse("May your shoelaces always be tied together!");
    }
}
