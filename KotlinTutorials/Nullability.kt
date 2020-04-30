// Nullability: Bos birakilabilir degisken.
// var VeriableName : VariableType? = null
// "?" Degiskenin degeri initialize edilecek anlamina gelir.
// Bu degerler deger atamasi yapilmadan kullanilabiller. 
// Fakat bu degerler ile bir islem yapılmaya kalktiginda hata alinir.
// Bu hatalarin onune gecilmesi icin "variableName!!" seklinde kullanilabilir.
// "!!" islevi "Safe Call" olarak adlandirilir.
// println(VariableName!!*2)

class User(var name : String?, var surname : String?){    
    fun message(name : String, surname : String ) : String {
        return "Hello $name $surname!"
    }
}

fun main() {
    var user = User("abc","cba")
    if(user.name != " "){
    	var message : String = user.message(user.name!!, user.surname!!)
    	println(message)
    }
    else {
    	println("Nullable Safety!")
    }
    
    var output : String = user.message(user.name!!,user.surname!!) ?: "Elvis"
    println(output)
}
