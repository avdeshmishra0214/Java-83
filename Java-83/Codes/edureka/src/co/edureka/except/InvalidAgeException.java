package co.edureka.except;

//public class InvalidAgeException extends RuntimeException{ //--un-checked exception
public class InvalidAgeException extends Exception{ //--checked exception
	
 public InvalidAgeException() {}
 
 public InvalidAgeException(String msg) {
	 super(msg);
 }
}
