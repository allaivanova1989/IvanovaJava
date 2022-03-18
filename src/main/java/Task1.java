import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Input a number:");
            int number = sc.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        }
    }
}






