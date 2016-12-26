package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here
    public int mArgumentOne;
    public int mArgumentTwo;

    public Multiply(int argumentOne, int argumentTwo){
        this.mArgumentOne = argumentOne;
        this.mArgumentTwo = argumentTwo;
    }
    public String toString(){
        return String.valueOf(mArgumentOne * mArgumentTwo);
    }
}
