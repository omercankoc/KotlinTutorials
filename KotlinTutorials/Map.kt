fun main(args: Array<String>) {
    //Map: Key-Value tipinde eşleşme imkanı sunar.
    var myMap = mapOf<Int, String>(1 to "A", 2 to "B", 3 to "C")
    
    
    //HashMap: Key-Value tipinde eslesme imkani sunar ve degisiklik yapilmasina izin verir.
    var myHashMap = HashMap<Int, String>()
    
    // Ekleme.
    myHashMap.put(6,"Ankara")
    myHashMap.put(34,"Istanbul")
    myHashMap.put(35,"Izmir")
    
    // Cagirma.
    print(myHashMap[34])
    
}
