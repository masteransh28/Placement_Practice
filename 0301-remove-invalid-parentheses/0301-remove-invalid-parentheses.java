class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans=new ArrayList<>();
        int[] counts=getLeftAndRightCounts(s);
        dfs(s,0,counts[0],counts[1],ans,new HashSet<>());
        return ans;
    }
    private int[] getLeftAndRightCounts(String s){
        int l=0,r=0;
        for(char c : s.toCharArray()){
            if(c == '(')l++;
            else if(c == ')'){
                if(l == 0)r++;
                else l--;
            }
        }
        return new int[]{l, r};
    }
    private void dfs(String s,int start,int l,int r,List<String> ans,Set<String> visited){
        if(l == 0&&r == 0&&isValid(s)) {
            ans.add(s);
            return;
        }
        for(int i=start;i<s.length();i++) {
            if(i>start&&s.charAt(i)==s.charAt(i - 1))continue;
            if(l>0&&s.charAt(i)=='('){
                String next=s.substring(0, i)+s.substring(i + 1);
                if(visited.add(next)) dfs(next, i, l - 1, r, ans, visited);
            }
            if(r>0&&s.charAt(i)==')'){
                String next=s.substring(0, i) + s.substring(i + 1);
                if(visited.add(next)) dfs(next, i, l, r - 1, ans, visited);
            }
        }
    }

    private boolean isValid(String s){
        int opened=0;
        for (char c : s.toCharArray()) {
            if (c == '(') opened++;
            else if (c == ')'){
                opened--;
                if(opened < 0) return false;
            }
        }
        return opened==0;
    }
}

        

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna