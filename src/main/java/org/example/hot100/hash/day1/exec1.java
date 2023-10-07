package org.example.hot100.hash.day1;

import java.util.HashMap;

public class exec1 {


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])){
                return new int[]{i, numMap.get(target - nums[i])};
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
