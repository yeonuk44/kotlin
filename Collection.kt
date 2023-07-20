fun main(args: Array<String>) {
    /**
     * [Collection]
     * 1. List
     * 2. Set
     * 3. Map
     */

//    // List
//    // 코틀린의 경우 불변적인 특성을 가졌을 경우 명시하지 않아도 됨
//    val list  = listOf("a", "b", "c")
//    println(list[0])
//    // result: a
//
//    // 가변적인 리스트
//    val mutablelist = mutableListOf("a","b","c")
//    mutablelist[0] = "qwe"
//    println(mutablelist)
//    // result: [qwe, b, c]
//
//    // forEach 문
//    mutablelist.forEach{
//        fruit -> println("fruit list: ${fruit}")
//    }

    // Set
    // 중복된 요쇼를 거른 순서가 없는 자료형이다.

    // Immutable Set
    val immutableNumSet = setOf(1,2,2,3,1,4)
    println(immutableNumSet)
    // result: [1, 2, 3, 4]

    // Mutable Set
    val mutableNumSet = mutableSetOf(1,2,3,4,4,4,4,5,6,5)
    mutableNumSet.add(100)
    println(mutableNumSet)
    // result: [1, 2, 3, 4, 5, 6, 100]

    mutableNumSet.remove(2)
    println(mutableNumSet)
    // result: [1, 3, 4, 5, 6, 100]

    println(mutableNumSet.contains(2))
    // result: false
}
