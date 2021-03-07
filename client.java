package client_server_demo;
import java.net.*;
import java.io.*;
public class client {
	public static void main(String[] args) throws IOException
	{
		
		
			Socket s = new Socket("localhost",1119);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello There");
			
		
	}

}
