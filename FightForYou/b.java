import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class b extends Boss
{
    /**
     * Act - do whatever the b wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int BossHP = 500;
    int time;
    int direc =-2;
    /**
     * Act - do whatever the Ptuow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public b(){
        time = 0;
    }
    public void act() 
    {
        // Add your action code here.
        move(direc);
        shoot();
        walk();
       
    }    
    public void shoot(){
        
         time++;
          if (time == 90){
              //shoot
               getWorld().addObject(new shoot(), getX()-50, getY());
            
         }
                    
             
        }
       public void hitit(int damage2) {
        BossHP = BossHP - damage2;
         if(BossHP == 0){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new EndGame());
                            
            }
    }
    
       public void walk(){
      if(isAtEdge()){
           //walk go and back
        setImage("boss02.png");
        direc = -direc;
        }
    }
}
