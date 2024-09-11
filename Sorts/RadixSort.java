public class RadixSort {

    public static void countSort(int arr[], int n, int place) {
        int Count[] = new int[10];
        // intionlize with 0
        for (int i = 0; i < Count.length; i++) {
            Count[i] = 0;
        } 
        // count array 
        for (int i = 0; i < arr.length; i++) {
            Count[(arr[i]/place)%10]++;
        } 
        // create count array to frequncy array
        for(int i = 1; i < Count.length; i++) {
            Count[i] += Count[i-1];
        }

        // create ans array
        int ans[] = new int[arr.length];
        // fill the ans array
        for(int i= arr.length - 1; i>=0; i--) {
            ans[Count[(arr[i]/place)%10] - 1] = arr[i];
            Count[(arr[i]/place)%10]--;
        }

        // overRide the ans array to arr array
        for(int i=0; i < n ; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {451,2,13,98,234};
        
        // find max element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        // implement place
        for(int place=1; max/place > 0; place = place*10) {
            // call count sort
            countSort(arr, arr.length ,place);
        }

        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}