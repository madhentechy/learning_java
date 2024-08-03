import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args){
            int[] arr = {5,4,3,2,1};
            bubbleSort(arr);

            System.out.println(Arrays.toString(arr));
        }

        static void bubbleSort(int[] arr){

            for(int i = 0; i < arr.length; i++){
                boolean Nswapped = true;
                for(int j = 0; j < arr.length-1-i; j++){
                    if(arr[j] > arr[j+1]){
                       int temp = arr[j];
                       arr[j] = arr[j+1];
                       arr[j+1] = temp;
                       Nswapped = false;
                    }
                }

                if(Nswapped){
                    break;
                }

            }
        }

    }

