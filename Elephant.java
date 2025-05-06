import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Ele[hant, our hero
 * 
 * @author Sena Godek 
 * @version April 28 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    /**
    * Constructor - The code that gets run   
    */
    public Elephant()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    /**
    * Animate the elephant   
    */
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        
        //remove apple of elephant eatsit
        eat();
    }
    /**
    * Eats the apple and spawn new apple if an apple is eaten
    */
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }    
    }
}
