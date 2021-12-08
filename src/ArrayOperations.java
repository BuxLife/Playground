import java.util.Arrays;

public class ArrayOperations{
    public static void main(String[] args) {
        String[] shopping = {"bread", "butter", "cheese"};
        String[] shoppingList;

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] temperatures = new int[365];
        Arrays.fill(temperatures, 0);

        temperatures[42] = 12;
        temperatures[12] = 155;
        temperatures[14] = -41;
        temperatures[45] = -31;
        temperatures[17] = -12;

        // System.out.println(Arrays.toString(temperatures));
        // System.out.println(getNegativeDays(temperatures));
        
        printArray(numbers);
        printArray(reverseArray(numbers));
    } 

    public static void printArray(int[] arr) {
        for (int val: arr) {
            System.out.println(val);
        }
    }
    
    public static int getNegativeDays(int[] temps) {
        int days = 0;

        for (int temp : temps) { 
            if (temp < 0) {
                days++;
            }
        }
        return days; 
    }

    public static int[] reverseArray(int[] arr) {

        int[] arr2 = new int[arr.length];
        int counter = arr.length; //Going to transfer units to arr2. 

        for (int i = 0; i < arr.length; i++) {
            arr2[counter-1] = arr[i];    
            counter--;
        }

        return arr2;
    }
}