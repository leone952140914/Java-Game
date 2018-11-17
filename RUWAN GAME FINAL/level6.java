import greenfoot.*; 


public class level6 extends World
{
    Player player = new Player(6);
    Part2Text1 text1 = new Part2Text1();
    Part2Text2 text2 = new Part2Text2();
    GreenfootSound sound = new GreenfootSound("cave background2.mp3");

    public level6()
    {    
      
        super(900, 600, 1); 

        prepare();
        addObject(player, 25, 498);
        addObject(text1, 450, 100);
        GreenfootSound sound = new GreenfootSound("plains background1.mp3");
        sound.playLoop();
    }
    
    public void act()
    {
        if (player.getX() > 250)
        {
            removeObject(text1);
            addObject(text2, 450, 100);
        }
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
        addObject(new Rock(), 175, 498);
        addObject(new Stone(), 225, 558);
        addObject(new Dirt(), 225, 538);
        addObject(new Dirt(), 225, 518);
        addObject(new Stone(), 275, 558);
        addObject(new Dirt(), 275, 538);
        addObject(new Dirt(), 275, 518);
        addObject(new Stone(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Dirt(), 325, 518);
        addObject(new Stone(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Dirt(), 375, 518);
        addObject(new Dirt(), 375, 498);
        addObject(new movingBlock(3, 1, 0), 575, 498);
        addObject(new Stone(), 625, 558);
        addObject(new Dirt(), 625, 538);
        addObject(new Dirt(), 625, 518);
        addObject(new Dirt(), 625, 498);
        addObject(new Stone(), 675, 558);
        addObject(new Dirt(), 675, 538);
        addObject(new Dirt(), 675, 518);
        addObject(new Rock(), 675, 498);
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
