package week5codingassignment;

public class AsteriskLogger implements Logger {
	

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		System.out.println(asterisksLine(error));  
		System.out.println("***" + "ERROR: " + error + "***");
		System.out.println(asterisksLine(error));
	}
	
	public String asterisksLine(String error) {
		String result = "";
		int stringLength = error.length();
		for (int i = 0; i != stringLength + 13; i++) {
			result += "*";
		}
		return result;
	}
	
}
