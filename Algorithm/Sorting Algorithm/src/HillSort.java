public class HillSort {
    public static void hillSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] data ={2,4,3,7,11,1,19,5};
        hillSort(data);
        for (int datum : data) {
            System.out.print(datum);
            System.out.print(" ");
        }
    }
}
