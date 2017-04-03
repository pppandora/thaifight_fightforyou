import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullettboss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullettboss extends game
{
    private static final int damage2 = 10;
    /**
     * Act - do whatever the bullettboss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // set the bullet shoot from the right side of charector
       setLocation(getX()-30,getY());
        if(isAtEdge()){
         getWorld().removeObject(this);
         return;
      } 
         
       countScore();
      
      checkBulletHitit();
     
    }    
    private void checkBulletHitit()
    {
        // if touch monster remove it
        Boss mon = (Boss) getOneIntersectingObject(Boss.class);
      
      if (mon != null){
           mon.hitit(damage2);
           getWorld().removeObject(this);
      }
          
    }
    
    public void countScore(){
        // check score +10
     if(isTouching(a.class)||isTouching(b.class)||isTouching(cc.class)||isTouching(dd.class))   
    {
          Score.score=Score.score+10;
         
    }
  }
}

