fun main(args: Array<String>) {
    /**
     * [Collection]
     * 1. List
     * 2. Set
     * 3. Map
     */

    // List
    // 코틀린의 경우 불변적인 특성을 가졌을 경우 명시하지 않아도 됨
    val list  = listOf("a", "b", "c")
    println(list[0])
    // result: a

    // 가변적인 리스트
    val mutablelist = mutableListOf("a","b","c")
    mutablelist[0] = "qwe"
    println(mutablelist)
    // result: [qwe, b, c]

    // forEach 문
    mutablelist.forEach{
        fruit -> println("fruit list: ${fruit}")
    }
}
