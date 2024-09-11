public class HeapSort {

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(!(i == largest)) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,8,5,3,6,1};

        int n = arr.length;
        for(int i=n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for(int i=n-1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }

        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}