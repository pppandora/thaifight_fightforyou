import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2 extends botton
{
    /**
     * Act - do whatever the lv2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        // Add your action code here.
        checkClick();
        change();
    }    
    public void checkClick(){
        //set a sound and mouse click , change the world to new world
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Greenfoot.setWorld(new LevelTwo());
        } 
    }   
    public void change(){
        // set image when mouse move
        if(Greenfoot.mouseMoved(this)){
            setImage("levbot20.png");
        }else{
            setImage("levbot2.png");
        }
        
    }
}
