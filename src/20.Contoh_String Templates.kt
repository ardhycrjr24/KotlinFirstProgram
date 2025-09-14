fun main(args: Array<String>) {
    //Template ekspresi String diawali dengan tanda dolar ($) diikuti oleh nama variabel yang akan
    //digabungkan kedalam suatu String.
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """ 
    ${'$'}9.99 
    """
    println(price)
}