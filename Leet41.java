import java.util.Arrays;

public class Leet41 {
    public static void main(String[] args){
        int[] arr = {1};
        cyclic(arr);
        int num = missingnum(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(num);
    }

    static  void  cyclic(int[] arr){
        int len = arr.length - 1;
        int i = 0;
        while(i <= len) {
            if(arr[i]>len){
                i++;
            }
            else {
                if (arr[i]>0 && arr[i]<=len && arr[i] != arr[arr[i]-1]) {
                    swap(arr, i, arr[i]-1);
                } else {
                    i++;
                }
            }
        }
    }

    static void swap(int[] arr,int current, int target){
        int temp = arr[current];
        arr[current] = arr[target];
        arr[target] = temp;
    }

    static int missingnum(int[] arr){
        int len = arr.length-1;
        for(int i = 0; i <= len; i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

}
