public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 1, 4, 16, 3, 69, 56, 48, 312, 5 };

        for(int i = 0; i < arr.length - 1; i++) {
            boolean isSwaped =  false;
            for(int j = 0 ; j < arr.length - 1 - i; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = true;
                }
            }
            if(!isSwaped) break;
        }
        
        System.out.println("Sorted arr:");
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}