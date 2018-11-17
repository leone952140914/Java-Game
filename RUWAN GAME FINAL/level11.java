import greenfoot.*; 


public class level11 extends World
{
    GreenfootSound sound = new GreenfootSound("Stormy.mp3");
    Player player = new Player(11);
    
    public level11()
    {    
        
        super(900, 600, 1); 

        prepare();
        addObject(new part3text1(), 450, 150);
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
        addObject(new Dirt(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Dirt(), 125, 518);
        addObject(new Tree3(), 125, 498);
        addObject(new Dirt(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Dirt(), 175, 518);
        addObject(new Dirt(), 225, 558);
        addObject(new Dirt(), 225, 538);
        addObject(new Dirt(), 225, 518);
        addObject(new Dirt(), 275, 558);
        addObject(new Dirt(), 275, 538);
        addObject(new Ice(), 275, 518);
        addObject(new Dirt(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Ice(), 325, 518);
        addObject(new Dirt(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Ice(), 375, 518);
        addObject(new Dirt(), 425, 558);
        addObject(new Dirt(), 425, 538);
        addObject(new Ice(), 425, 518);
        addObject(new Ice(), 525, 558);
        addObject(new Ice(), 525, 538);
        addObject(new Ice(), 525, 518);
        addObject(new Dirt(), 625, 558);
        addObject(new Dirt(), 625, 538);
        addObject(new Ice(), 625, 518);
        addObject(new Dirt(), 675, 558);
        addObject(new Dirt(), 675, 538);
        addObject(new Ice(), 675, 518);
        addObject(new Dirt(), 725, 558);
        addObject(new Dirt(), 725, 538);
        addObject(new Ice(), 725, 518);
        addObject(new Dirt(), 775, 558);
        addObject(new Dirt(), 775, 538);
        addObject(new Ice(), 775, 518);
        addObject(new Dirt(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
        addObject(new Rock(), 875, 498);
    }
}
