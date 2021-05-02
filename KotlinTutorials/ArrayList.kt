fun main(args: Array<String>) {

    // Farklı veri türlerinde veri tutan ArrayList'lerin tanimlanmasi
    var languages = ArrayList<String>()
    var integers = ArrayList<Integer>()
    var decimals = ArrayList<Double>()
    var complex = ArrayList<Any>() // (tip farketmeksizin)
    
    // ArrayList'e veri ekle.
    languages.add("Scala")
    languages.add("Clojure")
    languages.add("Groovy")
    languages.add("Kotlin")
    
    // Belirtilen bir index'e veri ekle.
    languages.add(0,"Java")
    
    // ArrayList uzunluğunu al
    println("Length: " + languages.count())
   
    print(languages)

}
