import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1 extends botton
{
    /**
     * Act - do whatever the lv1 wants to do. This method is called whenever
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
            Greenfoot.setWorld(new LevelOne());
        } 
    }
    public void change(){
        // set image when mouse move
        if(Greenfoot.mouseMoved(this)){
            setImage("levbot10.png");
        }else{
            setImage("levbot1.png");
        }
    }
}
