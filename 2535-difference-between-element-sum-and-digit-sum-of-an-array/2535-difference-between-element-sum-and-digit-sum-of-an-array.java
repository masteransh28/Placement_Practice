class Solution {
    public int differenceOfSum(int[] nums) {
        int es=0;int ds=0;
        for(int i=0;i<nums.length;i++){
            es+=nums[i];
            int temp=nums[i];
            while(temp!=0){
                int r=temp%10;
                ds+=r;
                temp/=10;
            }
        }
        return Math.abs(es-ds);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna