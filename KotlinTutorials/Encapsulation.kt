// Encapsulation

/* 
 * Kotlin programlama dilinde getter ve setter fonksiyonları otomatik olarak oluşturulmaktadir.
 * Fakat manuel olarak ayarlanabilir.
 */ 
/*
 * Primary Constructor(birincil ilklendirici)
 */
class User(username : String, password : String, email : String, phone : String){
        
        /* 
         * "username" degiskeni kendi sinifi disindan erisilemez. 
         * "setter(atayici)" da private oldugu icin kendi sinifi disindan degistirilemez.
         * "getter(okuyucu)" private oldugu icin kendi sinifi disindan okunamaz.
         */
        private var username : String? = username
        
        /* 
         * "password" degiskeni kendi sinifi disindan erisilemez. 
         * "setter(atayici)" da public oldugu icin kendi sinifi disindan degistirilebilir.
         * "getter(okuyucu)" public oldugu icin kendi sinifi disindan okunabilir.
         */
        var password : String? = password
        	set
        	get
        
        /* 
         * "email" degiskeni kendi sinifi disindan erisilemez. 
         * "setter(atayici)" da private oldugu icin kendi sinifi disindan degistirilemez.
         * "getter(okuyucu)" public oldugu icin kendi sinifi disindan okunabilir.
         */
        var email : String? = email
        	private set
        	get
    }

fun main() {
    var firstUser = User("firstUsername", "firstPassword", "firstmail@mail.com","0123456789")
    
    firstUser.username = "updatedUsername"
    println(firstUser.username)
    
    firstUser.password = "updatedPassword"
    println(firstUser.password)
    
    firstUser.email = "updatedemail@mail.com"
    println(firstUser.email)
}
