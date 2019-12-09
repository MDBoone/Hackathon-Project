//
/*Name: Eseme Holden
/Date: 12/08/2019
/Class: CSC 160
/Program Class: gameboard
 * Description: The program displays a 3X3 2D array and tells you which direction you are able to move. 
The player inputs 'u','d','r', or 'l' for the direction they wanna go. 
If the player inputed an ivalid direction, the program tells you and tells you the only directions you are allowed. 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class gameboard
{

	public static int[][] movement(int[][] gameboard){
		
		boolean up = false; //marker to check if the player would like to move up
		boolean down = false; //marker to check if the player would like to move down
		boolean right = false; //marker to check if the player would like to move right
		boolean left = false; //marker to check if the player would like to move left
		boolean marker = false; //marker to check if user entered in a valed value.
		char direction; //direction charicter will move in 2D array
		int x = 0;
		
		
		
		//Creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//finding the players position
		for(int j = 0; j < gameboard.length; j++) {
			for(int i = 0; i < gameboard[0].length; i++) {
				if(gameboard[j][i] == 1) {
					
					//loop to make sure user types in a correct value
					while(marker == false) {
				
						//Try catch allows the author to make anysize gameboard without rechanging all of the hard coded areas around the block to avoid an array out of bounds exception.
						do {
						try {
							if(x == 0) {	
								x++;
								//check to see if there is a position to move up
								if(gameboard[j - 1][i] == 0) {
								up = true; //setting marker to true
								System.out.println("Would you like to move up?"); //Displaying option
					
								}
							}
						
							//going through the down check to see if it is available
							if(x == 1) {
								x++;
								//check to see if there is a position to move down
								if(gameboard[j + 1][i] == 0) {
								down = true; //setting marker to true
								System.out.println("Would you like to move down?");//Displaying option
					
								}	
							}
						
							if(x == 2) {
								x++;
								//check to see if there is a position to move right
								if(gameboard[j][i + 1] == 0) {
								right = true; //setting marker to true
								System.out.println("Would you like to move right?");//Displaying option
					
								}
							}
			
							if(x == 3) {
								x++;
								//check to see if there is a position to move left
								if(gameboard[j][i - 1] == 0) {
								left = true; //setting marker to true
								System.out.println("Would you like to move left?");//Displaying option
					
								}
							}	
						}	
						
						//Catching exseption out of bounds to avoid hardcoding edges if player walks into a wall
						catch(Exception e) {
						//	System.err.printf("%nException: %s%n", e);
						
							//Telling the user which direction they cannot go if the exception is flagged
							if(up == false && x == 1) {
								System.out.println("cannot go up.");
							}
							if(down == false && x == 2) {
								System.out.println("cannot go down.");
							}
							if(right == false && x == 3) {
								System.out.println("cannot go right.");
							}
							if(left == false && x == 4) {
								System.out.println("cannot go left.");
							}
						}
						}while(x < 4);
					
						
						//Setting direction
						System.out.println("Type 'u' for up, 'd' for down, 'l' for left and 'r' for right: ");
						direction = input.next().charAt(0);
							
							//checking if user entered a valid value for variable char 'direction'
							if(direction != 'u') {
								if(direction != 'd') {
									if(direction != 'l') {
										if(direction != 'r') {
											System.out.println("That is an invalid input, try agian.");
											direction = 't';
										}
										
										//Else if indicate one of the values was entered
										//Else if checking if that direction was a valid option
										else if(right == true){ //direction == 'r'
											marker = true; //ending loop
											System.out.println("You entered right");//Telling the user what direction they chose
											
											//updating gameboard
											gameboard[j][i] = 0;
											gameboard[j][i + 1] = 1; 
										}
										
										//Telling the user, that the direction they chose wasnt an option
										else {
											System.out.println("The direction you chose is an invalid opton, try agian.");
											direction = 't';
										}
									}
									
									//Else if checking if that direction was a valid option
									else if(left == true) { //direction == 'l'
										marker = true; //ending loop
										System.out.println("You entered left.");//Telling the user what direction they chose
									
										//updating gameboard
										gameboard[j][i] = 0;
										gameboard[j][i - 1] = 1; 
									}
									//Telling the user, that the direction they chose wasnt an option
									else {
										System.out.println("The direction you chose is an invalid opton, try agian.");
										direction = 't';
									}
								}
								
								//Else if checking if that direction was a valid option
								else if(down == true){ //direction == 'd'
									marker = true; //ending loop
									System.out.println("You entered down.");
									
									//updating gameboard
									gameboard[j][i] = 0;
									gameboard[j + 1][i] = 1; 
								}
								//Telling the user, that the direction they chose wasnt an option
								else {
									System.out.println("The direction you chose is an invalid opton, try agian.");
									direction = 't';
								}
							}
							
							//Else if checking if that direction was a valid option
							else if(up == true){ //direction == 'u'
								marker = true; //ending loop
								System.out.println("You entered up.");
								
								//updating gameboard
								gameboard[j][i] = 0;
								gameboard[j - 1][i] = 1; 
							}
							//Telling the user, that the direction they chose wasnt an option
							else {
								System.out.println("The direction you chose is an invalid opton, try agian.");
								direction = 't';
							}
					}
				
				}
			}
		
		}
	
		
		
			return gameboard;
		}
	
	public static void gameboardBuilder(int row, int collumn) {
		int x = 0;
		int[][] gameboard = new int[row][collumn]; //2D Gameboard
		
		ArrayList items = new ArrayList();
	
		//Generating the number of rows and collumns and assigning them to 2d array, gameboard passed by peramereters.
		for(int k = 0; k < row; k++) {
			for(int y = 0; y < collumn; y++) {
				gameboard[k][y] = 0;
			}
		}
		gameboard[0][0] = 1;
		
		//Displaying gameboard
		for(int j = 0; j < gameboard.length; j++) {
			for(int i = 0; i < gameboard[0].length; i++) {
				System.out.print(gameboard[j][i] + " ");
				
			}
			System.out.println("");
		}
		
			while( x == 0) {
				movement(gameboard);
		
				//Displaying gameboard
				for(int j = 0; j < gameboard.length; j++) {
					for(int i = 0; i < gameboard[0].length; i++) {
						System.out.print(gameboard[j][i] + " ");
						
					}
					System.out.println("");
					
				}	
			}
		}
		
	
	public static void main( String[ ] args )
	{
		gameboardBuilder(3,4);
	
	}

}
