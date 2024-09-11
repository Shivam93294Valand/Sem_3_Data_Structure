import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void bucketSort(float []arr, int n) {
        if(n <= 0) return;

        ArrayList<Float> []buckets = new ArrayList[n];

        for(int i=0; i < arr.length; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        for(int i=0; i < arr.length; i++) {
            int bucketIndex = (int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }

        for(int i=0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        float arr[] = { 0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f };
        bucketSort(arr, arr.length);

        System.out.println("Sorted arr:");
        for (float i : arr) {
            System.out.print(i + " ");
        }
    }
}