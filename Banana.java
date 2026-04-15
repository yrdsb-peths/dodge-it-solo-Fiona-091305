import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        
        if(getX() <= 0)
        {
            resetBanana();
        }
        if(isTouching(hero.class))
        {
            // ADD A GAMEOVER SYMBOL
            getWorld().removeObject(this);
        }
    }
    public void resetBanana()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(int num == 0)
        {
            setLocation(600, 100);
        }
        else
        {
            setLocation(600, 300);
        }
    }
}
