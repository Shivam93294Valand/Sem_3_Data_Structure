public class QuickSort {
    public static int partition(int arr[],int low,int high) {
        int pivot = arr[high];
        int i = low - 1; 

        for(int j=low;j< high;j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i + 1;
    }

    public static void quickSort(int arr[],int low, int high) {
        if(low < high) {
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 16, 3, 69, 56, 48, 312, 5 };
        quickSort(arr,0,arr.length-1);

        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}