import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBrick extends Actor
{
    public int health = 2;
    public GreenfootImage green= new GreenfootImage("greenbrick.png");
    
    public RedBrick()
    {
        getImage().scale(70,20);
    }
    /**
     * Act - do whatever the RedBrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
