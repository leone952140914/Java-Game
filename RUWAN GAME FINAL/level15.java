import greenfoot.*;  


public class level15 extends World
{
    Player player = new Player(15);
   
    public level15()
    {    
        
        super(900, 600, 1); 
        
        
        prepare();
        addObject(new part3text3(), 450, 100);
        addObject(player, 25, 498);
    }
        
    
    private void prepare()
    {
        addObject(new Dirt(), 25, 558);
        addObject(new Dirt(), 25, 538);
        addObject(new Dirt(), 25, 518);
        addObject(new Dirt(), 75, 558);
        addObject(new Dirt(), 75, 538);
        addObject(new Dirt(), 75, 518);
        addObject(new Ice(), 75, 338);
        addObject(new Dirt(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Dirt(), 125, 518);
        addObject(new Rock(), 125, 498);
        addObject(new movingBlock(6, 1, 1), 125, 278);
        addObject(new Dirt(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Dirt(), 175, 518);
        addObject(new badguys(2, 2, 1), 75, 498);
        addObject(new Dirt(), 225, 558);
        addObject(new Dirt(), 225, 538);
        addObject(new Ice(), 225, 518);
        addObject(new Dirt(), 275, 558);
        addObject(new Dirt(), 275, 538);
        addObject(new Ice(), 275, 518);
        addObject(new Dirt(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Ice(), 325, 518);
        addObject(new Dirt(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Ice(), 375, 518);
        addObject(new badguys(2, 2, 0), 375, 498);
        addObject(new Dirt(), 425, 558);
        addObject(new Dirt(), 425, 538);
        addObject(new Ice(), 425, 518);
        addObject(new movingBlock(6, 1, 0), 425, 398);
        addObject(new Dirt(), 475, 558);
        addObject(new Dirt(), 475, 538);
        addObject(new Ice(), 475, 518);
        addObject(new Ice(), 475, 498);
        addObject(new Ice(), 475, 478);
        addObject(new Ice(), 475, 218);
        addObject(new Ice(), 525, 198);
        addObject(new brakedownIce(1), 625, 178);
        addObject(new brakedownIce(2), 675, 178);
        addObject(new brakedownIce(1), 725, 178);
        addObject(new Ice(), 825, 198);
        addObject(new Ice(), 875, 218);
    }
    
    public void reset()
    {
        addObject(new brakedownIce(1), 625, 178);
        addObject(new brakedownIce(2), 675, 178);
        addObject(new brakedownIce(1), 725, 178);
    }
}
