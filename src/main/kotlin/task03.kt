import java.lang.NumberFormatException

fun main() {
    try {
        println(getSeasonByMonthNumber(readLine()?.toInt()))
    }
    catch (e: NumberFormatException) {
        print("Введёная строка не является числом")
    }
}

fun getSeasonByMonthNumber(numberOfMonth: Int?): String {
    return when(numberOfMonth) {
        1, 2, 12 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Такого месяца не существует."
    }
}