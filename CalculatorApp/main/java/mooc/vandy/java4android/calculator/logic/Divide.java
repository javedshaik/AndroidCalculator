package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    public int mArgumentOne = 0;
    public int mArgumentTwo = 0;

    public Divide(int argumentOne, int argumentTwo){
        this.mArgumentOne = argumentOne;
        this.mArgumentTwo = argumentTwo;
    }
    public String toString(){
        return String.valueOf((mArgumentOne / mArgumentTwo) + "R:" + String.valueOf(mArgumentOne % mArgumentTwo));

    }
}
