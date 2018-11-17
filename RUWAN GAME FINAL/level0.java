import greenfoot.*;  


public class level0 extends World
{
 Player player = new Player(3);
GreenfootSound sound = new GreenfootSound("WORKFIRE (1).mp3");
    
    
    public level0()
    {    
       
        super(900, 600, 1); 
        
        
        prepare();
        
        addObject(new WinText1(), 450, 150);
        addObject(new WinText2(), 450, 560);
        addObject(new WinText3(), 725, 25);
        
        addObject(new Player(0), 75, 478);
        }
    
    private void prepare()
    {
        addObject(new Stone(), 25, 498);
        addObject(new Stone(), 75, 498);
        addObject(new Stone(), 125, 498);
        addObject(new Stone(), 175, 498);
        addObject(new Stone(), 225, 498);
        addObject(new Rock(), 225, 478);
        addObject(new Stone(), 275, 498);
        addObject(new Stone(), 325, 498);
        addObject(new Stone(), 375, 498);
        addObject(new Stone(), 425, 498);
        addObject(new Stone(), 475, 498);
        addObject(new Stone(), 525, 498);
        addObject(new Stone(), 575, 498);
        addObject(new Stone(), 625, 498);
        addObject(new Stone(), 675, 498);
        addObject(new Rock(), 675, 478);
        addObject(new Stone(), 725, 498);
        addObject(new Stone(), 775, 498);
        addObject(new Stone(), 825, 498);
        addObject(new Stone(), 875, 498);
    }
}
