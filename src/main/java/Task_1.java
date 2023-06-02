import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        if (num > 7) {
            System.out.println("Привет!");
        }
    }
}
