package October;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        rotate(nums,3);
        for(int x:nums){
            System.out.println(x);
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        //        [1,2,3,4] [5,6,7] - Need to Swap
        //                        3

        //        7 1 2 3 4 5 6
        //        6 7 1 2 3 4 5
        //        5 6 7 1 2 3 4

        int fromLastIndex = nums.length - k;
        int startIndex = 0;

        for(;fromLastIndex<nums.length;fromLastIndex++){
            int storeElement = nums[fromLastIndex];
            int pointerStart = fromLastIndex;
            while(pointerStart > startIndex){
                nums[pointerStart] = nums[pointerStart-1];
                pointerStart --;
            }
            nums[startIndex] = storeElement;
            startIndex++;
        }

    }

}
