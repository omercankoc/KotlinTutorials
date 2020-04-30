// Nullability: Bos birakilabilir degisken.
// var VeriableName : VariableType = null    
// Bu degerler deger atamasi yapilmadan kullanilabiller. 
// Fakat bu degerler ile bir islem yapılmaya kalktiginda hata alinir.
// Bu hatalarin onune gecilmesi icin "variableName!!" seklinde kullanilabilir.
// "!!" Degiskenin degeri kesinlikle initialize edilecek anlamina gelir. (Safe Call)
// println(VariableName!!*2)

class User(var name : String?, var surname : String?){
    
    fun message(name : String, surname : String ) : String {
        return "Hello $name $surname!"
    }
}

fun main() {
  
  // Nullable Safety
	var user = User("abc","cba")
  if(first.name != " "){
    var message : String = user.message(user.name!!, user.surname!!)
      println(message)
    }
    else {
      println("Nullability!")
    }
    
    // Elvis
    var output : String = user.message(user.name!!,user.surname!!) ?: "Nullability"
    println(output)
}
