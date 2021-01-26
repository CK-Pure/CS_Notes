public class SelectSort {
    public static void selectSort(int[] arr){
        //O(n²)
        for( int i = 0;i < arr.length ; i++ ){
            //最小元素的下标
            int min = i;
            for(int j = i + 1;j < arr.length ; j++ ){
                if(arr[j] < arr[min]){
                    //找最小值
                    min = j;
                }
            }
            //交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data ={2,4,3,7,11,1,19,5};
        selectSort(data);
        for (int datum : data) {
            System.out.print(datum);
            System.out.print(" ");
        }
    }
}
