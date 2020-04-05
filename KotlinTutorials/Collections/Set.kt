fun main(args: Array<String>) {
    // Set: Bir eleman sadece bir kez Set'e eklenebilir.
    var jvmLanguages = setOf<String>("Java","Kotlin","Java","Scala","Clojure","Groovy")
    println(jvmLanguages)
    
    // Boyut bilgisini al.
    println(jvmLanguages.size)
    
    // Eleman sayisi bilgisi al.
    println(jvmLanguages.count())
    
    // Her bir elemana bir operasyon ekle.
    jvmLanguages.forEach{println(it + " programming language.")}
    
    // HashSet: Bir eleman bir kez HashSet'e eklenebilir.package
    // Set'den farki sonradan eleman eklenebilir olmasi.
    var jvm = HashSet<Int>()
    jvm.add(0)
    jvm.add(1)
    jvm.add(0)
    println("Hash Set: " + jvm + " and size " + jvm.count())
    
}