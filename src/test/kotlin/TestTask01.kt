import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class TestTask01 {
    private val outContent = ByteArrayOutputStream()
    private val errContent = ByteArrayOutputStream()

    @Before
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
        System.setErr(PrintStream(errContent))
    }

    @After
    fun cleanUpStreams() {
        System.setOut(null)
        System.setErr(null)
    }

    @Test
    fun testZero() {
        System.setIn(ByteArrayInputStream("0".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with arg: 0", "Вы ввели число: 0.", outContent.toString())
    }

    @Test
    fun testPositive() {
        System.setIn(ByteArrayInputStream("1".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with positive arg.", "Вы ввели число: 1.", outContent.toString())
    }

    @Test
    fun testNegative() {
        System.setIn(ByteArrayInputStream("-1".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with negative arg.", "Вы ввели число: -1.", outContent.toString())
    }

    @Test
    fun testEmptyString() {
        System.setIn(ByteArrayInputStream("".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with arg: empty String.", "Введённая строка не является числом.", outContent.toString())
    }

    @Test
    fun testString() {
        System.setIn(ByteArrayInputStream("Some String".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with arg: String.", "Введённая строка не является числом.", outContent.toString())
    }

    @Test
    fun testChar() {
        System.setIn(ByteArrayInputStream("!@#$%^&*()_+".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with arg: char.", "Введённая строка не является числом.", outContent.toString())
    }

    @Test
    fun testVeryLongNumber() {
        System.setIn(ByteArrayInputStream("10000000000000000000000000000000000000000".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with very long number.", "Вы ввели число: 10000000000000000000000000000000000000000.", outContent.toString())
    }

    @Test
    fun testFloatNumber() {
        System.setIn(ByteArrayInputStream("1.5".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with float number.", "Введённая строка не является числом.", outContent.toString())
    }

    @Test
    fun testDigitsAndLetter() {
        System.setIn(ByteArrayInputStream("111aaa111".toByteArray()))
        readAndPrint()
        assertEquals("Wrong output with digits and letters.", "Введённая строка не является числом.", outContent.toString())
    }
}