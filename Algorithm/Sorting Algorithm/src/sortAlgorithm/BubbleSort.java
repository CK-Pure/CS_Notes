package sortAlgorithm;

import java.security.PublicKey;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        //冒泡轮数
        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            //依次比较
            //o(n²)
            for(int j = 0;j < arr.length - 1 - i ; j++){
                int temp = 0;
                //确定按照从小到大还是从大到小排序
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void optimizeBubbleSort(int[] arr){
        for( int i = 0;i < arr.length - 1 ; i++ ){
            boolean isSort = true;
            for( int j = 0;j < arr.length - 1 - i ; j++ ){
                int temp = 0;
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] data ={2,4,3,7,11,1,19,5};
        bubbleSort(data);
        for (int datum : data) {
            System.out.print(datum);
            System.out.print(" ");
        }
    }
}
