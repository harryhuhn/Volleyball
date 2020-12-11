//CSE 110
//Assignment 8
//Harry Huhn 1219452130
//Roster class
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Roster {
	private  ArrayList<Player> players;
	
	public Roster() {
		players = new ArrayList<>();	
		
	}
	public Roster(String fileName)  { //the String file is the name of the file we want the program to read from
		fileName = fileName + ".txt"; //added the .txt so it can find the file
		players = new ArrayList<>(); //instantiates the new ArrayList object
		String name; //initialize the variables for constructing the players
		double attackStat;
		double blockStat;

		File file = new File(fileName); //takes the file we listed in the main method adds .txt then creates new file object
		
		
		try {
			Scanner in = new Scanner(file);
			while(in.hasNext()) { //while there is the next line to read
				//while(reader.next() != null){ didn't work for some reason
				name = in.next();
				
				//there's a space between the first and last name
				name = name + " " + in.next();
				attackStat = in.nextDouble();
				blockStat = in.nextDouble();
				
				
				players.add(new Player(name, attackStat, blockStat));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //couldn't figure out how to get this to work using bufferedreader
		
			

		}
	
		
	
	public void addPlayer(String name, double attackStat, double blockStat) { //takes in the name and stats given by user and adds the new player object to the arraylist
		Player player = new Player(name, attackStat, blockStat);
		players.add(player);
		//adds the new player
	}
	public int countPlayers() { //countPlayers method works correctly
		
		return players.size() - 1;
		
	}
	public Player getPlayerByName(String name) {//goes through the arraylist and searches for the player with the argument (name) passed and returns that players information
		
		Player player = new Player(name, 0, 0);
		for(int i =0; i<players.size(); i++) {
			if(((players.get(i)).getName()) == name) {
				return players.get(i);
			}
			else {
				return player;
			}
		}
		return player;
			
	}
	public void printTopAttackers() { 
		Player bestP = players.get(0);
		Player secondbestP = players.get(1); 
		for(int i = 0; i<players.size(); i++) { //loops through the arraylist
			if (players.get(i).getAttackStat() > bestP.getAttackStat()) { //if player at this index has the highest attackstat
				secondbestP = bestP; //the former best is now second best
				 bestP = players.get(i); //the player at  this index is now the best player
			}
			
				 if(players.get(i).getAttackStat() > secondbestP.getAttackStat() && players.get(i).getAttackStat() < bestP.getAttackStat()) { //but if it finds a player w a stat better than the second best now that player is the second best
					 secondbestP = players.get(i);
			}
			
			}
		bestP.printPlayerInfo();//prints the best and second best players info
		secondbestP.printPlayerInfo(); //had to move this outside the block that has the for loop because it was printing the top 2 players over and over again
		}
				
			
			
			
		
		
	
	public void printTopBlockers() { //i used my print top attackers method and changed it to getblockstat
		Player bestP = players.get(0);
		Player secondbestP = players.get(1); 
		for(int i = 0; i<players.size(); i++) { //loops through the arraylist
			if (players.get(i).getBlockStat() > bestP.getBlockStat()) { //if player at this index has the highest attackstat
				secondbestP = bestP; //the former best is now second best
				 bestP = players.get(i); //the player at  this index is now the best player
			}
			
				 if(players.get(i).getBlockStat() > secondbestP.getBlockStat() && players.get(i).getBlockStat() < bestP.getBlockStat()) { //but if it finds a player w a stat better than the second best now that player is the second best
					 secondbestP = players.get(i);
			}
			
			}
		bestP.printPlayerInfo();//prints the best and second best players info
		secondbestP.printPlayerInfo(); //had to move this outside the block that has the for loop because it was printing the top 2 players over and over again
		}
	
	public void printAllPlayers() {
		for(int i = 0; i<players.size(); i++) { //iterates through the arraylist and prints the info for each player
			players.get(i).printPlayerInfo();
			}
		}
	

}
