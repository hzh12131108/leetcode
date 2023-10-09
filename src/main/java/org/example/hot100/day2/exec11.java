package org.example.hot100.day2;

/**
 * 有一点贪心的思路，既然要求面积最大，那么长和宽都要尽量最大，先保证长最大，然后一步步确保宽的长度就行了，使用双指针实现
 */
public class exec11 {

        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int maxArea = 0;
            while(left < right){
                int area = (right - left) * Math.min(height[left], height[right]);
                maxArea = Math.max(area, maxArea);
                if (height[left] < height[right]){
                    left++;
                }else {
                    right--;
                }
            }
            return maxArea;
        }
        public static void main(String[] args) {
            new exec11().maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        }

}
