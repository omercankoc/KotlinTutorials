fun main(args: Array<String>) {
  
    // Array olusturuldugu an uzunluk bilgisi de olusur ve degistirilemez.
    
    // Tamsayi Array olusturma
    var integerArray = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    //var shortArray = shortArrayOf()
    //var byteArray = byteArrayOf()
    
    // Ondalikli Array olusturma
    var doubleArray = doubleArrayOf(0.0,1.0,2.0,3.0)
    // var floatArray = floatArrayOf()
    // var longArray = longArrayOf()
    
    // Komplex Array Olusturma 
    var complexArray = arrayOf("Java", 1996, "Kotlin", 2011)
    
    // String Array Olusturma
    var JVM = arrayOf("Java","Scala","Kotlin","Groovy","Clojure")
    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,0)
    println("9.Index: " + numbers.get(9))
    
    // Array uzunluğunu ver.
    println("Array Length: " + JVM.count())
    
    // Array'de belirtilen index'deki veriyi getir.
    println("JVM First Language: " + JVM[0])
    // or
    println("JVM First Language: " + JVM.get(0))
    
    // Array'de belirtilen index'deki veriyi degistir.
    JVM.set(0,"JAVA")
    println(JVM.get(0))
    // or
    JVM[2] = "KOTLIN"
    println(JVM.get(2))
}
