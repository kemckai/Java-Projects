import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serverSOX_1 {
	
	public static void main(String[] args) throws Exception {
		
		serverSOX_1 sox = new serverSOX_1();
		sox.run();
		
	}
	
	public void run() throws Exception
	
	{
		ServerSocket srvsocket = new ServerSocket(8000);
		Socket sock = srvsocket.accept();
		InputStreamReader IR = new InputStreamReader(sock.getInputStream());
		BufferedReader BR = new BufferedReader(IR);
		
		String Message = BR.readLine();
		System.out.println(Message);
		
		srvsocket.close();
	}
	
	
	

	
}
	
	
