import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Iterations {
        
    public static final Logger outputLogger = Logger.getLogger(Iterations.class.getName());


    public static void main(String[] args) {
        int[] arr1 = {7, 4, 3, 5, 2, 1, 6, 9, 8, 12};
        Random rand = new Random();


        //printRange(arr1);

        computeFactorial(rand.nextInt(30));

    }

    public static void printRange(int[] num){
        outputLogger.log(Level.INFO, "Print a range, stored in an array.");

        for (int i= 0; i <= num.length -1; i++) {
            
            outputLogger.log(Level.INFO, "Current position: {0}", i);
            outputLogger.log(Level.INFO, "Current integer: {0}", num[i]);
        }
    }

    public static int computeFactorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
            outputLogger.log(Level.INFO, "Current multiplier: {0}", i);
            outputLogger.log(Level.INFO, "Current factorial value: {0}", factorial);
        }

        return factorial;
    }
    

}
