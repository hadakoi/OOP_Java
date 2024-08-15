import java.util.Scanner;

public class Max{
    public static int max(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int y = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int z = scanner.nextInt();

        int result = max(x, y, z);
        System.out.println("The largest number is: " + result);
        
        scanner.close();
    }
}

