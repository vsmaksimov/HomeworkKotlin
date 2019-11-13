import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class TestTask02 {
    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()

    private val errorExpected = "Введённая строка не является трёхзначным числом."
    private val successExpected = "Справа налево: "

    @Before
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
        System.setErr(PrintStream(errContent))
    }

    @Test
    fun testOneDigit() {
        System.setIn(ByteArrayInputStream("0".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: one digit", errorExpected, outContent.toString())
    }

    @Test
    fun testTwoDigit() {
        System.setIn(ByteArrayInputStream("10".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: two digit", errorExpected, outContent.toString())
    }

    @Test
    fun testFourDigit() {
        System.setIn(ByteArrayInputStream("1000".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: four digit", errorExpected, outContent.toString())
    }

    @Test
    fun testEmptyString() {
        System.setIn(ByteArrayInputStream("".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: empty String.", errorExpected, outContent.toString())
    }

    @Test
    fun testString() {
        System.setIn(ByteArrayInputStream("Some String".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: String.", errorExpected, outContent.toString())
    }

    @Test
    fun testChar() {
        System.setIn(ByteArrayInputStream("!@#$%^&*()_+".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: Char.", errorExpected, outContent.toString())
    }

    @Test
    fun testThreeSameDigits() {
        System.setIn(ByteArrayInputStream("111".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: String.", successExpected + "111", outContent.toString())
    }

    @Test
    fun testTwoZeroAtEnd() {
        System.setIn(ByteArrayInputStream("100".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: two zero at end.", successExpected + "001", outContent.toString())
    }

    @Test
    fun testTwoZeroOnTheSides() {
        System.setIn(ByteArrayInputStream("010".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: two zero on the sides.", successExpected + "010", outContent.toString())
    }

    @Test
    fun testTwoZeroAtFront() {
        System.setIn(ByteArrayInputStream("001".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output with arg: two zero at front.", successExpected + "100", outContent.toString())
    }

    @Test
    fun testReverse() {
        System.setIn(ByteArrayInputStream("123".toByteArray()))
        readAndReverse()
        assertEquals("Wrong output.", successExpected + "321", outContent.toString())
    }
}