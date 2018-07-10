package SelectionSortByStep;

import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();

        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
        bubbleSortByStep(list);
        System.out.println("Beggin sort processing...");
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] < list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed.");
            break;
            }
            System.out.println("List after the "+k+" sort: ");
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]+"\t");
            }
            System.out.println();
        }
    }

}
