/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Stephen M. Burns
 * @version 2025.01.27
 */
public class Picture
{
 

    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    
    private Square background1;
    
    private Square monolith1;
    private Square monolith2;
    private Square monolith3;
    
    private Person human1;
    private Person human2;
    private Person human3;
    
    private Triangle sharp1;
    private Triangle sharp2;
    private Triangle sharp3;
    
    private Circle sun1;
    private Circle sun2;
    private Circle sun3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        
        background1= new Square();
        
        monolith1= new Square();
        monolith2= new Square();
        monolith3= new Square();
        
        human1= new Person();
        human2= new Person();
        human3= new Person();
        
        sharp1= new Triangle();
        sharp2= new Triangle();
        sharp3= new Triangle();
        
        sun1= new Circle();
        sun2= new Circle();
        sun3= new Circle();
        
        roof = new Triangle();  
        sun = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            background1.moveHorizontal(-140);
            background1.moveVertical(20);
            background1.changeSize(120);
            background1.makeVisible();
            background1.changeColor("black");
            
            monolith1;
            human1;
            sharp1;
            sun1;
            

    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background1.changeColor("white");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background1.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
