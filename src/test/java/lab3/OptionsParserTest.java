package lab3;

import lab2.MoveDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OptionsParserTest {

    @Test
    public void parseTest() {
        String[] moves = {"f", "forward", "left", "r", "right", "backward", "b", "l", "r"};
        MoveDirection[] directions = {
                MoveDirection.FORWARD, MoveDirection.FORWARD, MoveDirection.LEFT, MoveDirection.RIGHT,
                MoveDirection.RIGHT, MoveDirection.BACKWARD, MoveDirection.BACKWARD, MoveDirection.LEFT,
                MoveDirection.RIGHT
        };
        assertArrayEquals(directions, OptionsParser.parse(moves));
    }

}
