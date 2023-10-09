package org.example.hot100.day2;

/**
 * 双指针，一个找0，一个找非零
 */
public class exec283 {

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                continue;
            }
            int j = i;
            while (j < nums.length && nums[j] == 0) j++;
            if (j >= nums.length) break;
            nums[i] = nums[j];
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        new exec283().moveZeroes(new int[]{1,0,1});
    }
}
