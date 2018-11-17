                                                                                                                                                                                                              import greenfoot.*; 


public class level5 extends World
{
   Player player = new Player(5);
   InstructionText5 text5 = new InstructionText5();
  
   public level5()
   {    
      
      super(900, 600, 1);   
      
      
      prepare();
      addObject(text5, 450, 150);
      addObject(player, 25, 498);
      GreenfootSound sound = new GreenfootSound("plains background1.mp3");
      sound.playLoop();
   }

  
    private void prepare()
    {
        addObject(new Dirt(), 25, 558);
        addObject(new Dirt(), 25, 538);
        addObject(new Grass(), 25, 518);
        addObject(new Dirt(), 75, 558);
        addObject(new Dirt(), 75, 538);
        addObject(new Grass(), 75, 518);
        addObject(new Stone(), 75, 338);
        addObject(new Dirt(), 125, 558);
        addObject(new Dirt(), 125, 538);
        addObject(new Grass(), 125, 518);
        addObject(new Dirt(), 175, 558);
        addObject(new Dirt(), 175, 538);
        addObject(new Grass(), 175, 518);
        addObject(new Stone(), 175, 398);
        addObject(new Dirt(), 225, 558);
        addObject(new Dirt(), 225, 538);
        addObject(new Grass(), 225, 518);
        addObject(new Dirt(), 275, 558);
        addObject(new Dirt(), 275, 538);
        addObject(new Grass(), 275, 518);
        addObject(new Stone(), 320, 498);
        addObject(new Stone(), 320, 478);
        addObject(new Stone(), 320, 458);
        addObject(new Dirt(), 325, 558);
        addObject(new Dirt(), 325, 538);
        addObject(new Grass(), 325, 518);
        addObject(new movingBlock(5, 1, 0), 325, 298);
        addObject(new Dirt(), 375, 558);
        addObject(new Dirt(), 375, 538);
        addObject(new Grass(), 375, 518);
        addObject(new Stone(), 375, 258);
        addObject(new Tree2(), 375, 498);
        addObject(new Dirt(), 425, 558);
        addObject(new Dirt(), 425, 538);
        addObject(new Grass(), 425, 518);
        addObject(new Stone(), 425, 498);
        addObject(new Stone(), 425, 478);
        addObject(new Stone(), 425, 458);
        addObject(new Stone(), 425, 438);
        addObject(new Stone(), 425, 418);
        addObject(new Stone(), 425, 398);
        addObject(new Stone(), 425, 378);
        addObject(new Stone(), 425, 358);
        addObject(new Stone(), 425, 338);
        addObject(new Stone(), 425, 318);
        addObject(new Stone(), 425, 298);
        addObject(new Stone(), 425, 278);
        addObject(new Stone(), 425, 258);
        addObject(new Stone(), 425, 238);
        addObject(new Stone(), 425, 218);
        addObject(new Dirt(), 475, 558);
        addObject(new Dirt(), 475, 538);
        addObject(new Grass(), 475, 518);
        addObject(new movingBlock(2, 2, 1), 475, 298);
        addObject(new Dirt(), 525, 558);
        addObject(new Dirt(), 525, 538);
        addObject(new Grass(), 525, 518);
        addObject(new Dirt(), 575, 558);
        addObject(new Dirt(), 575, 538);
        addObject(new Grass(), 575, 518);
        addObject(new movingBlock(2, 2, 0), 575, 238);
        addObject(new Dirt(), 625, 558);
        addObject(new Dirt(), 625, 538);
        addObject(new Grass(), 625, 518);
        addObject(new Stone(), 625, 278);
        addObject(new Stone(), 625, 258);
        addObject(new Stone(), 625, 238);
        addObject(new Stone(), 625, 218);
        addObject(new Stone(), 625, 198);
        addObject(new Stone(), 625, 178);
        addObject(new Stone(), 625, 158);
        addObject(new Stone(), 625, 138);
        addObject(new Stone(), 625, 118);
        addObject(new Stone(), 625, 98);
        addObject(new Stone(), 625, 78);
        addObject(new Tree1(), 625, 498);
        addObject(new Dirt(), 675, 558);
        addObject(new Dirt(), 675, 538);
        addObject(new Grass(), 675, 518);
        addObject(new Stone(), 675, 218);
        addObject(new Dirt(), 725, 558);
        addObject(new Water(), 725, 538);
        addObject(new Water(), 725, 518);
        addObject(new Water(), 725, 498);
        addObject(new Water(), 725, 478);
        addObject(new Water(), 725, 458);
        addObject(new Water(), 725, 438);
        addObject(new Water(), 725, 418);
        addObject(new Water(), 725, 398);
        addObject(new Water(), 725, 378);
        addObject(new Water(), 725, 358);
        addObject(new Water(), 725, 338);
        addObject(new Water(), 725, 318);
        addObject(new Water(), 725, 298);
        addObject(new Water(), 725, 278);
        addObject(new Water(), 725, 258);
        addObject(new Water(), 725, 238);
        addObject(new Water(), 725, 218);
        addObject(new Dirt(), 775, 558);
        addObject(new Water(), 775, 538);
        addObject(new Water(), 775, 518);
        addObject(new Water(), 775, 498);
        addObject(new Water(), 775, 478);
        addObject(new Water(), 775, 458);
        addObject(new Water(), 775, 438);
        addObject(new Water(), 775, 418);
        addObject(new Water(), 775, 398);
        addObject(new Water(), 775, 378);
        addObject(new Water(), 775, 358);
        addObject(new Water(), 775, 338);
        addObject(new Water(), 775, 318);
        addObject(new Water(), 775, 298);
        addObject(new Water(), 775, 278);
        addObject(new Water(), 775, 258);
        addObject(new Water(), 775, 238);
        addObject(new Water(), 775, 218);
        addObject(new Dirt(), 825, 558);
        addObject(new Dirt(), 825, 538);
        addObject(new Dirt(), 825, 518);
        addObject(new Stone(), 825, 498);
        addObject(new Stone(), 825, 478);
        addObject(new Stone(), 825, 458);
        addObject(new Stone(), 825, 438);
        addObject(new Stone(), 825, 418);
        addObject(new Stone(), 825, 398);
        addObject(new Stone(), 825, 378);
        addObject(new Stone(), 825, 358);
        addObject(new Stone(), 825, 338);
        addObject(new Stone(), 825, 318);
        addObject(new Stone(), 825, 298);
        addObject(new Stone(), 825, 278);
        addObject(new Stone(), 825, 258);
        addObject(new Stone(), 825, 238);
        addObject(new Stone(), 825, 218);
        addObject(new Dirt(), 875, 558);
        addObject(new Dirt(), 875, 538);
        addObject(new Dirt(), 875, 518);
        addObject(new Stone(), 875, 498);
        addObject(new Stone(), 875, 478);
        addObject(new Stone(), 875, 458);
        addObject(new Stone(), 875, 438);
        addObject(new Stone(), 875, 418);
        addObject(new Stone(), 875, 398);
        addObject(new Stone(), 875, 378);
        addObject(new Stone(), 875, 358);
        addObject(new Stone(), 875, 338);
        addObject(new Stone(), 875, 318);
        addObject(new Stone(), 875, 298);
        addObject(new Stone(), 875, 278);
        addObject(new Stone(), 875, 258);
        addObject(new Stone(), 875, 238);
        addObject(new Stone(), 875, 218);
        addObject(new Rock(), 875, 198);
    }
}
