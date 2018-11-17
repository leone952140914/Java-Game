import greenfoot.*;  

public class level8 extends World
{
    Player player = new Player(8);
  
    public level8()
    {    
        
        super(900, 600, 1); 
        
        
        prepare();
        addObject(player, 25, 498);
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
        addObject(new Rock(), 125, 498);
        addObject(new Stone(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Dirt(), 175, 518);
        addObject(new Dirt(), 175, 498);
        addObject(new Dirt(), 175, 478);
        addObject(new movingBlock(2, 1, 1), 275, 478);
        addObject(new Stone(), 475, 558);
        addObject(new Dirt(), 475, 538);
        addObject(new Dirt(), 475, 518);
        addObject(new Dirt(), 475, 498);
        addObject(new Dirt(), 475, 478);
        addObject(new Stone(), 525, 558);
        addObject(new Dirt(), 525, 538);
        addObject(new Dirt(), 525, 518);
        addObject(new Dirt(), 525, 498);
        addObject(new Dirt(), 525, 478);
        addObject(new Dirt(), 525, 458);
        addObject(new Stone(), 575, 558);
        addObject(new Dirt(), 575, 538);
        addObject(new Dirt(), 575, 518);
        addObject(new Dirt(), 575, 498);
        addObject(new Dirt(), 575, 478);
        addObject(new Dirt(), 575, 458);
        addObject(new Dirt(), 575, 438);
        addObject(new Stone(), 675, 398);
        addObject(new Stone(), 775, 358);
        addObject(new Stone(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
        addObject(new Dirt(), 875, 518);
        addObject(new Dirt(), 875, 498);
        addObject(new Dirt(), 875, 478);
        addObject(new Dirt(), 875, 458);
        addObject(new Dirt(), 875, 438);
        addObject(new Dirt(), 875, 418);
        addObject(new Dirt(), 875, 398);
        addObject(new Dirt(), 875, 378);
        addObject(new Dirt(), 875, 358);
        addObject(new Dirt(), 875, 338);
        addObject(new Dirt(), 875, 318);
        addObject(new Dirt(), 875, 198);
        addObject(new Dirt(), 875, 178);
        addObject(new Dirt(), 875, 158);
        addObject(new Dirt(), 875, 138);
        addObject(new Rock(), 875, 298);
    }
}
