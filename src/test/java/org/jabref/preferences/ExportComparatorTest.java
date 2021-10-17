package org.jabref.preferences;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ExportComparatorTest {

    private ExportComparator comparator;
    public static List<String> list = Arrays.asList("first string");
    public static List<String> listCompare = Arrays.asList("string first");;

    @BeforeEach
    public void setup() {
        comparator = new ExportComparator();
    }

    @Test
    public void verifyComparatorEqual() {
        assertEquals(0, comparator.compare(list, list));
    }

    @Test
    public void verifyComparatorDifferent() {
        assertNotEquals(0, comparator.compare(list, listCompare));
    }

}
