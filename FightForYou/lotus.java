import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lotus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lotus extends Actor
{
    /**
     * Act - do whatever the lotus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(1);
        setRotation(90);
        setLocation(getX(),getY()+2);
        //prangrang();
        remove();
        
    }    
    public void remove(){
        if(isAtEdge()||isTouching(charector.class)){
            getWorld().removeObject(this);
        }
    }
    public void prangrang(){
         if(isTouching(charector.class)){
            charector.pr = true;
            charector.time = 360;
        }
    }
   }

