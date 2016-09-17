import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage gi;

    
    public Message()
    {
       gi = new GreenfootImage(700,50);
        
       //GreenfootImage gi = getImage() ;
       setImage(gi);     
       //gi.scale( 400, 50 ) ; 
        
    }

    public void setText( String msg)
    {
        GumballWorld g = (GumballWorld) getWorld();
        gi.clear();
        gi.setColor( java.awt.Color.getHSBColor(96, 96, 96) ) ;
        gi.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ;
        gi.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 16));
        
        gi.drawString( msg, 250, 25 );  

    }

    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {          
            World world = getWorld();
            world.removeObject( this ) ;
            
        }
    }    
}

