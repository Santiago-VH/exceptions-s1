package exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WrongLettersForTimeCarException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongLettersForTimeCarException(String plate) {
		super("Letters not appropiate for the time");
		
		
	
	}

	
}
