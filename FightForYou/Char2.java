import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Char2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Char2 extends Actor
{ /**
     * Act - do whatever the charector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootSound gun = new GreenfootSound("gun.wav");
    public GreenfootSound guns = new GreenfootSound("gunboss.wav");
    public GreenfootSound jump = new GreenfootSound("jump.wav");
    
    public static GreenfootImage left = new GreenfootImage("011.png");
    public static GreenfootImage right = new GreenfootImage("01.png");
    public static GreenfootImage shoot = new GreenfootImage("1.png");
    public static GreenfootImage shoot2 = new GreenfootImage("11.png");
    
    
    public int ySpeed;
    public int groundLevel=286;
    public int heart = 5;
    public static boolean pr = false;
    int delay;
    public static int time = 0;
    public Char2(){
        delay = 30;
    }
    public void act() 
    {
        // Add your action code here.
        action(); 
        checkFire();
        jump();
        delay++;
        bump();
    }

    public void checkFire()
    {
     
        if(Greenfoot.isKeyDown("z")) {
            if(delay>=30){
               
               if(getImage().equals(right)||getImage().equals(shoot)){
                 setImage(shoot);
                 getWorld().addObject(new Bullet(), getX(), getY());
                }
               if (getImage().equals(left)||getImage().equals(shoot2)){
                 setImage(shoot2);
                 getWorld().addObject(new bullett(), getX(), getY());
                }
               gun.play();
               gun.setVolume(10);
            }
      }
    
        if(Greenfoot.isKeyDown("x")) {
               if(delay>=30){
              
              if(getImage().equals(right)||getImage().equals(shoot)){
                 setImage(shoot);
                 getWorld().addObject(new bulletboss(), getX(), getY());
                 getWorld().addObject(new bu(), getX(), getY());
                }
              if (getImage().equals(left)||getImage().equals(shoot2)){
                 setImage(shoot2);
                getWorld().addObject(new bullettboss(), getX(), getY());
                 getWorld().addObject(new buu(), getX(), getY());
               }
              guns.play();
              guns.setVolume(70);
         }
     }
  }    
  public void action(){
       if(Greenfoot.isKeyDown("right")){
           move(3);
           setImage(right);
        }
      
       if(Greenfoot.isKeyDown("left")){
           move(-3);
           setImage(left);
       } 
            
  }
  public void jump()
  {
        boolean onGround = (getY() == groundLevel);
        if (!onGround)
        {
           ySpeed++;
           setLocation(getX(), getY()+ySpeed);
           //turn();
            if (getY()==500)
            {
                setLocation(getX(), groundLevel);
           }
        }
        else
        {
            if (Greenfoot.isKeyDown("space"))
            {
                ySpeed = -20;
                setLocation(getX(), getY()+ySpeed);
               jump.play();
               jump.setVolume(70);
            }
        }
  }
  public void hit2(int damage2) {
        heart = heart - damage2;
        if(heart == 0) {
           getWorld().removeObject(this);  
           
        }
   }
   public void bump(){
      if(isTouching(MonLv1.class)){
          getWorld().removeObject(new MonLv1());
      }
      else if(isTouching(cc.class)){
          getWorld().removeObject(new cc());
      }
    }
}

