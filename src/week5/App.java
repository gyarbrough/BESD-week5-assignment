package week5;

//Question 9
public class App {

	public static void main(String[] args) {

		//Question 10
		AsteriskLogger logger1 = new AsteriskLogger();
		SpacedLogger logger2 = new SpacedLogger();
		
		//Question 11
		logger1.log("Beep");
		logger1.error("Boop");
		
		logger2.log("Alert");
		logger2.error("Achtung!");

	}

}
