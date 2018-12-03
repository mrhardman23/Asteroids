import greenfoot.*;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and a score.
 * 
 * @author M Kölling
 * @version 1.0
 */
public class ScoreBoard extends Actor
{
    private static final double FONT_SIZE = 48.0;
    
    private static final int WIDTH = 400;
    
    private static final int HEIGHT = 300;

    /**
     * Create a score board for the final result.
     */
    public ScoreBoard(String message, int score)
    {
        makeImage(message, "Score: ", score);
    }
    
    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        Font font = image.getFont();

        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        
        font = font.deriveFont( (float)FONT_SIZE );
        
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
    }
}
