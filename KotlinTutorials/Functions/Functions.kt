fun main(args: Array<String>) {
    
    // Fonksiyon Tanimlama
    // fun functionName(argument : argumentType, ... ) : returnType   
    fun Calculate(base : Double, exponent : Int) : Double{
        var result : Double = 1.0
        var iterator : Int = 1
		while(iterator <= exponent){
            result *= base
            iterator++
        }
        return result
    }
    
    // Parametresiz Fonksiyon
    fun Message(){
        println("Hello Kotlin!")
    }
    
    // Parametre almayan fakat sonuc donduren fonksiyon
    fun JVMLanguages() : String{
        return "Java Scala Clojure Groovy Kotlin"
    }
     
    // Function Overloading
    fun Message(message : String) : String{
        var message = "Hello"
        return message
    }
    
    // Function Overloading
    fun Message(name : String, surname : String) :  String{
        var message = "Hello" + " " + name + " " + surname
        return message
    }
     
    Message()
    println(JVMLanguages())
    println(Calculate(3.14,7))
    println(Message("Hello"))
    println(Message("Name","Surname" ))
  
}
