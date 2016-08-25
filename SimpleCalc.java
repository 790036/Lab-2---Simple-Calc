
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int firstNumber;
    private int secondNumber;
    
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(int a, int b)
    {
        // initialise instance variables
        firstNumber = a;
        secondNumber = b;
    }

    
    public int add()
    {
        // put your code here
        return firstNumber + secondNumber;
    }
    public int div()
    {
        return firstNumber / secondNumber;
        
    }
    public int mult()
    {
        return firstNumber * secondNumber;
    }
    public int sub()
    {
        return firstNumber - secondNumber;
    }
    public boolean isGreater()
    {
        if(firstNumber > secondNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

