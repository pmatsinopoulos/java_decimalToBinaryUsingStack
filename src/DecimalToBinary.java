import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    /**
     * Takes an integer and returns its binary representation.
     * It uses a Stack structure to print the digits.
     * 
     */
    public static String toBinary(int integer) {
        Stack<Integer> stack = new Stack<Integer>();
        
        while (integer > 0) {
            int remainder = integer % 2;
            stack.push(remainder);
            integer = integer / 2;
        }
        
        String result = "";
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.print("Give me an integer and I will give you back its binary representation: ");
        
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int integer = scanner.nextInt();
            System.out.printf("Binary representation of %d: is %s\n", integer, toBinary(integer));
        }
        
        scanner.close();
    }
}
