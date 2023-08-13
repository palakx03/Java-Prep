public class Array {
    private int[] arr;
    private int count;

    public Array(int length) {
        arr = new int[length];
        count = 0;
    }

    public void insert(int number) {
        if (count == arr.length) {
            // If the array is full, we need to resize it
            int[] newArray = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            arr = newArray;
        }

        arr[count++] = number;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
