fun main(args: Array<String>) {
    
    // var : Variable -> Değiştirilebilir değerler.
    // val : Value -> Değiştirilemez (sabit) değerler.

    // Tür belirtilmemis bir degişkenin tanimlanmasi.
    var variable = 13 / 2 //>> 6 
    println(variable) 
    
    // Tür belirtilmemis bir sabit tanimlanmasi.
    val value = 1.25 / 2 //>> 0.625
    println(value)
    
    // Defining 
    var pi : Double
    // Initialize
    pi = 3.1415    
    // Print Console
    println("Pi = " + pi)
     
    // Boolean ----------------------------------------------------------
    var booleanTrue : Boolean = true;
    var booleanFalse : Boolean = false;
    println("Boolean: $booleanTrue or $booleanFalse")
    
    // Byte -------------------------------------------------------------
    var byteMaxValue : Byte = Byte.MAX_VALUE
    var byteMinValue : Byte = Byte.MIN_VALUE
    println("Byte Max Value " + byteMaxValue + "Min Value " + byteMinValue)
     
    // Short ------------------------------------------------------------
    var shortMaxValue : Short = Short.MAX_VALUE
    var shortMinValue : Short = Short.MIN_VALUE
    println("Short Max Value " + shortMaxValue + "Min Value " + shortMinValue)
    
    // Integer ----------------------------------------------------------
    var integerMaxValue : Int = Int.MAX_VALUE
    var integerMinValue : Int = Int.MIN_VALUE
    println("Integer Max Value " + integerMaxValue + "Min Value " + integerMinValue)
           
    // Float ------------------------------------------------------------
    var floatMaxValue : Float = Float.MAX_VALUE
    var floatMinValue : Float = Float.MIN_VALUE
    println("Float Max Value " + floatMaxValue + "Min Value " + floatMinValue)
    
    // Double -----------------------------------------------------------
    var doubleMaxValue : Double = Double.MAX_VALUE
    var doubleMinValue : Double = Double.MIN_VALUE
    println("Double Max Value " + doubleMaxValue + "Min Value " + doubleMinValue)
    
    // Long -------------------------------------------------------------
    var longMaxValue : Long = Long.MAX_VALUE
    var longMinValue : Long = Long.MIN_VALUE
    println("Long Max Value " + longMaxValue + "Min Value " + longMinValue)
    
    // Char -------------------------------------------------------------
    var letter : Char = 'A'
    println(letter)
    
    // String -----------------------------------------------------------
    var message : String = "Hello World!"
    var user : String = "omercankoc"
    println(message + user)
    println("Username : $user ")
    // Methods :
    println("Capitalize : ${user.capitalize()}") // Bas harfini buyuk harf yap.
    
    
    // Type Convertion -------------------------------------------------- 
    var myDouble : Double = 1.68
    var myInteger : Int = 13
    
    println(myDouble.toInt())
    println(myInteger.toDouble())
   
}
