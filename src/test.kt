fun main() {
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var y: Int
    var x = 0
    while (x < 4) {
        y = index[x]
        x = x + 1
        println("Fruit = ${fruit[y]}")

    }
}
