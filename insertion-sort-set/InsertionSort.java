public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            // Dời các phần tử lớn hơn key sang phải
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào đúng vị trí
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        insertionSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
