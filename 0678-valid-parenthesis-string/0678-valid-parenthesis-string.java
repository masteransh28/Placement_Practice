class Solution {
    public boolean checkValidString(String s) {
        int low = 0,high = 0;
        for(char c:s.toCharArray()){
        if(c=='('){
            low++;high++;
        }
        else if(c==')'){
            if(low>0)low--;
            high--;
        }
        else{
            if(low>0)low--;
            high++;
        }
        if(high<0)return false;
    }
    return low == 0;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna