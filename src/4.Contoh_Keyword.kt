fun main() {
    // contoh Keyword val dan var (deklarasi variabel)
    val nama = "Andi"   // val → tidak bisa diubah (immutable)
    var umur = 20       // var → bisa diubah (mutable)

    println("Nama: $nama, Umur: $umur")

    umur = 21 // ✅ boleh
    // nama = "Budi" ❌ error, karena val tidak bisa diubah
}
