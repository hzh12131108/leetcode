package org.example.hot100.day3;

public class exec42 {

    public int trap(int[] height) {
        int ans = 0;
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        for (int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        for (int i = 1; i < height.length - 1; i++){
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        new exec42().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
}
