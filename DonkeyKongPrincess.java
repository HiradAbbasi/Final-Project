import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkingStand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DonkeyKongPrincess extends Actor
{
    private int frame = 1;
    private int animateCounter = 0;
    private GreenfootImage frames[] = new GreenfootImage[2];
    public DonkeyKongPrincess()
    {
        frames [0] = new GreenfootImage("PrincessFrame1.png");
        frames [1] = new GreenfootImage("PrincessFrame2.png");
        GreenfootImage image = getImage();
        setImage(image);
    }
    /**
     * Act - do whatever the OilBucket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(animateCounter > 0)
        { 
            animateCounter -=1;
        }
        else if(animateCounter == 0)
        {
            animate();
            animateCounter = 25;
        } 
    }    
    
    public void animate()
    {
        if(frame == 1)
        {
            setImage(frames [0]);
            frame++;
        }
        else if(frame == 2)
        {
            setImage(frames [1]);
            frame++;
        }
        else
        {
            frame = 1;
        }
    }
}
