import org.junit.Test
import org.junit.Assert.*

// Test for function getSeasonByMonthNumber(monthNumber: Int): String

class TestTask03 {
    @Test
    fun testWinterJanuary() {
        assertEquals("Wrong season: January", "Зима", getSeasonByMonthNumber(1))
    }

    @Test
    fun testWinterFebruary() {
        assertEquals("Wrong season: February", "Зима", getSeasonByMonthNumber(2))
    }

    @Test
    fun testSpringMarch() {
        assertEquals("Wrong season: March", "Весна", getSeasonByMonthNumber(3))
    }

    @Test
    fun testSpringApril() {
        assertEquals("Wrong season: April", "Весна", getSeasonByMonthNumber(4))
    }

    @Test
    fun testSpringMay() {
        assertEquals("Wrong season: May", "Весна", getSeasonByMonthNumber(5))
    }

    @Test
    fun testSummerJuny() {
        assertEquals("Wrong season: Juny", "Лето", getSeasonByMonthNumber(6))
    }

    @Test
    fun testSummerJuly() {
        assertEquals("Wrong season: July", "Лето", getSeasonByMonthNumber(7))
    }

    @Test
    fun testSummerAugust() {
        assertEquals("Wrong season: August", "Лето", getSeasonByMonthNumber(8))
    }

    @Test
    fun testFallSeptember() {
        assertEquals("Wrong season: September", "Осень", getSeasonByMonthNumber(9))
    }

    @Test
    fun testFallOctober() {
        assertEquals("Wrong season: October", "Осень", getSeasonByMonthNumber(10))
    }

    @Test
    fun testFallNovember() {
        assertEquals("Wrong season: November", "Осень", getSeasonByMonthNumber(11))
    }

    @Test
    fun testWinterDecember() {
        assertEquals("Wrong season: December", "Зима", getSeasonByMonthNumber(12))
    }

    @Test
    fun testZero() {
        assertEquals("Wrong answer: 0", "Такого месяца не существует.", getSeasonByMonthNumber(0))
    }

    @Test
    fun testNegative() {
        assertEquals("Wrong answer: negative", "Такого месяца не существует.", getSeasonByMonthNumber(-1))
    }

    @Test
    fun testGreaterThan12() {
        assertEquals("Wrong answer: greater than 12", "Такого месяца не существует.", getSeasonByMonthNumber(13))
    }

    @Test
    fun testNull() {
        assertEquals("Wrong answer: null", "Такого месяца не существует.", getSeasonByMonthNumber(null))
    }
}