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
        assertEquals("Wrong value with arg: 1", "один", intAsString(1))
    }

    @Test
    fun testOneDigit2() {
        assertEquals("Wrong value with arg: 2", "два", intAsString(2))
    }

    @Test
    fun testOneDigit3() {
        assertEquals("Wrong value with arg: 3", "три", intAsString(3))
    }

    @Test
    fun testOneDigit4() {
        assertEquals("Wrong value with arg: 4", "четыре", intAsString(4))
    }

    @Test
    fun testOneDigit5() {
        assertEquals("Wrong value with arg: 5", "пять", intAsString(5))
    }

    @Test
    fun testOneDigit6() {
        assertEquals("Wrong value with arg: 6", "шесть", intAsString(6))
    }

    @Test
    fun testOneDigit7() {
        assertEquals("Wrong value with arg: 7", "семь", intAsString(7))
    }

    @Test
    fun testOneDigit8() {
        assertEquals("Wrong value with arg: 8", "восемь", intAsString(8))
    }

    @Test
    fun testOneDigit9() {
        assertEquals("Wrong value with arg: 9", "девять", intAsString(9))
    }

    // Двузначное - teens
    @Test
    fun testTwoDigitTeen10() {
        assertEquals("Wrong value with arg: 10", "десять", intAsString(10))
    }

    @Test
    fun testTwoDigitTeen11() {
        assertEquals("Wrong value with arg: 11", "одиннадцать", intAsString(11))
    }

    @Test
    fun testTwoDigitTeen12() {
        assertEquals("Wrong value with arg: 12", "двенадцать", intAsString(12))
    }

    @Test
    fun testTwoDigitTeen13() {
        assertEquals("Wrong value with arg: 13", "тринадцать", intAsString(13))
    }

    @Test
    fun testTwoDigitTeen14() {
        assertEquals("Wrong value with arg: 14", "четырнадцать", intAsString(14))
    }

    @Test
    fun testTwoDigitTeen15() {
        assertEquals("Wrong value with arg: 15", "пятнадцать", intAsString(15))
    }

    @Test
    fun testTwoDigitTeen16() {
        assertEquals("Wrong value with arg: 16", "шестнадцать", intAsString(16))
    }

    @Test
    fun testTwoDigitTeen17() {
        assertEquals("Wrong value with arg: 17", "семнадцать", intAsString(17))
    }

    @Test
    fun testTwoDigitTeen18() {
        assertEquals("Wrong value with arg: 18", "восемнадцать", intAsString(18))
    }

    @Test
    fun testTwoDigitTeen19() {
        assertEquals("Wrong value with arg: 19", "девятнадцать", intAsString(19))
    }

    // // Двузначное - ty

    @Test
    fun testTwoDigitTy20() {
        assertEquals("Wrong value with arg: 20", "двадцать", intAsString(20))
    }

    @Test
    fun testTwoDigitTeen30() {
        assertEquals("Wrong value with arg: 30", "тридцать", intAsString(30))
    }

    @Test
    fun testTwoDigitTeen40() {
        assertEquals("Wrong value with arg: 40", "сорок", intAsString(40))
    }

    @Test
    fun testTwoDigitTeen50() {
        assertEquals("Wrong value with arg: 50", "пятьдесят", intAsString(50))
    }

    @Test
    fun testTwoDigitTeen60() {
        assertEquals("Wrong value with arg: 60", "шестьдесят", intAsString(60))
    }

    @Test
    fun testTwoDigitTeen70() {
        assertEquals("Wrong value with arg: 70", "семьдесят", intAsString(70))
    }

    @Test
    fun testTwoDigitTeen80() {
        assertEquals("Wrong value with arg: 80", "восемьдесят", intAsString(80))
    }

    @Test
    fun testTwoDigitTeen90() {
        assertEquals("Wrong value with arg: 90", "девяносто", intAsString(90))
    }

    // Трёхзначное
    @Test
    fun testThreeDigitTeen() {
        assertEquals("Wrong value with arg: three digit", "одиннадцать", intAsString(11))
    }
}