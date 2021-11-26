import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.w3c.dom.ranges.Range;

public class Iterations {        
    public static final Logger outputLogger = Logger.getLogger(Iterations.class.getName());

    public static void main(String[] args) {
        int[] arr1 = {7, 4, 3, 5, 2, 1, 6, 9, 8, 12};
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Random rand = new Random();

        printRange(arr1);
        computeFactorial(rand.nextInt(30));

        drawTriangle(8);
        drawTriangle2(8);
        drawWideTriangle(4);
        drawOtherTriangle(4);

        countDigits(300);
        doCountDigits(300);
        printFibonacci(2000);
        printCollection(days);

    }

    public static void printRange(int[] num){
        outputLogger.log(Level.INFO, "Print a range, stored in an array.");

        for (int i= 0; i <= num.length -1; i++) {
            outputLogger.log(Level.INFO, "Current position: {0}", i);
            outputLogger.log(Level.INFO, "Current integer: {0}", num[i]);
        }
    }

    public static void printRange2(int[] input) {
            for (int i: input) {
                System.out.println(i);
            }
    }

    public static void printReverseCollection(String[] input) {
        int len = input.length;

        for (int i = 0; i < len; i++ ) {
            System.out.println(input[i]);
        }
    }

    public static void printCollection(String[] input) {
        int len = input.length;

        for (int i = 0; i < len; i++ ) {
            System.out.println(input[i]);
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
    
    public static void countDigits(int num) {
        int result = 0; 
        while(num > 0) {
            num /= 10;
            result += 1;
        }

        System.out.println("Result: "+ result);
    }

    public static void doCountDigits(int num) {
        int result = 0; 
        do {
            num /= 10;
            result += 1;
        }while (num > 0);
        System.out.println("Result: "+ result);
    }

    public static void printFibonacci(int num) {
        int a = 0;
        int b = 1;

        while( a <= num) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        
    }

    public int binaryGap(int num) {

        while (num > 0 && (num % 2 == 0)){
           // While N is not 0, and N is divisible.
            num >>=1;   //Shift bits to the right. 
        }
        num >>= 1;

        // This initial loop allows us to forego a flag for 0 or 1 bits, 
        // and skip all trailing zeroes 

        int gap = 0;
        int trailingZeros = 0;
        
        while (num > 0) {
            if ((num % 2) == 0) {
                trailingZeros++;
            } else {
                gap = StrictMath.max(gap, trailingZeros);
                trailingZeros = 0;
            }
            num >>=1;
        }
        return gap;
    }
    
    public int[] rotateArrayRight(int[] A, int K) {

        //for (int i = 0; i < A.length; i++) {
            //System.out.print(A[i] + " ");
        //}

        //Rotate the array by K times
        for (int i = 0; i < K; i++) {

            //Hold last element of array (length -1) 
            int last = A[A.length-1]; 

            for (int j = A.length-1; j > 0; j--) {
                //System.out.println("Original Value: " + A[j]);
                //System.out.println("New Value: " + A[j-1]);
                
                //Shifting the array
                A[j] = A[j-1];
                
            }
            //Add prev last element to start of array. 
            A[0] = last; 
        }
        
        //for (int i = 0; i < A.length; i++) {
            //System.out.print(A[i] + " ");
        //}
        return A;
    }

    public static boolean validParentheses(String parens) {
    String opening = "(";
    String close = ")";
    int prev = 0; 
    boolean result = false; 
    
    
    for (int i = 0; i < parens.length(); i++) {
      char ch = parens.charAt(i);

      if (ch == '(') {
        if (prev == 0) {
          prev = 1; 
          result = true;
        }
      } else if (ch == ')') {
        if (prev == 1){
          prev = 2;
          result = true;
        } else {
          result = false; 
        }
      } 
    }
    if (prev == 0) {result = true;}
    return result; 
  }

}
