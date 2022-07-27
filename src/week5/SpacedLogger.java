package week5;

//Question 3b: Create SpacedLogger class that implements Logger.
public class SpacedLogger implements Logger {

	//Question 6 + 7
	@Override
	public void log(String log) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			builder.append(log.charAt(i) + " ");
		}
		System.out.println(builder);
		
	}

	//Question 8
	@Override
	public void error(String error) {
		StringBuilder builder2 = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			builder2.append(error.charAt(i) + " ");
		}
		System.out.println("Error: " + builder2);
	}

	
	

}
