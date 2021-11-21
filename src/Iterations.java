import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Iterations {        
    public static final Logger outputLogger = Logger.getLogger(Iterations.class.getName());

    public static void main(String[] args) {
        int[] arr1 = {7, 4, 3, 5, 2, 1, 6, 9, 8, 12};
        Random rand = new Random();

        //printRange(arr1);
        //computeFactorial(rand.nextInt(30));

        //drawTriangle(8);
        //drawTriangle2(8);
        drawWideTriangle(4);
        System.out.println();
        drawOtherTriangle(4);
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

    public static void drawTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void drawTriangle2(int num) {
        for (int i = num; i >= 0; i--) {
            for (int j = num; j > i; j--) {
                System.out.print("*   ");
            }
            System.out.println(" ");
        }
    }

    public static void drawWideTriangle(int num) {
        for (int i = num; i >= 1; i--) {
            
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }


            System.out.println("");
        }
 
    }

    public static void drawOtherTriangle(int num) {
        
        for (int i = 1; i <= num; i++) {

            
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
