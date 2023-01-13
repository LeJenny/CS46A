
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Color carColor;
    Rectangle carBody;
    Ellipse backTire;
    Ellipse frontTire;

    public Car(int x, int y, Color bodyColor)
    {
        // initialise instance variables
        this.carBody = new Rectangle(x,y,150,50);
        this.frontTire = new Ellipse(x,y+35,30,30);
        this.backTire = new Ellipse(x+120,y+35,30,30);
        
        
        Color redColor = Color.RED;
        Color blueColor = Color.BLUE;
        Color greenColor = Color.GREEN;
        Color blackColor = Color.BLACK;
        
        carBody.setColor(bodyColor);
        frontTire.setColor(blackColor);
        backTire.setColor(blackColor);

        frontTire.fill();
        backTire.fill();
        carBody.fill();
    }

}
