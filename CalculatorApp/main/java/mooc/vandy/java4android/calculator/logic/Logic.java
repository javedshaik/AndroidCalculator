package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */

    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;


    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        if(operation == 1){
            Add a = new Add(argumentOne, argumentTwo);
            mOut.print(a.toString());
        }
        else if (operation == 2){
            Subtract s = new Subtract(argumentOne, argumentTwo);
                mOut.print(s.toString());
        }
        else if(operation == 3){
            Multiply m = new Multiply(argumentOne, argumentTwo);
                mOut.print(m.toString());
        }
        else {
            Divide d = new Divide(argumentOne, argumentTwo);
            mOut.print(d.toString());
        }
    }
}
