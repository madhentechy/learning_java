import java.util.Arrays;

public class InsertionSortFromBack {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,5,6,5,3,2,3};
        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        int len = arr.length-1;
        for(int i = len; i > 0; i--){
            for(int j = i-1; j < len; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int current, int target){
        int temp = arr[current];
        arr[current] = arr[target];
        arr[target] = temp;
    }
}
