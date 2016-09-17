import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{

    public Alien()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
    }    
    
    public void displayMessage(String msg){
    
        Message m = new Message();
        m.setText(msg);
        GumballWorld g = (GumballWorld) getWorld();
        g.addObject(m,120,550);
        Greenfoot.delay(100);
        g.removeObject(m);
    }
}
