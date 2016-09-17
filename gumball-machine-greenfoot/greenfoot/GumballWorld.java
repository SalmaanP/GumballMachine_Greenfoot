import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{
    HashMap<Integer, Picker> pickerMap = new HashMap();
    HashMap<Integer, Gumball> gumballMap = new HashMap();
    
    
    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        

        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        addObject( new Penny(), 57, 71 ) ;
        addObject( new Quarter(), 68, 156 ) ;
        addObject( new FakeQuarter(), 66, 248 ) ;

        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);
        
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(730, 94);
        pickerMap.put(0,randompicker);
        
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 470);
        pickerMap.put(1,greenpicker);
        
        gumballMap.put(0,new RedGumball());
        gumballMap.put(1,new BlueGumball());
        gumballMap.put(2,new GreenGumball());
        
        gumballmachine.setinspector(inspector);
        
        
    }
    
    public HashMap getPickerMap(){
        return pickerMap;
    }
    
    public HashMap getGumballMap(){
        return gumballMap;
    }
    
}
