package bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Unsorted array " + Arrays.toString(array));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubble_sort(array);
        System.out.println("Sorted array " + Arrays.toString(array));
    }
}
