
/**
 * Write a description of class SimpleCalcRunner here.
 * 
 * @Levi Rutherford
 * @FirstClass
 */
public class SimpleCalcRunner
{
   public static void main(String[] args){
       SimpleCalc sc = new SimpleCalc(5,4);
       System.out.println("The sum is " + sc.add());
       System.out.println("\nThe difference is " + sc.sub());
       System.out.println("\nThe product is " + sc.mult());
       System.out.println("\nThe quotient is " + sc.div());
       if(sc.isGreater() == true)
       {
           System.out.println("\na is greater than b");
       }
       else
       {
           System.out.println("\nb is greater than a");
       }
}
}