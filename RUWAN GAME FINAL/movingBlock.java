import greenfoot.*; 


public class movingBlock extends ground
{
    int travelDistance;
    int timer;
    int fwdBkwd;
    int speed;
    
    
    public movingBlock(int blocks, int S, int FB)
    {
        speed = S;
        fwdBkwd = FB;
        if (S == 1)
        {
            travelDistance = (blocks * 50);
        }
        else if (S == 2)
        {
            travelDistance = (blocks * 25);
        }
    }
    
    
    public void act() 
    {
        moveMe();
    }    
    
    
    public void moveMe()
    {
        
        if (fwdBkwd == 0)
        {
            if (timer == 0)
            {
                fwdBkwd = 1;
                timer = travelDistance;
            }
            else
            {
                timer--;   
            }
        }
        else
        {
            if (timer == 0)
            {
                fwdBkwd = 0;
                timer = travelDistance;
            }
            else
            {
                timer--;
            }
        }
        
        
        if (fwdBkwd == 0)
        {
            setLocation(getX() + speed, getY());
        }
        else
        {
            setLocation(getX() - speed, getY());
        }
    }
}
