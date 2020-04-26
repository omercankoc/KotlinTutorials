// Constractor ile sinif olusturma ve o sinifta bir fonksiyon tanimlama.
class Message(var email : String, var username : String){
    fun SendMessage(email : String, username : String) : String{
        return "Hello $username. The password reset link has been sent to you at $email."
    }
}

// Data Class: Verileri tutmak icin isaretlenmis siniftir. Baska bir operasyon icin kullanilmaz.
data class User(var username: String, var email : String, var password : String ){ 
    fun hello(username : String) : String {
        return "Hello " + username
    }
}

// Sealed Class:
sealed class Database(){
    fun DatabaseMessage() : String {
        return "Database"
    }
    class Oracle : Database(){
       fun OracleMessage() : String {
           return "Oracle DB"
       } 
    }
    class Postgre : Database(){
        fun PostgreMessage() : String {
            return "Postgre DB"
        }
    }
}

fun main() {
    var message = Message("koc@mail.com","koc")
    println(message.SendMessage(message.email,message.username))
    
    var user = User("test","test@mail.com","test")
    println(user.hello(user.username))
    
    val oracle = Database.Oracle()
    println(oracle.DatabaseMessage())
    println(oracle.OracleMessage())
    
    val postgre = Database.Postgre()
    println(postgre.DatabaseMessage())
    println(postgre.PostgreMessage())}
