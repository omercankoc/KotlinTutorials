fun main(args: Array<String>) {
    
    // var : Variable - Değiştirilebilir değerler.
    // val : Value - Değiştirilemez (sabit) değerler.

    // Tür belirtilmemis bir degişkenin tanimlanmasi.
    var myVariable = 13 / 2 //>> 6 
    println(myVariable) 
    
    // Tür belirtilmemis bir sabit tanimlanmasi.
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
}
