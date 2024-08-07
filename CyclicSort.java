import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {3,2,1,5,4,6};
        cyclic(arr);

        System.out.println(Arrays.toString(arr));
    }

  // IF ARRAY STARTS FORM 1;
  // DOESN'T WORK FOR DUPLICATES;
  /*  static  void  cyclic(int[] arr){
        int len = arr.length - 1;
        int i = 0;
        while(i <= len) {
            if (arr[i] != i + 1) // --> for this condition it will get stuck in a loop for the above array
                                 // HENCE ALWAYS USE   if(arr[i] != arr[arr[i]-1]   this will handle the duplicates
            {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }*/

    //WORKS FOR DUPLICATES;
      static  void  cyclic(int[] arr){
        int len = arr.length - 1;
        int i = 0;
        while(i <= len) {
            if (arr[i] != arr[arr[i]- 1]){ // HENCE ALWAYS USE if(arr[i] != arr[arr[i]-1])   this will handle the duplicates
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    //IF ARRAY STARTS FROM 0;
    // DOESN'T WORK FOR DUPLICATES;
    /*static  void  cyclic(int[] arr){
        int len = arr.length - 1;
        int i = 0;
        while(i <= len) {
            if (arr[i] != i) // --> for this condition it will get stuck in a loop for the above array
            {                // HENCE ALWAYS USE   if(arr[i] != arr[arr[i]]   this will handle the duplicates
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }*/

    //WORKS FOR DUPLICATES;
    /*static  void  cyclic(int[] arr){
        int len = arr.length - 1;
        int i = 0;
        while(i <= len) {
            if (arr[i] != arr[arr[i]]){ // HENCE ALWAYS USE if(arr[i] != arr[arr[i]-1])   this will handle the duplicates
                swap(arr, i, arr[i] );
            } else {
                i++;
            }
        }
    }*/

    static void swap(int[] arr,int current, int target){
        int temp = arr[current];
        arr[current] = arr[target];
        arr[target] = temp;
    }

}
