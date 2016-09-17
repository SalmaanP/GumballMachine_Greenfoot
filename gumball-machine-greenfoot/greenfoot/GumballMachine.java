import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Salmaan
 */
public class GumballMachine extends Actor
{
    boolean waitingForCrank;
    boolean coinPresent;
    Coin coin = null;
    Coin savedCoin = null;
    Inspector inspector = null;
    Message m = new Message();
    
    public void setinspector(Inspector in){
        inspector = in;
        
    }
    
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 400, 300 ) ; 
    }

    public void act() 
    {   
        if(coinPresent){
            if(Greenfoot.mouseClicked(this)){
                displayMessage("Inspecting coin, hold on",100,700);
                moveGumball();
                inspector.inspectCoin(savedCoin);
                coinPresent = false;
                coin = null;
                coinPresent = false;
            } 
        }else if(Greenfoot.mouseClicked(this)){
                displayMessage("Put in a coin first!",150,600);
                
            }
        
        coin = (Coin)getOneObjectAtOffset( +10, +10, Coin.class);
        if(coin != null){
            
            if(!coinPresent){
                coin = (Coin) coin;
                savedCoin = coin;
                removeCoin(coin);
                waitingForCrank = true;
                coinPresent = true;
                displayMessage("Turn the crank!",150,600);
            } else {
                
                
                
            }
            
        }
          
    }

public void removeCoin(Coin c){
    
    Actor gm = getOneObjectAtOffset(+50,+50,GumballMachine.class);
    GumballMachine gm1 = (GumballMachine) gm;
    int i=c.getImage().getHeight();
    int j=c.getImage().getWidth();
    for(int l=i,m=j; l>0||m>0 ;l=l-10,m=m-10){
        c.getImage().scale(l, m);
        c.getImage().rotate(15);
        Greenfoot.delay(3);
        //gm1.setRotation(1);
    }
    World game = getWorld();
    game.removeObject(c);

}

public void moveGumball(){
    for(int i=0;i<5;i++){
        this.setRotation(i);
        Greenfoot.delay(1);
    }
    for(int i=4;i>=0;i--){
        this.setRotation(-(i));
        Greenfoot.delay(1);
    }
}
    
public void displayMessage(String msg, int x, int y){
    
    m.setText(msg);
    GumballWorld g = (GumballWorld) getWorld();
    g.addObject(m,120,550);
    Greenfoot.delay(100);
    g.removeObject(m);
    
}
}
