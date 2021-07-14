// Lambda Functions
// 1. Tip : val/var FunctionName = {valueName : valueType, ... -> operations}
// 2. Tip : val/var FunctionName : (ValueType, ...) -> returnType = { ValueName, ... -> operations }
fun main() {
    
    // Parametresiz Lambda Fonksiyonu
    val Message	= {username : String -> println("Hello $username")}
    // Parametreli 1. Tip Lambda Fonksiyonu
    val FirstExponent = {base : Int, exponent : Int -> Math.pow(base.toDouble(), exponent.toDouble()).toInt()}
    // Parametreli 2. Tip Lambda Fonksiyonu
    val SecondExponent : (Int, Int) -> Int = { base, exponent -> Math.pow(base.toDouble(),exponent.toDouble()).toInt()}
    
    // Asynchrnous
    // Kullanimlari : Callback Functions or Listener Function or Completion Functions
    // Async Function
    fun DownloadData(url : String, completion : () -> Unit){
        // Operations
        println(url)
        completion()
    }
    
    Message("test")
    println(FirstExponent(3,5))
    println(SecondExponent(3,5))
    DownloadData("https://www.youtube.com/channel", { println("Downloaded Datas!")})
}
