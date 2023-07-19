fun main(args: Array<String>) {
    // 1. If
    val examResult = isPass(70)
    println(examResult)
    // 2. When
}
fun isPass(examScore: Int) :Boolean {
    return examScore >= 60
}

//fun is3Contain(intRange: IntRange) : Boolean{
//    for(i in arr){
//        if(i == 3) {
//            return true
//        }else{
//            return false
//        }
//    }
//}