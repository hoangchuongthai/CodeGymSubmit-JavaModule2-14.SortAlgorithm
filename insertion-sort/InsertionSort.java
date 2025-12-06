public class InsertionSort {
    public static void insertionSortWithSteps(int[] arr) {
        System.out.println("Mang ban dau:");
        printArray(arr);
        System.out.println();

        int step = 1;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // phần tử cần chèn
            int j = i - 1;

            System.out.println("Buoc " + step + ": chen phan tu arr[" + i + "] = " + key);

            // Dời các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

                System.out.print("  Dang doi cac phan tu: ");
                printArray(arr);
            }

            // Chèn key vào vị trí đúng
            arr[j + 1] = key;

            System.out.print("  Sau khi chen " + key + ": ");
            printArray(arr);
            System.out.println();

            step++;
        }

        System.out.println("Mang sau khi sap xep chen:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Co the thay doi mang nay tu ban phim neu muon
        int[] arr = {5, 2, 9, 1, 5, 6};

        insertionSortWithSteps(arr);
    }
}
