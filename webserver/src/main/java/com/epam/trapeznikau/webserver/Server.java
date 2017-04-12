package com.epam.trapeznikau.webserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.epam.trapeznikau.httpmethod.Request;
import com.epam.trapeznikau.httpmethod.Response;
import com.epam.trapeznikau.logic.BookOperation;

public class Server {
	
	Socket socket;
	ServerSocket server;
	int portNumber;
		
	public Server(int portNumber) throws IOException{
		
		server = new ServerSocket(portNumber);
		this.portNumber=portNumber;
		
	}
	
	public void start() throws IOException{
		socket = server.accept();
		System.out.println("Server run");
		List<String> rq = new ArrayList<String>();
		Response rp = new Response();
		String str ="";
		DataInputStream in = new DataInputStream(socket.getInputStream());
		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("Hello client");
//		while ((str = in.readUTF())!=null) {
//			
//		str += (char) i;
//				System.out.println(str);
//				rq.add(str);
//			}	
		str = in.readUTF();
		rq.add(str);
		rp = Request.parseRq(rq);
		out.writeUTF(rp.toString());
	}
	
}
