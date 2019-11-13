import org.junit.Test
import org.junit.Assert.*

// tests for function sortArray(arr: IntArray): IntArray

class TestTask04 {
    @Test
    fun testEmptyArray() {
        val emptyArray = IntArray(0)
        assertArrayEquals("Returns wrong: empty array", emptyArray, sortArray(emptyArray))
    }

    @Test
    fun testOnLyNegativeItems() {
        val negativeArray: IntArray = intArrayOf(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10)
        assertArrayEquals("Returns wrong: negative array", negativeArray, sortArray(negativeArray))
    }

    @Test
    fun testOnLyPositiveItems() {
        val positiveArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertArrayEquals("Returns wrong: positive array", positiveArray, sortArray(positiveArray))
    }

    @Test
    fun testSortedArray() {
        val sortedArray: IntArray = intArrayOf(-1, -4, -5, -8, -10, 2, 3, 6, 7, 9)
        assertArrayEquals("Returns wrong: sorted array", sortedArray, sortArray(sortedArray))
    }

    @Test
    fun testUnsortedArray() {
        val unsortedArray: IntArray = intArrayOf(-1, 2, 3, -4, -5, 6, 7, -8, 9, -10)
        val sortedArray: IntArray = intArrayOf(-1, -4, -5, -8, -10, 2, 3, 6, 7, 9)
        assertArrayEquals("Returns wrong: unsorted array", sortedArray, sortArray(unsortedArray))
    }
}