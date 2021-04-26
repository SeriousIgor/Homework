import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionsTest {

    @Test
    void removeTest() {
        StringCollections sc = new StringCollections();
        sc.add("a");
        sc.add("b");

        sc.remove("b");

        assertFalse(sc.contains("b"));
    }

    @Test
    void addNoIndexTest() {
        StringCollections sc = new StringCollections();
        Object expect = "value";

        sc.add(expect);

        Object actual = sc.sCol[sc.size() - 1];

        assertEquals(expect, actual);
    }

    @Test
    void addByIndexTest() {
        StringCollections sc = new StringCollections();
        Object expect = "value";
        int index = 4;

        sc.add(index, expect);

        Object actual = sc.sCol[index];

        assertEquals(expect, actual);
    }

    @Test
    void getTest() {
        StringCollections sc = new StringCollections();
        Object expect = "value";
        int index = 3;

        sc.add(index, expect);

        Object actual = sc.get(index);

        assertEquals(expect, actual);
    }

    @Test
    void containsTest() {
        StringCollections sc = new StringCollections();
        Object value = "c";
        sc.add(value);

        assertTrue(sc.contains(value));
    }

    @Test
    void equalsTest() {
        StringCollections sc = new StringCollections();
        StringCollections sc2 = new StringCollections();
        sc.add("a");
        sc.add("b");
        sc.add("c");
        sc2.add("a");
        sc2.add("b");
        sc2.add("c");

        assertTrue(sc.equals(sc2));

        sc2.add("d");
        assertFalse(sc.equals(sc2));
    }

    @Test
    void clearTest() {
        StringCollections sc = new StringCollections();
        sc.add("a");
        sc.clear();

        boolean b = true;
        for(Object o : sc.sCol){
            if(o != null || sc.size() != 10){
                b = false;
            }
        }

        assertTrue(b);
    }

    @Test
    void sizeTest() {
        StringCollections sc = new StringCollections();
        assertEquals(sc.size(), sc.sCol.length);
    }
}