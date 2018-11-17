import greenfoot.*; 

public class Player extends Actor
{
    int YVelocity, XVelocity;
    int YVelocityTimer, XVelocityTimer;
    int waterJump = 0;
    boolean inWater = false;
    boolean onIceRight, onIceLeft;
    int level;
    int timer1, timer2;
    
    
    public Player(int x)
    {
        level = x;
    }
    
    
    public void act() 
    {
        moveMe();
        physics();
        nextLevel();
        die();
    }    
    
    
    public void moveMe()
    {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            Actor Ice = getOneObjectAtOffset(0, -22, Ice.class);
            if (canMoveRight())
            {
                setLocation(getX() + 2, getY());
            }
            if (Ice != null)
            {
                onIceRight = true;
            }
        }
        else if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            Actor Ice = getOneObjectAtOffset(0, -22, Ice.class);
            if (canMoveLeft())
            {
                setLocation(getX() - 2, getY());
            }
            if (Ice != null)
            {
                onIceLeft = true;
            }
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            Actor Water = getOneObjectAtOffset(0, 0, Water.class);
            if (Water == null && atGround())
            {
                Greenfoot.playSound("Button25.wav");
                setLocation(getX(), getY() -5 );
                YVelocity = 8;
                YVelocityTimer = 50;
            }
            else if (Water != null)
            {
                waterJump = 1;
            }
        }  
    }
    
    
    
    public void physics()
    {
        Actor Water = getOneObjectAtOffset(0, 0, Water.class); 
        Actor Ice = getOneObjectAtOffset(0, -22, Ice.class);
        
       
        if (Greenfoot.isKeyDown("space") == false && waterJump == 1)
        {
            waterJump = 0;
        }
        
        if (Greenfoot.isKeyDown("right") == false && onIceRight)
        {
            onIceRight = false;
        }
        if (Greenfoot.isKeyDown("left") == false && onIceLeft)
        {
            onIceLeft = false;
        }
        
       
        if(Water != null && !inWater)
        {
            inWater = true;
            Greenfoot.playSound("splash.mp3");
        }
        if (Water == null && inWater)
        {
            inWater = false;
        }
        
        
        if (onIceRight)
        {
            XVelocity = 1;
            XVelocityTimer = 50;
        }
        if (onIceLeft)
        {
            XVelocity = -1;
            XVelocityTimer = 50;
        }
        
        
        if (Water != null)
        {
            if (waterJump == 0)
            {
                YVelocity = 3;
            }
            else
            {
                YVelocity = 5;
            }
        }
        
       
        if(Ice == null)
        {
            XVelocity = 0;
            XVelocityTimer = 0;
        }
        
       
        if (Water != null && waterJump == 1)
        {
            YVelocity = 5;
        }
        
        
        if (Water != null && atGround())
        {
            setLocation(getX(), getY() - 1);
        }
        
       
        if(!atGround())
        {
            setLocation(getX(), getY() - (YVelocity - 4));
        }
        
        
        if(XVelocityTimer != 0)
        {
            if (XVelocity > 0 && canMoveRight() || XVelocity < 0 && canMoveLeft())
            {
                if (XVelocityTimer > 20)
                {
                    setLocation(getX() + XVelocity, getY());
                }
                if (XVelocityTimer > 10 && XVelocityTimer < 31)
                {
                    if (timer1 == 0)
                    {
                        setLocation(getX() + XVelocity, getY());
                        timer1++;
                    }
                    else
                    {
                        timer1--;
                    }
                }
                if (XVelocityTimer > 0 && XVelocityTimer < 11)
                {
                    if (timer2 == 0)
                    {
                        setLocation(getX() + XVelocity, getY());
                        timer2 += 2;
                    }
                    else
                    {
                        timer2--;
                    }                
                }
            }
        }
        
      
        if(atCeiling())
        {
            YVelocity = 0;
            YVelocityTimer = 0;
        }
        
       
        if (YVelocityTimer == 40)
        {
            YVelocity = 7;
        }
        else if (YVelocityTimer == 35)
        {
            YVelocity = 6;
        }
        else if (YVelocityTimer == 30)
        {
            YVelocity = 5;
        }
        else if (YVelocityTimer == 20)
        {
            YVelocity = 4;
        }
        else if (YVelocityTimer == 15)
        {
            YVelocity = 3;            
        }
        else if (YVelocityTimer == 10)
        {
            YVelocity = 2;           
        }
        else if (YVelocityTimer == 5)
        {
            YVelocity = 1;            
        }
        else if (YVelocityTimer == 0)
        {
            YVelocity = 0;            
        }
        
        
        if(YVelocityTimer != 0)
        {
            YVelocityTimer--;
        }
        
        
        if (XVelocityTimer == 0)
        {
            XVelocity = 0;
        }
        
        
        if(XVelocityTimer != 0)
        {
            XVelocityTimer--;
        }
        
    }
    
    
    public void nextLevel()
    {
       
        if (getX() >= 890)
        {
            switch (level)
            {
                case 0:
                    Greenfoot.setWorld(new level1());
                    break;
                    
                case 1:
                    Greenfoot.setWorld(new level2());
                    break;
                case 2:
                    Greenfoot.setWorld(new level3());
                    break;
                case 3:
                    Greenfoot.setWorld(new level4());
                    break;
                case 4:
                    Greenfoot.setWorld(new level5());
                    break;
                case 5:
                    Greenfoot.setWorld(new level6());
                    break;
                case 6:
                    Greenfoot.setWorld(new level7());
                    break;
                case 7:
                    Greenfoot.setWorld(new level8());
                    break;
                case 8:
                    Greenfoot.setWorld(new level9());
                    break;
                case 9:
                    Greenfoot.setWorld(new level10());
                    break;
                case 10:
                    Greenfoot.setWorld(new level11());
                    break;
                case 11:
                    Greenfoot.setWorld(new level12());
                    break;
                case 12:
                     Greenfoot.setWorld(new level13());
                     break;
                case 13:
                     Greenfoot.setWorld(new level14());
                     break;
                case 14:
                     Greenfoot.setWorld(new level15());    
                     break;
                case 15:
                     Greenfoot.setWorld(new level0());
                break;
            }
        }
    }
    
   
    public void die()
    {
        
        if (getY() >= 597)
        
        {
            setLocation(25, 498);
            if(level == 13)
            {
               level13 level = (level13) getWorld();
               level.reset();
                 
            }
            else if (level == 14)
            {
                level14 level = (level14) getWorld();
                level.reset();
               
            }
            else if (level == 15)
            {
                level15 level = (level15) getWorld();
                level.reset();
                
            }
        }
        
        
        Actor badguys = getOneObjectAtOffset(0, 0, badguys.class);
        if (badguys != null)
        {
            setLocation(25, 498);
        }
    }
    
  
    public boolean atGround()
    {
        Actor ground = getOneObjectAtOffset(0, -05, ground.class);
        if (ground != null)
        {
            return true;
            
        }
        else
        {
            return false;
            
        }
    }
    
  
    public boolean canMoveRight()
    {
        Actor ground = getOneObjectAtOffset(15, -26, ground.class);
        if (ground != null)
        {
            
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    public boolean canMoveLeft()
    {
        Actor ground = getOneObjectAtOffset(-15, -26, ground.class);
        if (ground != null)
        {
           
            return false;
        }
        else
        {
            return true;
        }
    }
    
   
    public boolean atCeiling()
    {
        Actor ground = getOneObjectAtOffset(0, -26, ground.class);
        if (ground != null || getY() <= 2)
        {
    
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean onIce()
    {
        Actor Ice = getOneObjectAtOffset(0, -22, Ice.class);
        if (Ice != null)
        {
      
            return true;
        }
        else
        {
            return false;
               
        }
    }
}
