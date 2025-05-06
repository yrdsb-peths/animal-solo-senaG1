import greenfoot.*;
/**
 * The World our hero lives in.
 * 
 * @author Sena Godek
 * @version April 2025
 */
public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        
        // Create the elephant objetc
        Elephant elephant = new Elephant();
        addObject(elephant, 300,200);
        //Vreate a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50,50);
        
        createApple();
        
        setBackground("images/background.jpg");
    }
    
    /**
    *  End the game and draw 'GameOver' 
    */
   public void gameOver(){
       
       Label gameOverLabel = new Label("Game Over", 100);
       addObject(gameOverLabel, 300, 200);
   }
   
    /**
    * Inscrease score
    */
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
    * Create a new apple at random location at top of screen
    */
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
