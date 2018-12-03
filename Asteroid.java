import greenfoot.*;

/**
 * A rock in space.
 * 
 * @author Poul Henriksen
 * @author Michael Kölling
 */
public class Asteroid extends SmoothMover
{
    //TODO (26): Declare an integer instance variable called size
    /** Size of this asteroid */
    

    //TODO (27): Declare an integer instance variable called stability
    /** When the stability reaches 0 the asteroid will explode */
    


    /**
     * This is the default constructor for objects of type Asteroid
     * 
     * @param None There are no parameters
     * @return Nothing is returned
     */
    public Asteroid()
    {
        this(60);
    }
    
    /**
     * Asteroid is the constructor for objects of type Asteroid.
     * It allows customization of the size of the Asteroid
     * 
     * @param size represents the size of the Asteroid
     * @return An object of type Asteroid
     */
    public Asteroid(int size)
    {
        super(new Vector(Greenfoot.getRandomNumber(360), 2));
        
        //TODO (32): Delete this line and make a call to the setSize method instead
        getImage().scale(size, size);
    }
    
    /**
     * Asteroid is the constructor for objects of type Asteroid.
     * It allows customization of the size of the Asteroid and
     * the speed and direction of the Asteroid
     * 
     * @param size represents the size of the Asteroid
     * @param velocity represents the speed and direction of the Asteroid
     * @return An object of type Asteroid
     */
    public Asteroid(int size, Vector velocity)
    {
        super(velocity);
        
        //TODO (33): Delete this line and make a call to the setSize method instead
        getImage().scale(size, size);
    }
    
    /**
     * act is the method that is run on every 
     * iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {         
        move();
    }

    /**
     * TODO (28): Declare a method called setSize that does not
     *            return anything and has an integer parameter called size
     *          
     * TODO (29): Initialize stability to the size parameter
     * 
     * TODO (30): Initialize the size instance variable to the size parameter
     * 
     * TODO (31): Scale the image of this Asteroid to a width of size and a height of size
     */
    
    
    /**
     * TODO (51): Declare a public method called hit that does not
     *          return anything and has an integer parameter
     *          called damage.
     *          
     * TODO (52): Declare a local Space variable called space
     *            that stores a reference to the world.
     *          
     * TODO (53): Decrease stability by damage.
     * 
     * TODO (54): If the stability of the asteroid is less than or equal to 0...
     * 
     *      TODO (55): If the size of the asteroid is greater than or equal to 50...
     *      
     *          TODO (56): Use the reference to the world to count 15 points to the score
     *          
     *      TODO (57): Otherwise, if the size of the asteroid is greater than or equal to 25...
     *      
     *          TODO (58): Use the reference to the world to count 30 points to the score
     *          
     *      TODO (59): Otherwise...
     *      
     *          TODO (60): Use the reference to the world to count 50 points to the score
     *          
     *      TODO (61): Break up the asteroid into a number of pieces that is 5 or fewer
     */
    
    
    /**
     * TODO (34): Declare a method called breakUp that does not
     *            return anything and has an integer parameter
     *            called numBreakUp
     *          
     * TODO (35): Declare a local integer variable called rotation
     * 
     * TODO (36): Declare a local double variable called length
     * 
     * TODO (37): Declare a local Vector variable called speed
     * 
     * TODO (38): Declare a local Asteroid variable called debris
     * 
     * TODO (39): Play the Explosion.wav sound
     * 
     * TODO (40): If the size of the asteroid is less than or equal to 15...
     * 
     *      TODO (41): Remove this object
     *      
     * TODO (42): Otherwise...
     * 
     *      TODO (43): Initialize rotation to getVelocity().getDirection() + a random number between 0 and 45
     *      
     *      TODO (44): Initialize length to getVelocity().getLength()
     *      
     *      TODO (45): Use a loop that will run as many times as the asteroid needs to break up
     *      
     *          TODO (46): Inside the loop, initialize speed to a new Vector that uses direction plus
     *                     a random number between -100 and 100 and length times 1.2
     *                   
     *          TODO (47): Initialize debris to a new Asteroid that uses size divided by the number
     *                     of break ups as one parameter and speed as the second parameter
     *                   
     *          TODO (48): Add the debris object at the current X location and the current Y location
     *          
     *          TODO (49): Access the move method of debris
     *          
     *     TODO (50): Underneath the for loop, remove this object
     */
    
}
