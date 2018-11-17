import greenfoot.*;  


public class level12 extends World
{
    Player player = new Player(12);
    
    public level12()
    {    
        
        super(900, 600, 1); 

        prepare();
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
        addObject(new Rock(), 125, 498);
        addObject(new Ice(), 175, 558);
        addObject(new Ice(), 175, 538);
        addObject(new Ice(), 175, 518);
        addObject(new Ice(), 225, 558);
        addObject(new Ice(), 225, 538);
        addObject(new Ice(), 225, 518);
        addObject(new Ice(), 325, 558);
        addObject(new Ice(), 325, 538);
        addObject(new Ice(), 325, 518);
        addObject(new Ice(), 425, 558);
        addObject(new Ice(), 425, 538);
        addObject(new Ice(), 425, 518);
        addObject(new Ice(), 425, 498);
        addObject(new Ice(), 525, 558);
        addObject(new Ice(), 525, 538);
        addObject(new Ice(), 525, 518);
        addObject(new Ice(), 525, 498);
        addObject(new Ice(), 625, 558);
        addObject(new Ice(), 625, 538);
        addObject(new Ice(), 625, 518);
        addObject(new Ice(), 725, 558);
        addObject(new Ice(), 725, 538);
        addObject(new Ice(), 725, 518);
        addObject(new Ice(), 775, 558);
        addObject(new Ice(), 775, 538);
        addObject(new Ice(), 775, 518);
        addObject(new Dirt(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Dirt(), 825, 518);
        addObject(new Tree3(), 825, 498);
        addObject(new Dirt(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
    }
}
