package week5;

//Question 3a: Create AsteriskLogger class that implements Logger.
public class AsteriskLogger implements Logger {

	//Question 4
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	//Question 5
	@Override
	public void error(String error) {
		System.out.println("****************");
		System.out.println("***Error: " + error + "***");
		System.out.println("****************");
		
	}

	
	

}
