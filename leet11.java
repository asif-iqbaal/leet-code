

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int right = height.length - 1 ;
        int left = 0;

        while(left<right){
            int currentArea = Math.min(height[left],height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right --;
            }
        }
        return maxArea;
    }
}
public class leet11{
    public static void main(String[] args) {
      int[] arr = {1,6,8,9,3,7,15,8};
      Solution area = new Solution();
     int Area = area.maxArea(arr);
     System.out.println("Area is " + Area);
    }
}