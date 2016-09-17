import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void pickGumball(){
        Message m = new Message();
        Message m2 = new Message();
        GumballWorld g = (GumballWorld) getWorld();
        Gumball gumball = (Gumball) g.getGumballMap().get(2);
        g.addObject(gumball, 400, 350);
        moveToPicker(gumball);
        displayMessage("I Like bug pokemon!...hence the green");
        g.removeObject(gumball);
        
    }
    
    public void moveToPicker(Gumball b){
        
        b.turnTowards(680, 441);
        for(int i=0;i<42;i++){
            b.move(5);
            Greenfoot.delay(1);
        }
    }
}
