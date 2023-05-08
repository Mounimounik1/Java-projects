package day4;

public class CustomExceptionExample {

	public static void main(String[] args) {
    try {
 // Throw our custom exception
    throw new CustomException("Something went wrong!");
        }
    catch (CustomException e) {
// Catch the exception and print the message
    	//System.out.println(e.getMessage());
    System.out.println(e.getMessage());
    
    }
}

	// Custom exception class
	static class CustomException extends Exception {
		public char[] getMessagw;

	public CustomException(String message) 
	{
 super(message);
	}
	}
}