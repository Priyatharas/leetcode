/*class Solution{
    public int [] productExceptSelf(int[]nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
        {
            int product = 1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    product = product * nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }
}*/
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 1;

        // left product
        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left = left * nums[i];
        }

        int right = 1;

        // right product
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }
}