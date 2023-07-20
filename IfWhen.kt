fun main(args: Array<String>) {
    // 1. If
    val examResult = isPass(70)
    println(examResult)

    val is3Contained = is3Contain(1..10)
    println("is3Contained Result: ${is3Contained}")
    // 2. When
    val myGrade = getGrade(80)
    println("My grade : $myGrade")
}
fun isPass(examScore: Int) :Boolean {
    return examScore >= 60
}

// if(조건){return} else{return}
fun is3Contain(intRange: IntRange) : Boolean{
    return intRange.contains(3)
}

// swich문의 개념이라 생각하면 될 듯
// when(파라미터){ in {파라미터에 대한 조건} -> {return} ... }
fun getGrade(score: Int):Char {
    when (score) {
        in 0..40 -> return 'D'
        in 41..80 -> return 'C'
        in 71..90 -> return 'B'
        in 91..100 -> return 'A'
        else -> return 'Z'
    }
}

