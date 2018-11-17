import greenfoot.*;  

public class level14 extends World
{
    Player player = new Player(14);
    
    public level14()
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
        addObject(new Ice(), 25, 338);
        addObject(new Water(), 25, 318);
        addObject(new Water(), 25, 298);
        addObject(new Water(), 25, 278);
        addObject(new Water(), 25, 258);
        addObject(new Water(), 25, 238);
        addObject(new Water(), 25, 218);
        addObject(new Water(), 25, 198);
        addObject(new Water(), 25, 178);
        addObject(new Dirt(), 75, 558);
        addObject(new Dirt(), 75, 538);
        addObject(new Dirt(), 75, 518);
        addObject(new Rock(), 75, 498);
        addObject(new Ice(), 75, 338);
        addObject(new Ice(), 75, 178);
        addObject(new Dirt(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Dirt(), 125, 518);
        addObject(new Ice(), 125, 178);
        addObject(new Ice(), 175, 178);
        addObject(new Ice(), 225, 518);
        addObject(new Ice(), 225, 178);
        addObject(new Ice(), 275, 178);
        addObject(new badguys(4, 2, 0), 275, 158);
        addObject(new Ice(), 325, 458);
        addObject(new Ice(), 325, 178);
        addObject(new movingBlock(4, 2, 0), 325, 338);
        addObject(new Ice(), 375, 178);
        addObject(new Ice(), 425, 398);
        addObject(new Ice(), 425, 178);
        addObject(new Ice(), 475, 178);
        addObject(new brakedownStone(3), 525, 178);
        addObject(new brakedownStone(3), 575, 178);
        addObject(new brakedownStone(3), 625, 178);
        addObject(new brakedownStone(3), 675, 178);
        addObject(new brakedownStone(3), 725, 178);
        addObject(new brakedownStone(3), 775, 178);
        addObject(new Dirt(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Dirt(), 825, 518);
        addObject(new Dirt(), 825, 498);
        addObject(new Dirt(), 825, 478);
        addObject(new Dirt(), 825, 458);
        addObject(new Dirt(), 825, 438);
        addObject(new Dirt(), 825, 418);
        addObject(new Dirt(), 825, 398);
        addObject(new Dirt(), 825, 378);
        addObject(new Dirt(), 825, 358);
        addObject(new Dirt(), 825, 338);
        addObject(new Dirt(), 825, 318);
        addObject(new Dirt(), 825, 298);
        addObject(new Dirt(), 825, 278);
        addObject(new Dirt(), 825, 258);
        addObject(new Dirt(), 825, 238);
        addObject(new Dirt(), 825, 218);
        addObject(new Dirt(), 825, 198);
        addObject(new Dirt(), 825, 178);
        addObject(new Dirt(), 875, 558);
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
    }
    
    public void reset()
    {
        addObject(new brakedownStone(3), 525, 178);
        addObject(new brakedownStone(3), 575, 178);
        addObject(new brakedownStone(3), 625, 178);
        addObject(new brakedownStone(3), 675, 178);
        addObject(new brakedownStone(3), 725, 178);
        addObject(new brakedownStone(3), 775, 178);
    }
}
