import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerStreamTest {

    @Test
    public void getAvg() {
            List<Integer> intList = List.of(1,2,3,4,5,6,7);
            double expected = 4.0d;
            double actual = IntegerStream.getAvg(intList);

            assertEquals(expected, actual);
    }
}