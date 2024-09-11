public class CountSort {
    public static void main(String[] args) {
        int arr[] = {1,3,0,4,0,3,1,2,5};
        // find max element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        } 

        int Count[] = new int[max + 1];
        // intionlize with 0
        for (int i = 0; i < Count.length; i++) {
            Count[i] = 0;
        } 
        // count array
        for (int i = 0; i < arr.length; i++) {
            Count[arr[i]]++;
        } 
        // create count array to frequncy array
        for(int i = 1; i < Count.length; i++) {
            Count[i] += Count[i-1];
        }

        // create ans array
        int ans[] = new int[arr.length];
        // fill the ans array
        for(int i= arr.length - 1; i>=0; i--) {
            ans[Count[arr[i]] - 1] = arr[i];
            Count[arr[i]]--;
        }

        System.out.println("Sorted arr:");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}