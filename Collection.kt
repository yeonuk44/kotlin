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

//    // Set
//    // 중복된 요쇼를 거른 순서가 없는 자료형이다.
//
//    // Immutable Set
//    val immutableNumSet = setOf(1,2,2,3,1,4)
//    println(immutableNumSet)
//    // result: [1, 2, 3, 4]
//
//    // Mutable Set
//    val mutableNumSet = mutableSetOf(1,2,3,4,4,4,4,5,6,5)
//    mutableNumSet.add(100)
//    println(mutableNumSet)
//    // result: [1, 2, 3, 4, 5, 6, 100]
//
//    mutableNumSet.remove(2)
//    println(mutableNumSet)
//    // result: [1, 3, 4, 5, 6, 100]
//
//    println(mutableNumSet.contains(2))
//    // result: false

    // Map
    // immutable의 경우는 불변하는 값에 맞춰 아무것도 값을 변경할 수가 없다.
    // JS에서는 객체 내부의 속성에 대한 값은 const로 선언해도 변경이 가능했으나 kotlin에서는 불가능하다.
    val immutableMap = mapOf("name" to "asd", "age" to 123, "height" to 176)
    println(immutableMap)

    val mutableMap = mutableMapOf("name" to "asd", "age" to 123, "height" to 176)
    println(mutableMap["age"])
    // result: 123

    mutableMap["age"] = 10
    println(mutableMap["age"])
    // result: 10

    mutableMap.put("hobby", "coding")
    println(mutableMap)
    // result: {name=asd, age=10, height=176, hobby=coding}

    mutableMap.remove("name")
    println(mutableMap)
    // result: {age=10, height=176, hobby=coding}

    mutableMap.replace("age", 80)
    println(mutableMap)
    // result: {age=80, height=176, hobby=coding}

}


