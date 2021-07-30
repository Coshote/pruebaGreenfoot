import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @coshote 
 * @V1 13.07.21
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
                               ////AQUI EMPIEZA PARTE 13.
    //public void act()
    //{
        //if (isHungry()==true)
        //{
           //for (int i=0; i<4; i++) 
        //{
            //setImage("cat-eat.png");
            //wait(8);
            //setImage("cat-eat-2.png");
            //wait(6);
        //}
        //setImage("cat.png"); 
        //}
    //}
//}
                          ////AQUI termina PARTE 13.
        
                         ////AQUI EMPIEZA PARTE 14.
    //public void act() 
    //{
     //if (isSleepy()==true)
     //{
        //for (int i=0; i<4; i++) 
        //{
            //for (int j=1; j<=4; j++) 
            //{
                //setImage("cat-sleep-" + j + ".png");
                //wait(10);
            //}
        //}
        //setImage("cat.png");
        //setImage("cat-speak.png");
        //Greenfoot.playSound("hooray.wav");
        //wait(20);
        //setImage("cat.png");
     //}
     //if (isSleepy()==false)
     //{
        //setImage("cat-speak.png");
        //Greenfoot.playSound("hooray.wav");
        //wait(20);
        //setImage("cat.png");
     //}
    //}
                           ///AQUI TERMINA PARTE 14
                           
                           ////AQUI EMPIEZA PARTE 15. 
    public void act()
    {
        
        if (isAlone()==false)
        {
            setImage("cat-speak.png");
            Greenfoot.playSound("hooray.wav");
            wait(20);
            setImage("cat.png");  
        }
        
        if (isAlone())
        {
            
            for (int i=0; i<5; i++) 
            {
            for (int j=1; j<=4; j++) 
            {
                setImage("cat-sleep-" + j + ".png");
                wait(10);
            }
            }
            setImage("cat.png");
        }
                         //PARTE 15 TERMINA AQUÍ
    }
}
