import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomCacheTest {

    @Test
    void putCacheTest() {
        CustomCache custC = new CustomCache();
        assertTrue(custC.putCache("name","key", "value"));
    }

    @Test
    void getCacheTest() {
        CustomCache custC = new CustomCache();
        Object value = "value";
        custC.putCache("name","key", value);
        Object result = custC.getCache("name","key");
        assertEquals(value, result);
    }

    @Test
    void clearTest() {
        CustomCache custC = new CustomCache();
        custC.putCache("name","key", "value");
        custC.putCache("name1","key1", "value1");
        custC.clear("name");
        Object result = custC.getCache("name", "key");
        assertNull(result);
    }

    @Test
    void clearAllTest() {
        CustomCache custC = new CustomCache();
        custC.putCache("name","key", "value");
        custC.clearAll();
        assertEquals(0, custC.getSize());
    }
}