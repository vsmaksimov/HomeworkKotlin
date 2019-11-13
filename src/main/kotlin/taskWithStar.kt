import java.lang.NumberFormatException

fun main() {
    val inputString = readLine()
    try {
        println(intAsString(inputString?.toInt()))
    }
    catch (e: NumberFormatException) {
        println("Введёная строка не является числом.")
    }
}

fun intAsString(n: Int?): String {
    var outputString = ""
    if (n in 0..1000 && n != null) {
        if (n == 1000) {
            outputString = "тысяча"
        } else if (n == 0) {
            outputString = "ноль"
        } else {
            when (n / 100) {
                1 -> outputString = "сто"
                2 -> outputString = "двести"
                3 -> outputString = "триста"
                4 -> outputString = "четыреста"
                5 -> outputString = "пятьсот"
                6 -> outputString = "шестьсот"
                7 -> outputString = "семьсот"
                8 -> outputString = "восемьсот"
                9 -> outputString = "девятьсот"
            }
            if (n >= 100 && n % 100 >= 10) {
                outputString += " ";
            }
            when ((n % 100) / 10) {
                2 -> outputString = outputString + "двадцать"
                3 -> outputString = outputString + "тридцать"
                4 -> outputString = outputString + "сорок"
                5 -> outputString = outputString + "пятьдесят"
                6 -> outputString = outputString + "шестьдесят"
                7 -> outputString = outputString + "семьдесят"
                8 -> outputString = outputString + "восемьдесят"
                9 -> outputString = outputString + "девяносто"
            }
            if ((n % 100 >= 10) && (n % 100 < 20)) {
                when (n % 100) {
                    10 -> outputString = outputString + "десять"
                    11 -> outputString = outputString + "одиннадцать"
                    12 -> outputString = outputString + "двенадцать"
                    13 -> outputString = outputString + "тринадцать"
                    14 -> outputString = outputString + "четырнадцать"
                    15 -> outputString = outputString + "пятнадцать"
                    16 -> outputString = outputString + "шестнадцать"
                    17 -> outputString = outputString + "семнадцать"
                    18 -> outputString = outputString + "восемнадцать"
                    19 -> outputString = outputString + "девятнадцать"
                }
            } else {
                if (n % 10 != 0 && (n % 100 >= 20 || n >= 100)) {
                    outputString += " ";
                }
                when (n % 10) {
                    1 -> outputString = outputString + "один"
                    2 -> outputString = outputString + "два"
                    3 -> outputString = outputString + "три"
                    4 -> outputString = outputString + "четыре"
                    5 -> outputString = outputString + "пять"
                    6 -> outputString = outputString + "шесть"
                    7 -> outputString = outputString + "семь"
                    8 -> outputString = outputString + "восемь"
                    9 -> outputString = outputString + "девять"
                }
            }
        }
    } else
        outputString = "Неизвестное число"

    return outputString
}