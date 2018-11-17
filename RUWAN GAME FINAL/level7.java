import greenfoot.*;  


public class level7 extends World
{
    Player player = new Player(7);
    
    public level7()
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
        addObject(new Rock(), 75, 498);
        addObject(new Stone(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Dirt(), 125, 518);
        addObject(new Stone(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Dirt(), 175, 518);
        addObject(new Stone(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Dirt(), 325, 518);
        addObject(new Stone(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Dirt(), 375, 518);
        addObject(new Dirt(), 375, 498);
        addObject(new Stone(),500, 558);
        addObject(new Dirt(), 500, 538);
        addObject(new Dirt(), 500, 518);
        addObject(new Dirt(), 500, 498);
        addObject(new Dirt(), 500, 478);
        addObject(new Dirt(), 500, 458);
        addObject(new Rock(), 475, 438);
        addObject(new Stone(), 625, 218);
        addObject(new Water(), 675, 558);
        addObject(new Water(), 675, 538);
        addObject(new Water(), 675, 518);
        addObject(new Water(), 675, 498);
        addObject(new Water(), 675, 478);
        addObject(new Water(), 675, 458);
        addObject(new Water(), 675, 438);
        addObject(new Water(), 675, 418);
        addObject(new Water(), 675, 398);
        addObject(new Water(), 675, 378);
        addObject(new Water(), 675, 358);
        addObject(new Water(), 675, 338);
        addObject(new Water(), 675, 318);
        addObject(new Water(), 675, 298);
        addObject(new Water(), 675, 278);
        addObject(new Water(), 675, 258);
        addObject(new Water(), 675, 238);
        addObject(new Water(), 675, 218);
        addObject(new Stone(), 725, 218);
        addObject(new Stone(), 875, 558);
        addObject(new Dirt(), 875, 538);
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
        addObject(new Dirt(), 875, 298);
        addObject(new Dirt(), 875, 278);
        addObject(new Dirt(), 875, 258);
        addObject(new Dirt(), 875, 238);
        addObject(new Dirt(), 875, 218);
        addObject(new Dirt(), 875, 198);
        addObject(new Dirt(), 875, 178);
        addObject(new Rock(), 875, 159);
    }
}
