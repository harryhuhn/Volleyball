//CSE 110
//Assignment 8
//Harry Huhn 1219452130
//player class
public class Player {
	private  String name;
	private  double attackStat;
	private  double blockStat;
	
	public Player(String name, double attackStat, double blockStat) { //overloaded constructor method
		this.name = name;
		this.attackStat = attackStat;
		this.blockStat = blockStat;
	}
	public  String getName() { //getter method returns the name
		return name;
	}
	public double getAttackStat() {
		return attackStat;
	}
	public void setAttackStat(double attackStat) { //setter method that stores the value passed as the argument into the instance variable
		this.attackStat = attackStat;
	}
	public double getBlockStat() {
		return blockStat;
	}
	public void setBlockStat(double blockStat) {
		this.blockStat = blockStat;
	}
	public void printPlayerInfo() { //print playerinfo has no return statement because it just prints a statement to the console
		System.out.println(name + "(attack = " + attackStat + " , block = " + blockStat + " )");
	}
	public String toString() {
		return("Name: " + name + "\nAttack Stat: " + attackStat + "\nBlockStat: " + blockStat);
	}
	
	
}
