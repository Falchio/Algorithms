package `01_introduction_to_algorithms`

fun main() {
    print(sortedArray.binarySearch(99))
}


val sortedArray = (0..128 step 1).toList()


fun List<Int>.binarySearch(item: Int): Int? {
    var min = 0
    var max = lastIndex
    var i = 1
    while (min <= max) {
        val mid = (min + max) / 2

        println("min: $min; mid: $mid; max: $max;")

        val guess = this[mid]
        if (guess == item) {
            println("число попыток: $i")
            return mid
        }
        if (guess > item) {
            max = mid - 1
            println("загадано число: $item; догадка равна $guess; снижаем верхнюю границу до: $max")
        } else {
            min = mid + 1
            println("загадано число: $item; догадка равна $guess; повышаем нижнюю границу до: $min")
        }
        i++
    }
    return null
}

