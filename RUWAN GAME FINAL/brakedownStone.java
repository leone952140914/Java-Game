import greenfoot.*;  

public class brakedownStone extends ground
{
    int timer;
    char hit;
    public brakedownStone(int x)
    {
        timer = x * 10;
    }
    
   
    public void act() 
    {
        Actor player = getOneObjectAtOffset(0, 22, Player.class);
        if (player != null)
        {
            hit = 1;
        }
        if(hit == 1)
        {
            if (timer != 0)
            {
                timer--;
            }
            else
            {
                getWorld().removeObject(this);
            }
        }
    }    
}
