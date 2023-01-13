
/**
 * Write a description of class OneNewCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OneNewCar
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class OneNewCar
     */
    public OneNewCar()
    {
        // initialise instance variables
        Rectangle body = new Rectangle(0,0,150,50);
        Color redColor = Color.RED;
        body.setColor(redColor);
        body.fill();
        
        Ellipse w1 = new Ellipse(0,35,30,30);
        Ellipse w2 = new Ellipse(120,35,30,30);
        Color blackColor = Color.BLACK;
        w1.setColor(blackColor);
        w1.fill();
        w2.setColor(blackColor);
        w2.fill();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
