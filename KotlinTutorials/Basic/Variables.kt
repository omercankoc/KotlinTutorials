fun main(args: Array<String>) {
    
    // var type: Değiştirilebilir değerler.
    // Tür belirtilmemis.
    var myVariable = 13 / 2 //>> 6 
    println(myVariable) 
    
    // value type: Değiştirilemez değerler.
    // Tür belirtilmemis.
    val myValue = 1.25 / 2 //>> 0.625
    println(myValue)
    
    // Defining 
    var myDouble : Double
    // Initialize
    myDouble = 3.14
    // Print Console
    println("Pi=" + myDouble)
    
    // DATA TYPES
    // Boolean Type
    var booleanTrue : Boolean = true;
    var booleanFalse : Boolean = false;
    println("Boolean: $booleanTrue or $booleanFalse")
    
    // Byte Type
    var byteMaxValue : Byte = Byte.MAX_VALUE
    var byteMinValue : Byte = Byte.MIN_VALUE
    println("Byte Max Value " + byteMaxValue + "Min Value " + byteMinValue)
     
    // Short Type
    var shortMaxValue : Short = Short.MAX_VALUE
    var shortMinValue : Short = Short.MIN_VALUE
    println("Short Max Value " + shortMaxValue + "Min Value " + shortMinValue)
    
    // Integer Type
    var integerMaxValue : Int = Int.MAX_VALUE
    var integerMinValue : Int = Int.MIN_VALUE
    println("Integer Max Value " + integerMaxValue + "Min Value " + integerMinValue)
           
    // Float Type
    var floatMaxValue : Float = Float.MAX_VALUE
    var floatMinValue : Float = Float.MIN_VALUE
    println("Float Max Value " + floatMaxValue + "Min Value " + floatMinValue)
    
    // Double Type
    var doubleMaxValue : Double = Double.MAX_VALUE
    var doubleMinValue : Double = Double.MIN_VALUE
    println("Double Max Value " + doubleMaxValue + "Min Value " + doubleMinValue)
    
    // Long Type
    var longMaxValue : Long = Long.MAX_VALUE
    var longMinValue : Long = Long.MIN_VALUE
    println("Long Max Value " + longMaxValue + "Min Value " + longMinValue)
    
    // Nullability: Bos birakilabilir degisken.
    // Nullable(?) and Non-Nullable
    
    var booleanVar : Boolean? = null
    var byteVar : Byte? = null
    var shortVar : Short? = null
    var integerVar : Int? = null
    var floatVar : Float? = null
    var doubleVar : Double? = null
    var longVar : Long? = null
    var stringVar : String? = null
    
    // Deger atamasi yapilmadan bu degskenler kullanilabilir.
    println(integerVar)
    println(stringVar)
    
    // Fakat bu degerler ile bir islem yapılmaya kalktiginda hata alinir.
    // integerVar * 2 -> Hatali Kod
    // Bu hatanin onune gecilmesi icin: (variableName!!)
    println(integerVar!!*2)
    // !! -> Degiskenin degeri kesinlikle initialize edilecek, deger gelince islem yapilacak anlamina gelir.
}
