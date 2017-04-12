package com.epam.trapeznikau.webclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String [] args){
				
		try {
			Socket socket = new Socket("127.00.00.1", 6666);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String msg = dis.readUTF();			
			System.out.println(msg);
			
			String msgOut = "GET /book http/1.1";
			out.writeUTF(msgOut);
			
			String response = dis.readUTF();			
			System.out.println(response);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
