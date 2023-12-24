import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArrayDifferenza3Test {

    @Test
    public void testBasicCase() {
        int[] arrayA = { 1, 2, 3, 4, 5 };
        int[] arrayB = { 3, 4, 5, 6, 7 };
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysWithCommonElements() {
        int[] arrayA = { 1, 2, 3, 4, 5 };
        int[] arrayB = { 3, 4, 5, 6, 7, 8 };
        int[] expected = { 1, 2 };
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysWithNoCommonElements() {
        int[] arrayA = { 1, 2, 3 };
        int[] arrayB = { 4, 5, 6 };
        int[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testEmptyArray() {
        int[] arrayA = {};
        int[] arrayB = {};
        int[] expected = {};
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testOneEmptyArray() {
        int[] arrayA = { 1, 2, 3 };
        int[] arrayB = {};
        int[] expected = { 1, 2, 3 };
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysWithNegativeNumbers() {
        int[] arrayA = { -1, -2, -3, 0, 1 };
        int[] arrayB = { -3, 0, 1, 2, 3 };
        int[] expected = { -1, -2 };
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysWithDuplicateElements() {
        int[] arrayA = { 1, 2, 2, 3, 4, 5 };
        int[] arrayB = { 2, 4, 6 };
        int[] expected = { 1, 3, 5 };
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testBothArraysEmptyWithDuplicates() {
        int[] arrayA = {};
        int[] arrayB = {};
        int[] expected = {};
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysDuplicateElements() {
        int[] arrayA = {1, 2, 2, 3, 4, 5};
        int[] arrayB = {2, 4, 6};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysMaxIntegerValues() {
        int[] arrayA = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        int[] arrayB = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] expected = {0};
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysRepeatedPatterns() {
        int[] arrayA = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] arrayB = {2, 4, 6};
        int[] expected = {1, 3};
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }

    @Test
    public void testArraysNegativeAndPositiveValues() {
        int[] arrayA = {-1, -2, -3, 0, 1};
        int[] arrayB = {-3, 0, 1, 2, 3};
        int[] expected = {-1, -2};
        assertArrayEquals(expected, ArrayDifferenza3.diff(arrayA, arrayB));
    }
}
