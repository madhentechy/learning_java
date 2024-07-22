public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,10,11,53,67,89};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr,target,start,end));
    }

    static int binarySearch(int[] arr, int target, int start, int end){


        while(start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return start;
    }
}
