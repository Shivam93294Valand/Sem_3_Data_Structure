public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {5,12,4,3,9};
        int n = arr.length;

        for(int gap = n/2; gap >=1; gap /= 2) {
            for(int j = gap; j < n; j++) {
                for(int i = j-gap; i >= 0; i = i-gap) {
                    if(arr[i+gap] > arr[i]) {
                        continue;
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[i+gap];
                        arr[i+gap] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}