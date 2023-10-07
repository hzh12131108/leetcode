package org.example.hot100.hash.day1;

import java.util.HashMap;


/**
 * 只保存边界的范围值就行了，我之前的做法是保存cur的+-1的范围值
 */
public class exec3 {

    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!res.containsKey(nums[i])){
                int left = res.getOrDefault(nums[i] - 1, 0);
                int right = res.getOrDefault(nums[i] + 1, 0);
                int tmp = left + right + 1;
                if (res.containsKey(nums[i] - left)){
                    res.put(nums[i] - left, tmp);
                }
                if (res.containsKey(nums[i] + right)){
                    res.put(nums[i] + right, tmp);
                }
                res.put(nums[i], tmp);
                ans = Math.max(ans, tmp);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new exec3().longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
    }
}
