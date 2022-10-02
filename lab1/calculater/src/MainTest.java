import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add() {
        assertEquals(4,Main.add(2,2));
    }

    @Test
    void even() {
        assertEquals(0,Main.even(2,2));
    }

    @Test
    void multy() {
        assertEquals(4,Main.multy(2,2));

    }

    @Test
    void div() {
        assertEquals(1,Main.div(2,2));

    }
}