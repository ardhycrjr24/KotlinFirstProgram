fun main(args: Array<String>) {
    val myName: String = "Depandi Enda"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    //menggabungkan String dengan tipe data lain dengan menggunakan operator +
    val s = "abc" + 1
    println(s + "def")

    // String yang memuat keywords Kotlin bisa dengan menggunakan
    //raw String yang dipisahkan dengan triple quotes (""")
    var text = """ 
        for (c in "foo") 
            print(c) 
    """
    println(text)

}