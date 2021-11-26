
public class BitwiseOperations {

    
    public static void main(String[] args) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        for(int i = 0; i < alphabet.length; i++) {
            System.out.print("Letter ");
            System.out.print(Character.toUpperCase(alphabet[i]));
            
            System.out.print("  Binary Representation ");
            System.out.println(Integer.toBinaryString( Character.toUpperCase(alphabet[i])));

            System.out.print("Letter ");
            System.out.print(alphabet[i]);
            
            System.out.print("  Binary Representation ");
            System.out.println(Integer.toBinaryString(alphabet[i]));

        }

        String[] binString = {};

        System.out.println(Integer.toBinaryString(bitwiseAND(4, 9)));
        System.out.println(Integer.toBinaryString(bitwiseOR(4, 9)));
        System.out.println(Integer.toBinaryString(bitwiseXOR(4, 9)));
        System.out.println(Integer.toBinaryString(bitwiseNOT(4)));
        System.out.println(Integer.toBinaryString(leftShift(4, 8)));
        System.out.println(Integer.toBinaryString(rightShift(-10, 5)));
        System.out.println(Integer.toBinaryString(unsignedRightShift(-10, 5)));
        //Binary Shifting can be used for steganography.         
    }

    public static int bitwiseAND(int n, int m) {
        System.out.println("Bitwise AND");
        return (n & m);
    }

    public static int bitwiseOR(int n, int m) {
        System.out.println("Bitwise OR");
        return (n | m);
    }
    
    public static int bitwiseXOR(int n, int m) {
        System.out.println("Bitwise XOR");
        return (n ^ m);
    }

    public static int bitwiseNOT(int n) {
        System.out.println("Bitwise NOT");
        return n;
    }

    public static int leftShift(int n, int m) {
        System.out.println("Left Shift");
        return n << m;
    }

    public static int rightShift(int n, int m) {
        System.out.println("Right Shift");
        return n >> m;
    }

    public static int unsignedRightShift(int n, int m) {
        System.out.println("Unsigned right Shift");
        return n >>> m;
    }
}