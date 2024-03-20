import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    public Paddle()
    {
        getImage().scale(165,27);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation( getX() -5, getY());
            
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation( getX() +5, getY());
            
        }
    }
}
