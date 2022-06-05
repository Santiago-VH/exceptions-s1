package exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WrongNumbersForTimeMotoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongNumbersForTimeMotoException() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));	
	}

}
