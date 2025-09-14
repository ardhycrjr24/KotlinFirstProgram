fun main(args: Array<String>) {
    //Perintah masukkan di Kotlin yaitu sebuah fungsi readLine()!!.
    //Parrot program
    println("Hi I'm Lora, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
}