package org.example.hot100.day4;

import java.util.HashMap;
import java.util.HashSet;

public class exec560 {

    public int subarraySum(int[] nums, int k) {
        int[] sumF = new int[nums.length];
        sumF[0] = nums[0];
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            sumF[i] = sumF[i - 1]+ nums[i];
        }
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < sumF.length; i++) {
            if (temp.containsKey(sumF[i] - k)){
                ans += temp.get(sumF[i] - k);
            }
            if (sumF[i] == k){
                ans ++;
            }
            temp.put(sumF[i], temp.getOrDefault(sumF[i], 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        new exec560().subarraySum(new int[]{1},0 );
    }
}
