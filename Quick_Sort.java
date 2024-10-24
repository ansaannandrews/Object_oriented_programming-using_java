package oop;
import java.util.Scanner;

public class Quick_Sort {

    static void swap(int a, int b, int[] A) {
        int t = A[a];
        A[a] = A[b];
        A[b] = t;
    }

    static int part(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (A[j] < pivot) {
                i++;
                swap(i, j, A);
            }
        }
        swap(i + 1, high, A);
        return i + 1;
    }

    static void quick(int[] A, int low, int high) {
        if (low < high) {
            int pivotIndex = part(A, low, high);
            quick(A, low, pivotIndex - 1);
            quick(A, pivotIndex + 1, high);
        }
    }

    static void printArray(int[] A) {
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int x = scanner.nextInt();

        int[] A = new int[x];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < x; i++) {
            A[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        printArray(A);

        quick(A, 0, x - 1);

        System.out.println("Sorted array:");
        printArray(A);

        scanner.close();
    }
}

