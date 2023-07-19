fun main(args: Array<String>) {
    // 1. If
    val examResult = isPass(70)
    println(examResult)

    val is3Contained = is3Contain(1..10)
    println("is3Contained Result: ${is3Contained}")
    // 2. When
}
fun isPass(examScore: Int) :Boolean {
    return examScore >= 60
}

fun is3Contain(intRange: IntRange) : Boolean{
    return intRange.contains(3)
}