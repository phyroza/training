import com.tomslabs.curse.Curser;
import com.tomslabs.curses.HappinessCurser;

/**
 * contains some hardcore curses
 */
module com.tomslabs.curses {
    requires transitive com.tomslabs.curse;
    exports com.tomslabs.curses;
    provides Curser with HappinessCurser;
}