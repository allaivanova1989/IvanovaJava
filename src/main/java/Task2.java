import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Input a name:");
            String name = sc.nextLine();
            if (name.equals("Вячеслав") ) {
                System.out.println("Привет Вячеслав");
            }
            else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
