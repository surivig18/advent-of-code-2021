fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        var count = 0;
        val windowedList = input.windowed(3,1)

        windowedList.forEachIndexed { index, stringList ->
            val integerList = stringList.map{it.toInt()}
            val currentSum = integerList.sum()
            if( index >  0) {
                val integerList = windowedList[index - 1].map{it.toInt()}
                val previousSum = integerList.sum()
                if(currentSum > previousSum)
                count++
            }
        }
        return count
    }

    // test if implementation meets criteria from the description, like:

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
