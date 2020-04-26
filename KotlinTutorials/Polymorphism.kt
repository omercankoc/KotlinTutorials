// Static Polymorphism
class Messages{
    fun message() : String {
        return "Hello!"
    } 
    
    fun message(name : String) : String {
        return "Hello" + name
    }
    
    fun message(name : String, surname : String) : String {
        return "Hello" + name + surname
    }
} 

// Dynamic Polymorphism
open class Animal{
    open fun sound(){
        println("animal")
    }
} 

class Dog : Animal(){
    fun superSound(){
        super.sound()
    }
    override fun sound(){
        println("Dog Class")
    }
}

class Cat : Animal(){
    fun superSound(){
        super.sound()
    }
    override fun sound(){
        println("Cat Class")
    }
}

fun main() {
    
    var messages = Messages()
    println(messages.message())
    println(messages.message(" Omer"))
    println(messages.message(" Omer"," Koc"))
    
    var animal = Animal()
    animal.sound()
    
    var dog = Dog()
    dog.superSound()
    dog.sound()
    
    var cat = Cat()
    cat.superSound()
    cat.sound()
}
