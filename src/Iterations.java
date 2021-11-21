import java.util.logging.Level;
import java.util.logging.Logger;


public class Iterations {
        
    public static final Logger outputLogger = Logger.getLogger(Iterations.class.getName());


    public static void main(String[] args) {
        int[] arr1 = {7, 4, 3, 5, 2, 1, 6, 9, 8, 12};

        printRange(arr1);

    }

    public static void printRange(int[] num){
        outputLogger.log(Level.INFO, "Print a range, stored in an array.");

        for (int i= 0; i <= num.length -1; i++) {
            
            outputLogger.log(Level.INFO, "Current position: {0}", i);
            outputLogger.log(Level.INFO, "Current integer: {0}", num[i]);
        }
    }

    

}
