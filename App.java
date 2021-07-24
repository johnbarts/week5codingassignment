package week5codingassignment;

public class App {

	public static void main(String[] args) {
		
		Logger loggerOne = new AsteriskLogger();
		
		loggerOne.log("Orange");
		
		loggerOne.error("Apple");
		
		Logger loggerTwo = new SpacedLogger();
		
		loggerTwo.log("Banana");
		
		loggerTwo.error("Pomegranate");
		

	}

}
