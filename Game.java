import java.util.ArrayList;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Game: set up methods allowing for game execution
 * Kathryn: Will call instances of Player, Enemy, and Item Classes
 */
public class Game {
	/*-----------------------------------------------
	 * Attributes
	 * Kathryn: Added Attributes
	 * 
	 * (The Game class has an Enemy class, Player class, and Item class)
	 ------------------------------------------------*/
	private Player player;
	private Enemy enemy;
	private Items item;
	private ArrayList<Integer> topThreeScores = new ArrayList<Integer>();
	
	/*------------------------------------------------
	 * Constructor
	 -------------------------------------------------*/
	public Game() {
		
	}
	
	/*-----------------------------------------------
	 * Methods
	 * Kathryn: Added return statements and set up a toString
	 ------------------------------------------------*/

	//sets up screen
	// Kathryn: Will set up the characters and the items on screen
	public void setUp()
	{
	}
	
	//starts game, listening for user button click
	public void startGame()
	{
	}

	//sets up next level, new screen, change number/placement of items, speed of enemy
	public void nextLevel()
	{
	}
	
	//ends game when player/enemy collide
	// Kathryn: Returns the String Game Over when the game ends
	public String gameOver()
	{
		return "Game Over";
	}
	
	//display current player score
	public int showScore()
	{
		return 0;
	}
	
	//calculate and store top 3 scores and accompanying player info
	// Kathryn: added calculate to the beginning of method name to distinguish it from the other method
	// Kathryn: Method will add the top three scores to an Arraylist
	public void calculateTopThree()
	{	
	}
	
	//display top 3 scores and accompanying player info
	public ArrayList<Integer> showTopThree()
	{
		return topThreeScores;
	}
	// Kathryn: Added a toString method
	public String toString() {
		return "FIXME: If the game is over output " + gameOver() + "\n" +
				"FIXME: Player Score: " + showScore() + "\n";
	}
	
}
