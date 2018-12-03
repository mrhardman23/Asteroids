/**
 * TODO (115): Add an assignment comment block below
 */

import greenfoot.*;

/**
 * Space. Something for rockets to fly in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    private Counter scoreCounter;
    
    //TODO (62): Declare an integer instance constant called START_ASTEROIDS initialized to a one-digit number
    

    /**
     * Create the space and all objects within it.
     */
    public Space() 
    {
        super(600, 500, 1);

        createBackground();
        
        /**
         * TODO (10): Make a method call to the paint stars method.
         *            Play around with the parameter value until you are 
         *            happy with the look of your scenario
         */
        
        
        prepareGame();
    }
    
    /**
     * createBackground fills the background with a black colour
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void createBackground()
    {
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
    }
    
    /**
     * TODO (1): Declare a method called paintStars that does not
     *           return anything and has an integer parameter called count
     *          
     * TODO (2): Declare three local integer variables, one called x, one
     *           called y, and one called transparency.
     *          
     * TODO (3): Declare a local GreenfootImage variable called background
     *           that is initialized to the background of the world.
     *          
     * TODO (4): Use a loop that will paint the correct number of stars to the world
     *           based on the count parameter. 
     * 
     * TODO (5): Inside the loop, initialize x to be a random number between 0 and the 
     *           width of the world. 
     *          
     * TODO (6): Inside the loop, initialize y to be a random number between 0 and the
     *           height of the world.
     *          
     * TODO (7): Inside the loop, initialize transparency to be a random number between
     *           0 and 256.
     *          
     * TODO (8): Inside the loop, set the color of the background to be a new Color object 
     *           with the values 255, 255, 255, and transparency
     *          
     * TODO (9): Inside the loop, fill an oval on the background at a location of (x, y) 
     *           that is 3 pixels wide and 3 pixels high.
     */

    /**
     * prepareGame adds the objects to the game to get the game ready
     * to be played
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void prepareGame()
    {
        Rocket rocket = new Rocket();
        
        scoreCounter = new Counter("Score: ");
        
        addObject(rocket, getWidth()/2 + 100, getHeight()/2);
        
        addObject(scoreCounter, 60, 480);
        
        //TODO (69): Make a method call to addAsteroids that uses your constant for the number of asteroids
        
    }
    
    /**
     * TODO (63): Declare a method called addAsteroids that does not
     *          return anything and has an integer parameter called count
     *          
     * TODO (64): Declare two local integer variables called x and y.
     *          
     * TODO (65): Use a loop to add the correct number of asteroids based on
     *            the parameter given. 
     *          
     * TODO (66): Inside the loop, get a random value for
     *            x between 0 and half the width of the world.
     * 
     * TODO (67): Inside the loop, get a random value for y between 0
     *            and half the height of the world.
     * 
     * TODO (68): Inside the loop, use the x and y values to add a 
     *            new Asteroid object at that location.
     */
    

    /**
     * gameOver displays a ScoreBoard and the player's score
     * after the player is destroyed by an asteroid
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void gameOver() 
    {
        ScoreBoard endGame = new ScoreBoard("You Lose!", scoreCounter.getValue());
        addObject(endGame, getWidth()/2, getHeight()/2);
    }
    
    /**
     * gameWon displays a congratulatory ScoreBoard and the player's score
     * after the player destroys all asteroids
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void gameWon()
    {
        ScoreBoard endGame = new ScoreBoard("You Win!", scoreCounter.getValue());
        addObject(endGame, getWidth()/2, getHeight()/2);
    }
    
    /**
     * countScore adds a number of points to the score counter
     * 
     * @param score is the number of points being added to the score
     * @return Nothing is returned
     */
    public void countScore(int score)
    {
        scoreCounter.add(score);
    }
}