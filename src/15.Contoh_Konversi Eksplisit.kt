fun main(args: Array<String>) {
    var varInt: Int = 1
    var varSum: Long = 3L + varInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + varSum)
    val valLong: Long = varInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)
}
