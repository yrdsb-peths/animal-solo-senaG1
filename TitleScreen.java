import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen
 * 
 * @author Sena 
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
        
        setBackground("images/background2.png");
    }

    /**
     * The main world act loop  
     */
    public void act()
    {
        //Start the game if user presser the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        } 
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,361,135);
        Label label = new Label("Press >space> to start", 40);
        addObject(label,228,254);
        Label label2 = new Label("Use \u2190 and \u2192 to move", 35);
        addObject(label2,198,331);
        label2.setLocation(290,307);
        label2.setLocation(227,294);
        label2.setLocation(240,296);
        elephant.setLocation(300,106);
        elephant.setLocation(257,124);
        elephant.setLocation(279,111);
        elephant.setLocation(296,79);
        label.setLocation(376,238);
        label.setLocation(324,229);
        label2.setLocation(380,324);
        label2.setLocation(278,314);
        label2.setLocation(304,328);
        label.setLocation(324,268);
        label.setLocation(302,268);
    }
}
