package exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WrongNumbersForTimeCarException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public WrongNumbersForTimeCarException() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));	
		
	}

}
