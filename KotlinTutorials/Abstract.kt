/*
 * Abstract Class: Interface'ler gibi nesne olusturamayan soyut siniflardir.
 * Kalitim ile properties'leri devralinabilir. 
 * Ortak properties'ler kalitim ile aktarilan her class'da ortak operasyonu yurutur. 
 * Ayrik properties'ler override edilip ozellestirilebilir.
 * "open" anahtar kelimesi kalitim ile properties'lerin aktarilabilecegi anlamina gelir. 
 * "abstract" anahtar kelimesi Abstract Class tanimlanmasini saglar.
 */
open abstract class Database{
    // Ortak Fonksiyon
    fun Create(){
        println("Create Database!")
    }
    
    // Ozellestirilecek Fonksiyonlar
    abstract fun Add()
    abstract fun Delete()
    abstract fun Update()
}

class SQLServer : Database(){
    // Ozellestirilmis Fonksiyonlar
    override fun Add(){
    	println("Added item in SQL Server!")    
    }
    override fun Delete(){
        println("Deleted item in SQL Server")
    }
    override fun Update(){
        println("Updated item in SQL Server")
    }
}

class Oracle : Database(){
    // Ozellestirilmis Fonksiyonlar
    override fun Add(){
    	println("Added item in Oracle")    
    }
    override fun Delete(){
        println("Deleted item in Oracle")
    }
    override fun Update(){
        println("Updated item in Oracle")
    }
}

fun main() {
    
    var sqlserver = SQLServer()
    sqlserver.Create()
    sqlserver.Add()
    sqlserver.Delete()
    sqlserver.Update()
    
    var oracle = Oracle()
    oracle.Create()
    oracle.Add()
    oracle.Delete()
    oracle.Update()

}
