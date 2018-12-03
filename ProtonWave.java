import greenfoot.*;
import java.util.*;

/**
 * A proton wave that expands and destroys asteroids in its path.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class ProtonWave extends Actor
{
    /** The damage this wave will deal */
    private static final int DAMAGE = 30;
    
    /** How many images should be used in the animation of the wave */
    private static final int NUMBER_IMAGES= 30;
    
    private int currentImage = 0;
    
    /** 
     * The images of the wave. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    private static GreenfootImage[] images;
    
    /**
     * Create a new proton wave.
     */
    public ProtonWave() 
    {
        initializeImages();
        
        setImage( images[0] );
        Greenfoot.playSound("proton.wav");
    }
    
    /** 
     * Create the images for expanding the wave.
     */
    private void initializeImages() 
    {
        if(images == null) 
        {
            GreenfootImage baseImage = new GreenfootImage("wave.png");
            images = new GreenfootImage[NUMBER_IMAGES];
            
            for(int i = 0; i < images.length; i++)
            {
                int size = (i+1) * ( baseImage.getWidth() / NUMBER_IMAGES );
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    
    /**
     * grow allows the image for the proton wave to grow
     */
    private void grow()
    {
        setImage(images[currentImage]);
        currentImage++;
        
        if( currentImage >= NUMBER_IMAGES )
        {
            getWorld().removeObject(this);
        }
    }
    
    /**
     * Act for the proton wave is: grow and check whether we hit anything.
     */
    public void act()
    {
        checkCollision();
        
        grow();
    }
    
    
    /**
     * checkCollision checks whether the wave touches an asteroid 
     * and causes damage to it if it does
     */
    private void checkCollision()
    {
        int range = getImage().getWidth()/2;
        List<Asteroid> allAsteroids = getObjectsInRange(range, Asteroid.class);
        
        /**
         * TODO (114): Create a for loop that will go through every element of the
         *             allAsteroids List. Inside the for loop, make a call to the hit
         *             method of the asteroid class by getting each element of the
         *             allAsteroids List. Remember you have to get the element first
         *             before you hit it with damage.
         */
            
    }
    
}
