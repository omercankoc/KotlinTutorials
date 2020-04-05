/*
 * Visibility Modifiers
 * private: Sadece tanimlandigi class'dan erisilebilir.
 * protected: Private'dan farklı olarak kalitim yolu ile de ulasilabilir.
 * internal: Butun projeden ulasilabilir, farkli modulden erisilemez.
 * public: Projenin her alanindan ulasilabilir. (Default)
 */

// Constructor kullanilmamis class.
class First{
    // Properties
    // Nullability : Nullable(?) and Non-Nullable
    var Name : String? = null
    var Surname : String? = null
    var Username : String? = null
    var EMail : String? = null
    var Password : String? = null
    var PhoneNumber : String? = null
    var FirstNumber : Int? = null
}

// Constructor kullanilmis class.
class Second{
    // Properties
    // Nullability : Nullable(?) and Non-Nullable
    var Name : String? = null
    var Surname : String? = null
    var Username : String? = null
    var EMail : String? = null
    var Password : String? = null
    var PhoneNumber : String? = null
    var SecondNumber : Int? = null
    
    // Nesneleri Constructor ile olusturma.
    constructor(name: String, surname : String, username : String, email : String, password : String, phoneNumber : String, secondNumber : Int ){
        this.Name = name
        this.Surname = surname
        this.Username = username
        this.EMail = email
        this.Password = password
        this.PhoneNumber = phoneNumber
        this.SecondNumber = secondNumber
    }    
}

// Constructor kullanilarak olusturulmus class.
class Third(var name : String?, var surname : String?, var username : String?, var email : String?, var password : String?, var phoneNumber : String?, var thirdNumber : Int? = null){}

fun main(args: Array<String>) {
    // Constructor kullanmadan nesne olusturma.
    var first = First()
    first.Name = "Name"
    first.Surname = "Surname"
    first.Username = "Username"
    first.EMail = "mail@mail.com"
    first.Password = "password"
    first.PhoneNumber = "0123456789"
    first.FirstNumber = 1
    
    // number degiskeni tanimlanirken deger atanmadi. Deger atanacagi kesin gorulerek islem yapilamasi
    // icin "first.number!!*2" gibi !! ifadelerinin kullanilmasi gerekir. Bu ifadeler degiskenin kesinlikle
    // deger alacagini belirttikten sonra isleme girmesine izin verilir. (Nullable Safety)
    if(first.FirstNumber!=null){
        first.FirstNumber = first.FirstNumber!!*2
        println("Number: " + first.FirstNumber)
    }
    else{
        println("Number is null!")
    }
    
    println("Name: " + first.Name)
    println("Surname: " + first.Surname)
    println("Username: " + first.Username)
    println("E-Mail: " + first.EMail)
    println("Passord: " + first.Password)
    println("Phone Number: " + first.PhoneNumber)
    
    // Constructor kullanarak nesne olusturma.
    var second = Second("Name","Surname","Username","mail@mail.com","Password","0123456789",2)
    println("Name: " + second.Name)
    println("Surname: " + second.Surname)
    println("Username: " + second.Username)
    println("E-Mail: " + second.EMail)
    println("Passord: " + second.Password)
    println("Phone Number: " + second.PhoneNumber)
    // Safe Call ile Null kontrolu. Deger null degilse isleme sok, aksi halde null dondur. 
    println("Second Number: " + second.SecondNumber?.compareTo(2))
    
    // Constructor kullanarak nesne olusturma.
    var third = Third("Name","Surname","Username","mail@mail.com","Password","0123456789")
    println("Name: " + third.name)
    println("Surname: " + third.surname)
    println("Username: " + third.username)
    println("E-Mail: " + third.email)
    println("Passord: " + third.password)
    println("Phone Number: " + third.phoneNumber)
    // Elvis ile Null kontrolu. Deger null degil ise isleme sok, aksi halde belirtilen degeri don (?: 33)
    println("Third Number: " + third.thirdNumber)
    println(third.thirdNumber?.compareTo(3) ?: 33)
}
