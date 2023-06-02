import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int size = in.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + i + " число: ");
            num[i] = in.nextInt();
        }
        for (int j : num) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
