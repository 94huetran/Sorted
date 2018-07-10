package InsertionSort;

public class InsertionSort {
    static int[] list = {1, 2, 3, 4, 23, 0, 12, 56, 17};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            for (int j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                list[j+1] = list[j];
                list[j] = currentElement;
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("List after insert: ");
        for (int k = 0; k < list.length; k++) {
            System.out.println(list[k]);
        }
    }
}
