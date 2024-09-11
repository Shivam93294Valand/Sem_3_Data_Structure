public class InsetionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 16, 3, 69, 56, 48, 312, 5 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            if(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            } 
            arr[j+1] = key;
        }

        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
