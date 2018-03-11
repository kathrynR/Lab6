import java.util.ArrayList;

/*
 * Author: Kate Hohenstein
 * Partners: Hannah Hollenback, Kathryn Reese
 * Lab 6
 * 3/10/18
 * Game: set up methods allowing for game execution
 */
public class Game {
	/*-----------------------------------------------
	 * Attributes
	 * Kathryn: Added Attributes
	 ------------------------------------------------*/
	String player;
	String enemy;
	ArrayList<Integer> topThreeScores = new ArrayList<Integer>();
	
	/*-----------------------------------------------
	 * Methods
	 * Kathryn: Added return statements and set up a toString
	 ------------------------------------------------*/

	//sets up screen
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
	// Kathryn 3/10/18: added calculate to the beginning of method name to distinguish it from the other method
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
		return "";
	}
	
}
