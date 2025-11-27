package com.tomslabs.curses;

import com.tomslabs.curse.Curse;

public class HappinessCurses {
    public static Curse smallCurse()
    {
        return Curse.createCurse("May your shoelaces always be tied together!");
    }

    public static Curse meanCurse()
    {
        return Curse.createCurse("May your enemies know what you've done to you");
    }
}
