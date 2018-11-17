import greenfoot.*;  


public class level13 extends World
{
    Player player = new Player(13);
    
    public level13()
    {    
        
        super(900, 600, 1); 
        
        
        prepare();
        addObject(new part3text2(), 450, 100);
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
        addObject(new Dirt(), 125, 498);
        addObject(new Dirt(), 125, 478);
        addObject(new Dirt(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Dirt(), 175, 518);
        addObject(new Dirt(), 175, 498);
        addObject(new Dirt(), 175, 478);
        addObject(new Dirt(), 175, 458);
        addObject(new Dirt(), 175, 438);
        addObject(new Dirt(), 225, 558);
        addObject(new Dirt(), 225, 538);
        addObject(new Dirt(), 225, 518);
        addObject(new Dirt(), 225, 498);
        addObject(new Dirt(), 225, 478);
        addObject(new Dirt(), 225, 458);
        addObject(new Dirt(), 225, 438);
        addObject(new Dirt(), 225, 418);
        addObject(new Dirt(), 225, 398);
        addObject(new Dirt(), 275, 558);
        addObject(new Dirt(), 275, 538);
        addObject(new Dirt(), 275, 518);
        addObject(new Dirt(), 275, 498);
        addObject(new Dirt(), 275, 478);
        addObject(new Dirt(), 275, 458);
        addObject(new Dirt(), 275, 438);
        addObject(new Dirt(), 275, 418);
        addObject(new Dirt(), 275, 398);
        addObject(new Dirt(), 275, 378);
        addObject(new Dirt(), 275, 358);
        addObject(new Dirt(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Dirt(), 325, 518);
        addObject(new Dirt(), 325, 498);
        addObject(new Dirt(), 325, 478);
        addObject(new Dirt(), 325, 458);
        addObject(new Dirt(), 325, 438);
        addObject(new Dirt(), 325, 418);
        addObject(new Dirt(), 325, 398);
        addObject(new Dirt(), 325, 378);
        addObject(new Dirt(), 325, 358);
        addObject(new Dirt(), 325, 338);
        addObject(new Dirt(), 325, 318);
        addObject(new Rock(), 325, 298);
        addObject(new Dirt(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Dirt(), 375, 518);
        addObject(new Dirt(), 375, 498);
        addObject(new Dirt(), 375, 478);
        addObject(new Dirt(), 375, 458);
        addObject(new Dirt(), 375, 438);
        addObject(new Dirt(), 375, 418);
        addObject(new Dirt(), 375, 398);
        addObject(new Dirt(), 375, 378);
        addObject(new Dirt(), 375, 358);
        addObject(new Dirt(), 375, 338);
        addObject(new Dirt(), 375, 318);
        addObject(new Dirt(), 375, 298);
        addObject(new brakedownStone(5), 425, 298);
        addObject(new brakedownStone(5), 475, 298);
        addObject(new brakedownStone(5), 525, 298);
        addObject(new brakedownStone(5), 575, 298);
        addObject(new brakedownStone(5), 625, 298);
        addObject(new brakedownStone(5), 675, 298);
        addObject(new brakedownStone(5), 725, 298);
        addObject(new Dirt(), 775, 558);
        addObject(new Dirt(), 775, 538);
        addObject(new Dirt(), 775, 518);
        addObject(new Dirt(), 775, 498);
        addObject(new Dirt(), 775, 478);
        addObject(new Dirt(), 775, 458);
        addObject(new Dirt(), 775, 438);
        addObject(new Dirt(), 775, 418);
        addObject(new Dirt(), 775, 398);
        addObject(new Dirt(), 775, 378);
        addObject(new Dirt(), 775, 358);
        addObject(new Dirt(), 775, 338);
        addObject(new Dirt(), 775, 318);
        addObject(new Dirt(), 775, 298);
        addObject(new Dirt(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Dirt(), 825, 518);
        addObject(new Dirt(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
    }
    
    public void reset()
    {
        addObject(new brakedownStone(5), 425, 298);
        addObject(new brakedownStone(5), 475, 298);
        addObject(new brakedownStone(5), 525, 298);
        addObject(new brakedownStone(5), 575, 298);
        addObject(new brakedownStone(5), 625, 298);
        addObject(new brakedownStone(5), 675, 298);
        addObject(new brakedownStone(5), 725, 298);
        removeObject(player);
        addObject(player, 25, 498);
    }
}
