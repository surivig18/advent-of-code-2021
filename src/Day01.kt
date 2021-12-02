fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        var count = 0;
        input.forEachIndexed { index, s ->
            if( index >  0) {
                if(Integer.parseInt(s) > Integer.parseInt(input[index - 1]))
                count++
            }
        }
        return count
    }

    // test if implementation meets criteria from the description, like:

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
