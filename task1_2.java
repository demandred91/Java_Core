package JavaCore;

import java.util.Arrays;
import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "] = ");
            mas[i] = in.nextInt();
        }
        System.out.print("Initial array: " + Arrays.toString(mas) + "\n");
        for (int j = 1; j < mas.length; j++) {
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    int swap = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = swap;
                }
            }
        }
        System.out.print("Sorted array: " + Arrays.toString(mas));

    }
}
