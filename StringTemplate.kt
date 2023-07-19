fun main(args: Array<String>) {
    /**
     * String template
     * JS와는 다르게 백틱을 사용하지 않아도 문자열 템플릿을 사용할 수 있음
     */
    val price = 1000
    val tax = 100

    val originalPrice = "The original price is $price"
    val taxPrice = "The tax price is ${price+tax}"

    println(originalPrice)
    println(taxPrice)
}