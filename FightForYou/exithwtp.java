import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exithwtp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exithwtp extends botton
{
    /**
     * Act - do whatever the exithwtp wants to do. This method is called whenever
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
            Greenfoot.setWorld(new Menupage());
    }    
   }
}
