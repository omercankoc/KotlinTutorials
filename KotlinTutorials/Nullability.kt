/* 
 * Nullability -> Bos birakilabilir degisken.
 * Kullanim -> var VeriableName : VariableType? = null
 * "?" Degiskenin degeri initialize edilecek anlamina gelir. Bu degerler deger atamasi yapilmadan kullanilabiller. 
 * Fakat bu degerler ile bir islem yapılmaya kalktiginda hata alinir.
 * Bu hatalarin onune gecilirken bos olmadigindan emin olundugunda "variableName!!" seklinde kullanilabilir.
 * "!!" islevi "Safe Call" olarak adlandirilir.
 * println(VariableName!!*2)
 */

class User(){     
    var username : String? = null    
    fun message(username : String?) : String {
        return "Hello $username"
    }
}

fun main() {
    var user = User()
    user.username = "Omer"
    if(user.username != null){
    	var message : String? = user.message(user.username)
    	println(message)
    } else {
    	println("Nullable Safety!")
    }
    
    var output : String = user.message(user.username) ?: "Elvis Safety"
    println(output)
}
