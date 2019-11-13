import java.lang.NumberFormatException

fun main() {
    try {
        val size = readLine()?.toInt()
        if (size != null) {
            val arrOfInt = IntArray(size)
            for (i in 0 until size) {
                val newInt = readLine()?.toInt()
                if (newInt != null)
                    arrOfInt[i] = newInt
                else
                    throw NumberFormatException("")
            }
            sortArray(arrOfInt)
        }
        else
            throw NumberFormatException("")
    }
    catch (e: NumberFormatException) {
        println("Введённое число не является целым")
    }
}

fun sortArray(arr: IntArray): IntArray {
    val sortedArr = IntArray(arr.size) { 0 }
    var negativeCount = 0
    var positiveIndex = arr.size

    for (i in arr)
        if (i >= 0) {
            var count = positiveIndex
            while (count <= (arr.size - 1)) {
                sortedArr[count - 1] = sortedArr[count]
                count++
            }
            sortedArr[arr.size-1] = i
            positiveIndex--
        }
        else {
            sortedArr[negativeCount] = i
            negativeCount++
        }
    return sortedArr
}