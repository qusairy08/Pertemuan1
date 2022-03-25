fun main() {
    println("bilangan bulat")
    //  kode program menggunakan tipe data bilangan bulat
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit

    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)
println()
println("decimal")
    //kode program menggunakan tipe data bilangan decimal (floating-point)q
    val maxFloat: Float = 9.123456789f
    val maxDouble: Double = 9.123456789
    println("maxFloat:" + maxFloat)
    println("maxDouble:" + maxDouble)

    println()
    println("literal konstan")
    // kode program menggunakan literal konstan
    val floatLiteral : Float = 178.95F //Literal Float
    println("Contoh Literal Float : " + floatLiteral)
    val oneBillion: Long = 1000000000L //Literal Long
    println("Contoh Literal Long : " + oneBillion)
    val valHeksa = 0x0F //Literal heksadesimal diawali dengan 0x
    println("Contoh Literal Heksadesimal : " + valHeksa)
    val valBinary = 0b00001011 //Literal binary diawali dengan 0b
    println("Contoh Literal Binary : " + valBinary)
    val notasiKonvensional = 123.5e10
    println("Contoh Literal Konvensional Floating Point Number : " + notasiKonvensional)

    println()
    println("Underscore dalam Literal")
    //underscore dalam literal, untuk memberikan kemudahan pada pengembang dalam membaca dan menulis kode program.
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println("oneMillion = " + oneMillion)
    println("creditCardNumber = " + creditCardNumber)
    println("socialSecurityNumber = " + socialSecurityNumber)
    println("hexBytes = " + hexBytes)
    println("bytes = " + bytes)

    println()
    println("Representasi")
    /*
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a : " + (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA ===
            anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : "
            + (boxedA == anotherBoxedA))
     */
     //kode penerapan konversi secara eksplisit:
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)

}