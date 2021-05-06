import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StringStreamTest {

    @Test
    public void listFilter() {
        List<String> strList1 = List.of("one", "two", "three", "four", "five");

        String expected = "[{one : ONE}, {two : TWO}, {three : THREE}, {four : FOUR}, {five : FIVE}]";
        String actual = StringStream.pairList(strList1).toString();

        assertEquals(expected,actual);

    }

    @Test
    public void pairList() {
        List<String> strList2 = List.of("Value", "VAL", "val", "VALU", "valu", "WORD", "wOrD");

        List<String> expected = List.of("valu", "valu", "word", "word");
        List<String> actual = StringStream.listFilter(strList2);

        assertTrue(expected.equals(actual));;
    }
}