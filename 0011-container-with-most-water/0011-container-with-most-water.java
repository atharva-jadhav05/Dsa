class Solution {
    public int maxArea(int[] height) {
        int maxArea = -1;
        int width = 0;
        int start = 0;
        int end = height.length - 1;

        for (int i = 0; i < height.length; i++) {

            int area = 0;
            width = end - start;

            if (height[start] < height[end]) {

                area = height[start] * width;
                start++;

            } else {
                area = height[end] * width;
                end--;
            }

            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}