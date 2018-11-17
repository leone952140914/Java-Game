import greenfoot.*;  
import java.awt.Color;

public class WinText1 extends texts
{
    char a;    
    int timer = 20;
    public WinText1() 
    {
        setImage(new GreenfootImage("CONGRATZ, YOU ARE THE WINNER!!", 65, Color.red, Color.white));
    }   
    
   
    public void act() 
    {
        if (a == 1)
        {
            setImage(new GreenfootImage("CONGRATZ, YOU ARE THE WINNER!!", 65, Color.red, Color.white));
            if (timer == 0)
            {
                a = 0;
                timer = 20;
            }
            else
            {
                timer--;
            }
        }
        else
        {
            setImage(new GreenfootImage("CONGRATZ, YOU ARE THE WINNER!!", 65, Color.yellow, Color.white));
            if (timer == 0)
            {
                a = 1;
                timer = 20;
            }
            else
            {
                timer--;
            }
        }
    }    
}
