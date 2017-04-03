import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resume here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class resume extends botton
{
    /**
     * Act - do whatever the resume wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        // Add your action code here.
        checkClick();
        set();
    }    
    public void checkClick(){
        //set a sound and mouse click , change the world to new world
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new Menupage());
            
            Score.score = 0;
            
        } 
    }    
    public void set(){
        if(Greenfoot.mouseClicked(this)){
            charector.HP = 100;
            LevelOne.timee=3600;
        }
    }
}
