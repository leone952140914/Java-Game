import greenfoot.*; 


public class level3 extends World
{
    Player player = new Player(3);
    InstructionText3 text3 = new InstructionText3();
    GreenfootSound sound = new GreenfootSound("plains background1.mp3");
    
    public level3()
    {    
        
        super(900, 600, 1); 

        prepare();
        addObject(text3, 450, 150);
        addObject(player, 25, 498);
    }

    public void act()
    {
        if(!sound.isPlaying())
        {
            sound.play();
        }
    }

    
    private void prepare()
    {
        addObject(new Dirt(), 25, 558);
        addObject(new Dirt(), 25, 538);
        addObject(new Grass(), 25, 518);
        addObject(new Dirt(), 75, 558);
        addObject(new Dirt(), 75, 538);
        addObject(new Grass(), 75, 518);
        addObject(new Tree1(), 75, 498);
        addObject(new Dirt(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Grass(), 125, 518);
        addObject(new Stone(), 125, 498);       
        addObject(new Dirt(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Grass(), 175, 518);
        addObject(new Stone(), 175, 498);
        addObject(new Stone(), 175, 478);
        addObject(new Dirt(), 225, 558);
        addObject(new Dirt(), 225, 538);
        addObject(new Grass(), 225, 518);
        addObject(new Stone(), 225, 498);
        addObject(new Stone(), 225, 478);
        addObject(new Stone(), 225, 458);
        addObject(new Dirt(), 275, 558);
        addObject(new Dirt(), 275, 538);
        addObject(new Grass(), 275, 518);
        addObject(new Stone(), 275, 498);
        addObject(new Stone(), 275, 478);
        addObject(new movingBlock(5, 1, 1), 275, 398);
        addObject(new Dirt(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Grass(), 325, 518);
        addObject(new Stone(), 325, 498);
        addObject(new Dirt(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Grass(), 375, 518);
        addObject(new Dirt(), 425, 558);
        addObject(new Dirt(), 425, 538);
        addObject(new Grass(), 425, 518);
        addObject(new Dirt(), 475, 558);
        addObject(new Dirt(), 475, 538);
        addObject(new Grass(), 475, 518);
        addObject(new Dirt(), 525, 558);
        addObject(new Dirt(), 525, 538);
        addObject(new Grass(), 525, 518);
        addObject(new Dirt(), 575, 558);
        addObject(new Dirt(), 575, 538);
        addObject(new Grass(), 575, 518);
        addObject(new Tree3(), 575, 498);
        addObject(new Dirt(), 625, 558);
        addObject(new Dirt(), 625, 538);
        addObject(new Grass(), 625, 518);
        addObject(new Dirt(), 675, 558);
        addObject(new Dirt(), 675, 538);
        addObject(new Grass(), 675, 518);
        addObject(new Tree2(), 675, 498);
        addObject(new Dirt(), 725, 558);
        addObject(new Dirt(), 725, 538);
        addObject(new Grass(), 725, 518);
        addObject(new Dirt(), 775, 558);
        addObject(new Dirt(), 775, 538);
        addObject(new Grass(), 775, 518);
        addObject(new Dirt(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Grass(), 825, 518);
        addObject(new movingBlock(5, 1, 0), 825, 378);
        addObject(new Dirt(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Grass(), 875, 518);
        addObject(new Stone(), 875, 498);
        addObject(new Stone(), 875, 478);
        addObject(new Stone(), 875, 458);
        addObject(new Stone(), 875, 438);
        addObject(new Stone(), 875, 418);
        addObject(new Stone(), 875, 398);
        addObject(new Stone(), 875, 378);
    }
}
