public class MergeSort {
    public static void merge(int []arr,int low,int mid,int high){       
        int left[] = new int[mid-low+1];
        int right[] = new int[high-mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low+i];
        }

        for(int j=0; j < right.length ;j++) {
            right[j] = arr[mid+j+1];
        }

        int i = 0, j = 0, k = low; 
        while(i < mid-low+1 && j < high-mid) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
            
    }
    public static void mergeSort(int []arr,int low,int high){
        if(low < high) {
            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid + 1,high);

            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 4, 16, 3, 69, 56, 48, 312, 5 };
        mergeSort(arr,0,arr.length-1);

        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}