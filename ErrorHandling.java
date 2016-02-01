public class ErrorHandling {
	public void launch() {
		String str;
		int result = 0;
		int i = 0;
		while (i < 10) {
			try {
				System.out.println("Please enter a number: ");
				str = System.console().readLine();
				int tempInt = Integer.parseInt(str);
				result += tempInt;
				i++;
			} catch (NumberFormatException ex) {
				System.out.println("What you entered was not an integer!");
			}
		}
		System.out.println("The average of you input is: " + result / 10);
	}
	
	public static void main(String[] args) {
		ErrorHandling eh = new ErrorHandling();
		eh.launch();
	}
}