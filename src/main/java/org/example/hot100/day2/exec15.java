package org.example.hot100.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exec15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) continue;
            if (i >= nums.length - 2 || nums[i] > 0) break;
            int left = i + 1;
            int right = nums.length - 1;
            int target = - nums[i];
            while(left < right){
                if (nums[left] + nums[right] > target) right--;
                else if (nums[left] + nums[right] < target) left++;
                else {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    ans.add(subList);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new exec15().threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
