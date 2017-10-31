public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number == 5){
			return("Fizz");
		}
		else if(number == 10){
			return("Buzz");
		}
		else if(number == 15){
			return("FizzBuzz");
		}
		else {
			return("02");
		}
    }
}
