/**
 * The class stores a 2-D array of double values and provides
 * some methods to retrieve information from it.
 * You can assume the stored 2-D array is not empty and not partial.
 *
 * Step 1: Enter your name for @author and the password for @version
 * @author  Jenny Le
 * @version MyLastExam
 */
public class TwoDArrayDouble
{
    // Step 2: Declare an instance variable of 2-D array of double
    private double[][] list;
    
    // Step 3: Complete the constructor
    /**
     * Constructs an object of TwoDArrayDouble by initializing the
     * instance variable to the parameter.
     * 
     * You can assume the parameter theArray is not empty and not 
     * partial.
     * 
     * @param theArray a 2-D array of double values
     */
    public TwoDArrayDouble(double[][] theArray)
    {
        list = theArray;
    }
    
    // Step 4: Complete method maxRowValue()
    /**
     * Gets the max value of a specified row of the
     * stored 2-D array.
     * 
     * You should use the enhanced for loop.
     * You can take the first element of the row as the 
     * initial value for the max value.
     * 
     * @param rowIndex the index for the specified row 
     *        You can assume the row index is valid
     * @return the max value of the specified row
     */
    public double maxRowValue(int rowIndex)
    {
        double max = Integer.MIN_VALUE;
        for (double d: list[rowIndex])
        {
            if (d > max)
            {
                max = d;
            }
        }
        return max;
    }
    
    // Step 5: Complete method columnCountOfTarget()
    /**
     * Gets the count of elements in a specified column of the
     * stored 2-D array that match a given target value.
     * 
     * @param colIndex the index for the specified column
     *        You can assume the column index is valid
     * @param target the given target value
     * @return number of elements in the specified column 
     *         that match the given target
     */
    public int columnCountOfTarget(int colIndex, double target)
    {
        int count = 0;
        for (int c = 0; c < list.length; c++)
        {
            if (target == list[c][colIndex])
            {
                count++;
            }
        }
        return count;
    }

    // Step 6: Complete method averageOfAllValues()
    /**
     * Gets the average of all values in the stored 2-D array.
     * 
     * You should use nested enhanced for loops.
     * DO NOT calculate the total count of elements
     * within the nested loops.
     * 
     * @return the average of all values in the 2-D array
     */
    public double averageOfAllValues()
    {
        double sum = 0;
        for (double[] row : list)
        {
            for (double d : row)
            {
                sum += d;
            }
        }
        int count = list.length * list[0].length;
        return sum / count;
    }
}
