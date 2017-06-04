import java.io.*;
import java.io.IOException;

public class Input{

	public static void main(String[] args) throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(input);

		/*Request a user input*/
		System.out.print("Please enter your name: ");
		/*try reading a line into std input*/
		try{
			
			String name = buffer.readLine();
			System.out.println("Welcome "+ name);
		
		}catch(IOException e){
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
	}
}
