public class array_database {
    int[] a;

    public array_database(int[] a) {
        this.a = a;
    }

    public int sum() {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public int min() {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public int max() {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public int avg() {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return (sum / a.length);
    }

    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 2, 6, 3, 1 };
        array_database d = new array_database(a);
        System.out.println("Sum: " + d.sum());
        System.out.println("Min: " + d.min());
        System.out.println("Max: " + d.max());
        System.out.println("Avg: " + d.avg());
    }
}