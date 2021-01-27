public class InsertionSort {
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int value = arr[i];
            int j = 0;//插入的位置
            for (j = i-1; j >= 0; j--) {
                //改变排序大小顺序
                if (arr[j] > value) {
                    arr[j+1] = arr[j];//移动数据
                } else {
                    break;
                }
            }
            arr[j+1] = value; //插入数据
        }
    }

    public static void main(String[] args) {
        int[] data ={2,4,3,7,11,1,19,5};
        insertSort(data);
        for (int datum : data) {
            System.out.print(datum);
            System.out.print(" ");
        }
    }
}
