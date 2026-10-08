class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int depth=0; 
        for(char c : s.toCharArray()){
            if(c == '('){
                if(depth>0)ans.append(c);
                depth++;
            }
            else{
                depth--;
                if(depth>0)ans.append(c);
            }
        }
        return ans.toString();  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna