public class HillSort {
    public static void hillSort(int[] arr) {
        int length = arr.length;
        //区间
        int gap = 1;
        while (gap < length) {
            gap = gap * 3 + 1;
        }
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                int tmp = arr[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && arr[j] > tmp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                }
                arr[j + gap] = tmp;
            }
            gap = gap / 3;
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
