class Leet33{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1};
        System.out.println(sol.search(nums,1));
    }
}




class Solution {
    public int search(int[] nums, int target) {

        int pivot = pivot(nums);

        if(pivot == -1){
            return binary(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target < nums[0]){
            return binary(nums,target,pivot+1,nums.length-1);
        }
        if(target >= nums[0]){
            return binary(nums,target,0,pivot-1);
        }

        return -1;

    }

    public int binary(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start+(end - start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }

        }
        return -1;
    }

    public int pivot(int[] name){
        int start = 0;
        int end = name.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if (mid < end && name[mid]>name[mid+1]){
                return mid;
            }
            else if(mid > start && name[mid]<name[mid-1]){
                return mid-1;
            }
            else if(name[mid] < name[start]){
                end = mid - 1;
            }
            else if(name[mid] > name[start]){
                start = mid + 1;
            }

        }
        return -1;
    }

}