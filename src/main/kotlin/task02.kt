fun main() {
    readAndReverse()
}

fun readAndReverse() {
    val regExpForThreeDigits = Regex(pattern="""^\d{3}$""")

    val inputString = readLine()
    if (inputString != null) {
        if (regExpForThreeDigits.containsMatchIn(inputString)) {
            print("Справа налево: ${inputString.reversed()}")
        } else {
            print("Введённая строка не является трёхзначным числом.")
        }
    }
    else {
        print("Введённая строка не является трёхзначным числом.")
    }
}