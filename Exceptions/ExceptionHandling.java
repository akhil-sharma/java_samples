import java.lang.ArithmeticException;

public class ExceptionHandling{
	
	public static void main(String[] args) throws ArithmeticException{
		try{
			int number =  6 / 0;
		}catch(ArithmeticException e1){
			System.out.println("Not a valid request");
		}
	}
}
