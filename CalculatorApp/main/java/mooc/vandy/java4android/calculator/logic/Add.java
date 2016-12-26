package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO -- start your code here
    public int mArgumentOne = 0;
    public int mArgumentTwo = 0;

    public Add(int argumentOne, int argumentTwo){
        this.mArgumentOne = argumentOne;
        this.mArgumentTwo = argumentTwo;
    }
    public String toString(){
        return String.valueOf(mArgumentOne + mArgumentTwo);
    }

}
