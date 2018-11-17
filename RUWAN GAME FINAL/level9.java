import greenfoot.*; 

public class level9 extends World
{
    Player player = new Player(9);
  
    public level9()
    {    
        
        super(900, 600, 1); 
        
        
        prepare();
        addObject(player, 25, 498);
        addObject(new Part2Text3(), 450, 100);
    }
    
    
    private void prepare()
    {
        addObject(new Stone(), 25, 558);
        addObject(new Dirt(), 25, 538);
        addObject(new Dirt(), 25, 518);
        addObject(new Stone(), 75, 558);
        addObject(new Dirt(), 75, 538);
        addObject(new Dirt(), 75, 518);
        addObject(new Stone(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Dirt(), 125, 518);
        addObject(new Stone(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Dirt(), 175, 518);
        addObject(new Stone(), 275, 429);
        addObject(new Stone(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Dirt(), 375, 518);
        addObject(new Stone(), 425, 558);
        addObject(new Dirt(), 425, 538);
        addObject(new Dirt(), 425, 518);
        addObject(new Stone(), 475, 558);
        addObject(new Dirt(), 475, 538);
        addObject(new Dirt(), 475, 518);
        addObject(new Stone(), 525, 558);
        addObject(new Dirt(), 525, 538);
        addObject(new Dirt(), 525, 518);
        addObject(new Stone(), 625, 429);
        addObject(new badguys(3, 1, 1), 375, 498);
        addObject(new Stone(), 725, 558);
        addObject(new Dirt(), 725, 538);
        addObject(new Dirt(), 725, 518);
        addObject(new Stone(), 775, 558);
        addObject(new Dirt(), 775, 538);
        addObject(new Dirt(), 775, 518);
        addObject(new Stone(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Dirt(), 825, 518);
        addObject(new Stone(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
    }
}
