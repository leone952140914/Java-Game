import greenfoot.*;  

public class level10 extends World
{
    Player player = new Player(10);
    
    public level10()
    {    
        
        super(900, 600, 1); 
        
        
        prepare();
        addObject(new Part2Text4(), 450, 100);
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
        addObject(new badguys(3, 1, 0), 175, 498);
        addObject(new Stone(), 225, 98);
        addObject(new movingBlock(6, 1, 1), 275, 38);
        addObject(new Stone(), 325, 498);
        addObject(new Stone(), 325, 158);
        addObject(new Stone(), 475, 198);
        addObject(new Water(), 525, 558);
        addObject(new Water(), 525, 538);
        addObject(new Water(), 525, 518);
        addObject(new Water(), 525, 498);
        addObject(new Water(), 525, 478);
        addObject(new Water(), 525, 458);
        addObject(new Water(), 525, 438);
        addObject(new Water(), 525, 418);
        addObject(new Water(), 525, 398);
        addObject(new Water(), 525, 378);
        addObject(new Water(), 525, 358);
        addObject(new Water(), 525, 338);
        addObject(new Water(), 525, 318);
        addObject(new Water(), 525, 298);
        addObject(new Water(), 525, 278);
        addObject(new Water(), 525, 258);
        addObject(new Water(), 525, 238);
        addObject(new Water(), 525, 218);
        addObject(new Water(), 525, 198);
        addObject(new Stone(), 575, 558);
        addObject(new Dirt(), 575, 538);
        addObject(new Dirt(), 575, 518);
        addObject(new Dirt(), 575, 498);
        addObject(new Dirt(), 575, 478);
        addObject(new Dirt(), 575, 458);
        addObject(new Dirt(), 575, 438);
        addObject(new Dirt(), 575, 418);
        addObject(new Dirt(), 575, 398);
        addObject(new Dirt(), 575, 378);
        addObject(new Dirt(), 575, 358);
        addObject(new Dirt(), 575, 338);
        addObject(new Dirt(), 575, 318);
        addObject(new Dirt(), 575, 298);
        addObject(new Dirt(), 575, 278);
        addObject(new Dirt(), 575, 258);
        addObject(new Dirt(), 575, 238);
        addObject(new Dirt(), 575, 218);
        addObject(new Stone(), 575, 198);
        addObject(new Stone(), 625, 558);
        addObject(new Dirt(), 625, 538);
        addObject(new Dirt(), 625, 518);
        addObject(new Stone(), 625, 198);
        addObject(new Stone(), 625, 178);
        addObject(new Stone(), 625, 158);
        addObject(new Stone(), 625, 138);
        addObject(new Stone(), 625, 118);
        addObject(new Stone(), 625, 98);
        addObject(new Stone(), 675, 558);
        addObject(new Dirt(), 675, 538);
        addObject(new Dirt(), 675, 518);
        addObject(new Rock(), 675, 498);
        addObject(new Stone(), 725, 558);
        addObject(new Dirt(), 725, 398);
        addObject(new Dirt(), 725, 538);
        addObject(new Dirt(), 725, 518);
        addObject(new Stone(), 775, 558);
        addObject(new Dirt(), 775, 538);
        addObject(new Dirt(), 775, 518);
        addObject(new Dirt(), 775, 398);
        addObject(new Stone(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Dirt(), 825, 518);
        addObject(new Dirt(), 825, 398);
        addObject(new Rock(), 825, 378);
        addObject(new badguys(4, 1, 1), 625, 498);
        addObject(new badguys(2, 1, 0), 825, 378);
        addObject(new Stone(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
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
        addObject(new Dirt(), 875, 158);
        addObject(new Dirt(), 875, 138);
        addObject(new Dirt(), 875, 118);
        addObject(new Dirt(), 875, 98);
        addObject(new Dirt(), 875, 78);
        addObject(new Dirt(), 875, 58);
        addObject(new Dirt(), 875, 38);
        addObject(new Dirt(), 875, 18);
    }
}
