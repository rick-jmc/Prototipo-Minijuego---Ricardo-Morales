import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends Movers
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Creando un constructor 
    public MazeRunner()
    {
        getImage().scale(getImage().getWidth()/4*3, getImage().getHeight()/4*3);
    }
    public void act()
    {
        slideAround();
        collectBoost();
        maxSpeed();
        mazeRunnerHit();
    }
    public void mazeRunnerHit()
    {
        if(hitEnemy())
            setLocation(150,29);
    }
}
