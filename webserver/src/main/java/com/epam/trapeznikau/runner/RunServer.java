package com.epam.trapeznikau.runner;

import java.io.IOException;

import com.epam.trapeznikau.webserver.Server;

public class RunServer {
	
	public static void main(String args[]) throws IOException{
		Server server = new Server(6666);
		server.start();
				
	}
}

