import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; 
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                
              
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                   
                    return sum;
                }
            }
        }
        
        return closestSum;
    }
}

public class leet16 {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        Solution s = new Solution();
        int result = s.threeSumClosest(arr, 1);
        System.out.println(result); 
    }
}
