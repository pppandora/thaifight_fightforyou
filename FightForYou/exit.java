import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exit extends botton
{
    /**
     * Act - do whatever the exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        // Add your action code here.
        checkClick();
    }    
    public void checkClick(){
        //set a sound and mouse click , change the world to new world
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            
            Greenfoot.setWorld(new Startpage());
            charector.HP=100;
        } 
        
    } 
}
