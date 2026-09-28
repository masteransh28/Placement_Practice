class Solution {
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq= new  PriorityQueue<>();
        for(int a : nums){
            pq.add(a);
            if(pq.size()>k) pq.remove();
        }
       return pq.peek(); 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna