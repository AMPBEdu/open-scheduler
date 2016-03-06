package io.bueidesoftware.os.console;

import java.util.Scanner;

public class Console {
	
	public String command;
	
	public boolean running = false;
	
	public Scanner input = new Scanner(System.in);
	
	public Console(){
		
	}
	
	public void start(){
		running = true;
		
		while(running){
			processCommand(input.next());
		}
	}
	
	public void stop(){
		running = false;
	}
	
	private void processCommand(String command){
		command = command.toLowerCase();
		if(command.contains(" ")){
			String[] params = command.substring(command.indexOf(" ")).split("\\s+");
			for(int i=1; i < params.length; i++){
				//parameters.add(params[i]);
			}
		}
	}
	
}
