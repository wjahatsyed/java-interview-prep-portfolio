package com.wjahatsyed;

import com.wjahatsyed.java_basics.DataTypesDemo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTypesDemoTest {

    @Test
    void testDataTypes() {
        DataTypesDemo demo = new DataTypesDemo();
        assertTrue(demo.isBooleanType(), "Boolean type should return true");
        assertEquals(1000000000L, demo.getLongType(), "Long type should be initialized correctly");
        assertEquals(10.5f, demo.getFloatType(), 0.01, "Float type should be initialized to 3.14");
    }
}
