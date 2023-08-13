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
    public void removeAt(int index){
        // Validat the index
        if(index<0 || index>=count)
            throw new IllegalArgumentException();
        
        //Shift items to the left i.e filling the place of the removed item

        for(int i = index; i<count;i++){
            arr[i]=arr[i+1];
        
        count--;
        }
    }
    public int indexOf(int target){
        for(int i=0;i<count;i++){
            if(arr[i]==target){
                return i;
            }
        }return -1;
    }
}
