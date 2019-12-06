package Entities;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	String choice = scan.nextLine();
	Player player1 = new Player();
	Finish finish1 = new Finish();
	
	
	
	
	public void playGame(double[] postionalArray, double[] finishPoint) {
	
		boolean play  = true;
		do {
			
			if(player1.postionalArray == finish1.finishPoint) {
				play = false ;
			}
			System.out.println("GET OUT MA SWAMP!");
			System.out.println("You are " + postionalArray + "Travel to " + finishPoint + "to escape the orges swamp");
			nextMove();
			
			
		} while (play);
	}

	
	public void nextMove() {
		Object playerMove = null;
		do {
			System.out.println("You are " + Math.hypot(player1.x-finish1.xf, player1.y-finish1.yf));
			System.out.println("What do you want to do next?");
			playerMove = getPlayerMove(choice, player1.postionalArray); 
			
		}
		while(playerMove == null) ;
		 }
		
	
	public double[] getPlayerMove(String choice, double[] postionalArray) {
		switch(choice.toLowerCase()) {
		case "north":
			Player.north(postionalArray);
			return postionalArray;
		case "south":
			Player.south(postionalArray);
			return postionalArray;
		case "east":
			Player.east(postionalArray);
			return postionalArray;
		case "west":
			Player.west(postionalArray);
			return postionalArray;
		case "where am i":
			Player.playerPostion(postionalArray);
			return postionalArray;
		default:
			return postionalArray;
		}
		
			
		
		
			
			
			
		
		
		}
		
	}
	
	



