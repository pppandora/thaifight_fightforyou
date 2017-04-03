import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends game
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int damage = 10;
    public static boolean check = true;
    //GreenfootImage a = new GreenfootImage("chaL.png");
   // GreenfootImage b = new GreenfootImage("chaR.png");
    
    /** A bullet looses one life each act, and will disappear when life = 0 */
    /**
     * The bullet will damage asteroids if it hits them.
     */
    public void act()
    {
      // set a bullet side go to the left side of charector
      setLocation(getX()+10,getY());
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
   public void check(){
       // chack a side the charector stay and turn to shoot
    if(getImage().equals(charector.shoot)){
        setLocation(getX()+10,getY());
        if(isAtEdge()){
         getWorld().removeObject(this);
         return;
        }
    }
       else if(getImage().equals(charector.shoot2)){
        setLocation(getX()+10,getY());
         if(isAtEdge()){
         getWorld().removeObject(this);
         return;
       }
    
    }
   }
}




