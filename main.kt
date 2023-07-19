fun main(args: Array<String>) {
    val pi : Double = 3.14
    println(pi)

    var age: Int = 40


    age = 58
    println(age)

    printStudentInfo("yeonuk1", 10)
    printStudentInfo("yeonuk2", 20)
    printStudentInfo("yeonuk3", 30)

    println(addNum(100,100))
}
fun printStudentInfo(name: String, age: Int) : Unit{
    println("student name : " + name)
    println("student age : " + age)
}

fun addNum(n1: Int, n2:Int) : Int {
    return n1 + n2
}