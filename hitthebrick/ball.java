import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    int xMoveVal = 5;
    int yMoveVal = 5;
    int brickCount = 0;
    int RedBrickCount= 0;
    
    public void act()
    {
        // Moving the ball
        setLocation( getX() -xMoveVal, getY() -yMoveVal);
        
        // check the side walls and bounce
        if(getX() < 5  || getX() > 595)
        {
            xMoveVal = xMoveVal * -1;
        }
        
        // check the top walls and bounce
        if(getY() < 5 || getY() > 395)        
        {
            yMoveVal = yMoveVal * -1;
        }
        
        // check to see if the ball hits the paddle
        Paddle p = (Paddle) getOneIntersectingObject(Paddle.class) ;
        if (p != null)
        {
          yMoveVal = Math.abs(yMoveVal); 
        }
        Brick b = (Brick) getOneIntersectingObject(Brick.class) ;
        if (b != null)
        {
          Greenfoot.playSound("brickbreak sound.mp3");  
           // bounce vertically 
          yMoveVal = yMoveVal * -1;  
          // remove brick
          getWorld().removeObject(b); 
          // add 10 to score
          MyWorld.score.add(10);
          // add 1 to the brickcount
          brickCount++;
          if(brickCount == 40)
          {
            Greenfoot.setWorld(new WinWorld());
          }
          if(brickCount == 15)
          {
            Greenfoot.playSound("bonus life.mp3");  
            MyWorld.lives.add(1);
          } 
          
          
        }
         RedBrick rb = (RedBrick) getOneIntersectingObject(RedBrick.class);
        if (rb != null)
         {
            Greenfoot.playSound("brickbreak sound.mp3"); 
            yMoveVal = yMoveVal * -1; 
            // take away 1 from the redbrick health
            rb.health--;
              
            if (rb.health == 0)
            {
                 getWorld().removeObject(rb); 
                 // add 10 to score
                 MyWorld.score.add(20);
                 // add 1 to the brickcount
                 brickCount++; 
            }
            else if (rb.health == 1)
            {
                rb.setImage(rb.green);
            }
            if(RedBrickCount == 15)
              {
                Greenfoot.playSound("bonus life.mp3");  
                MyWorld.lives.add(1);
              } 
          
           
         }
        
        
        if(getY() > 395)
        {
            
            // reduce the lives
            MyWorld.lives.add(-1);
            
            if (MyWorld.lives.getValue() == 0) 
            {
               Greenfoot.setWorld(new GameOver());
            }
            else
            {
                setLocation(200,320);
                yMoveVal = Math.abs(yMoveVal);
            }
            
        }
        
    }
}
