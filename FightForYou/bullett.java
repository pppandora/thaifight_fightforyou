import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullett here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullett extends game
{
     private static final int damage = 10;
    /**
     * Act - do whatever the bullett wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      // set a bullet side go to the right side of charector
      setLocation(getX()-10,getY());
        if(isAtEdge()){
         getWorld().removeObject(this);
         return;
      }
      
      countScore();
      checkBulletHit();
      
    }
    
    /**
     * Check whether we have hit an asteroid.
     */
    private void checkBulletHit()
    {
        //check when it hit a monster remove it
        Monster monster = (Monster) getOneIntersectingObject(Monster.class);
      
      if (monster != null){
           monster.hit(damage);
           getWorld().removeObject(this);
      }
          
    }
     public void countScore(){
            // score increase when touching a monster
     if(isTouching(tuow.class)||isTouching(MonLv1.class))   
     {
          Score.score++;
          
     }  
   }
}
