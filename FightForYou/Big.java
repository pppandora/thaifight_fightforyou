import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Big here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Big extends Actor
{
    /**
     * Act - do whatever the Big wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int life = 900;
    
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
   
    
    public void movement(){
        //set a movement of bot
        move(-4);
        if(isAtEdge()){
        getWorld().removeObject(this);
        }
    }
    
 
 public void hitya(int damage) {
        // check a damage of bullet from boss
        life = life - damage;
        if(life <= 0) 
           getWorld().removeObject(this);         
    } 
}
