import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
     public static Counter score = new Counter();
     public static Counter lives = new Counter();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(new Paddle(), 300, 350);
        addObject(new ball(), 200, 300);
        
        addObject(score, 50, 380);
        addObject(lives, 550, 380);
        score.setValue(10);
        lives.setValue(3);
        for (int y=0; y < 4; y++)
        {
           for (int x=0; x < 8; x++)
           {
               addObject(new Brick(), 38 + x*75,15 + 22*y); 
           }
        }
         for (int x=0; x < 8; x++)
           {
               addObject(new RedBrick(), 38 + x*75,103); 
           }
    }
}
