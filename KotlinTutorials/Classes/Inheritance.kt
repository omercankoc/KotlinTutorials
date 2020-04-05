open class User(username : String, password : String){
    
    var username : String? = username
    var password : String? = password
    }

class Receiver(username : String, password : String, received : String) : User(username, password){
    var received : String? = null
}

class Seller(username : String, password : String, sold : String) : User(username, password){
    var sold : String? = null
}

fun main() {
    
    var myUser = User("UserName","UserPassword")
    
    var myReceiver = Receiver("ReceiverName","ReceiverPassword","Received")
    
    var mySeller = Seller("SellerName","SallerPassword","Sold")
    
    
}