fun main() {
    val a = 10; val b = 3
    println("Aritmatika: ${a+b}, ${a-b}, ${a*b}, ${a/b}, ${a%b}")

    var x = 5
    x += 3; x -= 1
    println("Penugasan: $x")

    println("Perbandingan: ${a>b}, ${a==b}, ${a!=b}")

    val t = true; val f = false
    println("Logika: ${t&&f}, ${t||f}, ${!t}")

    var i = 5
    println("Inc/Dec: ${i++}, ${++i}, ${i--}, ${--i}")

    print("Range: ")
    for (n in 1..5) print("$n ")
    println()

    val d: Any = "Kotlin"
    if (d is String) println("Type check: ${d.uppercase()}")

    val list = listOf(1,2,3)
    println("in: ${2 in list}, !in: ${4 !in list}")

    val n: Int? = null
    println("Elvis: ${n ?: 100}")
}
