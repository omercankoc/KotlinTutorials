fun main(args: Array<String>) {
	
    var midterm : Double = 52.0
    var finals : Double = 47.0
    var mean : Double = (midterm + finals) * 0.5 
    
    if(finals > 50){
    	if(mean >= 50 && mean < 60){
        	println("E")
    	}
    	else if(mean >= 60 && mean < 70){
       		println("D")  
    	}
        else if(mean >= 70 && mean < 80){
       		println("C")  
    	}
        else if(mean >= 80 && mean < 90){
       		println("B")  
    	}
        else if(mean >= 90 && mean <= 100){
       		println("A")  
    	}        
    }
    else{
        println("A")
    }
    
    var day : Int = 3;
    var dayString : String = ""
    when(day){
        1 -> dayString = "Sunday"
        2 -> dayString = "Monday"
        3 -> dayString = "Tuesday"
        4 -> dayString = "Wednesday"
        5 -> dayString = "Thursday"
        6 -> dayString = "Friday"
        7 -> dayString = "Saturday"
        else -> dayString = "Error!"
    }
    println("$day. day is $dayString")    
}
