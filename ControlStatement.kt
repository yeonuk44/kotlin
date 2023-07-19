fun main(args: Array<String>) {
    /**
     * Iteration Example
     */

    // Range Class
    // IntRange, LongRange, CharRange
    val numRange : IntRange = 1..5

    println(numRange.contains(3))
    println(numRange.contains(10))

    val charRange : CharRange = 'a' .. 'e'
    println(charRange.contains('a'))
    println(charRange.contains('z'))

    // 1. For
    for (i in 1..5) {
        println(i)
    }

    for(i in 1 until 10){
        println(i)
    }

    for( i in 10 downTo 1){
        println(i)
    }

    for(i in 1 .. 10 step 2){
        println(i)
    }
    // 2. While
}