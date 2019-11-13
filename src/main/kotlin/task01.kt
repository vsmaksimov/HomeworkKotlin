fun main() {
    readAndPrint()
}

fun readAndPrint() {
    val regExpForDigits = Regex(pattern = """^[-]?(\d)+$""")

    val inputString = readLine()
    if (inputString != null) {
        if (regExpForDigits.containsMatchIn(inputString)) {
            print("Вы ввели число: $inputString.")
        } else {
            print("Введённая строка не является числом.")
        }
    }
    else {
        print("Введённая строка не является числом.")
    }
}
