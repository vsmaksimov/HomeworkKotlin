import org.junit.Test
import org.junit.Assert.*

class TestTaskWithStar {
    @Test
    fun testZero() {
        assertEquals("Wrong value with arg: 0", "ноль", intAsString(0))
    }

    @Test
    fun testThousand() {
        assertEquals("Wrong value with arg: 1000", "тысяча", intAsString(1000))
    }

    // Однозначное
    @Test
    fun testOneDigit1() {
        assertEquals("Wrong value with arg: one digit", "один", intAsString(1))
    }


    // Двузначное
    @Test
    fun testTwoDigitTeen10() {
        assertEquals("Wrong value with arg: two digits 10", "десять", intAsString(10))
    }

    @Test
    fun testTwoDigitTeen11() {
        assertEquals("Wrong value with arg: two digits 11", "одиннадцать", intAsString(11))
    }

    @Test
    fun testTwoDigitZeroAtEnd() {
        assertEquals("Wrong value with arg: two digits zero at end", "двадцать", intAsString(20))
    }

    @Test
    fun testTwoDigit99() {
        assertEquals("Wrong value with arg: two digits 99", "девяносто девять", intAsString(99))
    }

    // Трёхзначное
    @Test
    fun testThreeDigit100() {
        assertEquals("Wrong value with arg: three digit 111", "сто", intAsString(100))
    }

    @Test
    fun testThreeDigitZeroAtAnd() {
        assertEquals("Wrong value with arg: three digit zero at end", "двести двадцать", intAsString(220))
    }

    @Test
    fun testThreeDigitZeroInMiddle() {
        assertEquals("Wrong value with arg: three digit zero in middle", "четыреста четыре", intAsString(404))
    }

    @Test
    fun testThreeDigit999() {
        assertEquals("Wrong value with arg: three digit 999", "девятьсот девяносто девять", intAsString(999))
    }

    @Test
    fun testGreaterThan1000() {
        assertEquals("Wrong value with arg: greater than 1000", "Неизвестное число", intAsString(1001))
    }

    @Test
    fun testNegative() {
        assertEquals("Wrong value with arg: negative", "Неизвестное число", intAsString(-1))
    }
}