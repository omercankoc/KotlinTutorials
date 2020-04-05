import java.util.Scanner
fun main(args: Array<String>) {
    
    var numbers = arrayOf<Double>(1.0,7.1,6.2,5.4,4.5,5.1,3.2,2.0,8.3,9.6,6.5,5.9,0.5,4.32)
    var sum : Double = 0.0
    var multiply : Double = 1.0
    
    // For Loop:
    for(number in numbers){
        sum += number
    }
    println("Sum: $sum")
    
    // While Loop:
    var counter : Int = 0
    while(counter < numbers.count()){
        multiply *= numbers[counter]
        counter++
    }
    println("Multiply: $multiply")   
}
