import java.io.*;
import java.net.*;


public class clientSox_1  {

	public static void main(String[] args)  throws Exception {
		
		clientSox_1 cli = new clientSox_1();
		cli.run();
	}
	
	
	public void run() throws Exception
	{
		
		Socket socket = new Socket("localhost",8000);
		PrintStream PS = new PrintStream(socket.getOutputStream());
		PS.println("Hello to Server from Client");
		
		InputStreamReader IR = new InputStreamReader(socket.getInputStream());
		BufferedReader BR = new BufferedReader(IR);
		
		String Message = BR.readLine();
		System.out.println(Message);
		
		
		
		
		
		
		
	}
	

}
