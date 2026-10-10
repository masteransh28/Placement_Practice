class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int balance = 0;
        int i = 0;
        
        while (i < s.length()) {
            char c = s.charAt(i);
            
            if (c == '(') {
                balance += 2;
                if (balance % 2 == 1) {
                    insertions++;
                    balance--;
                }
            } else {
                balance--;
                if (balance < 0) {
                    insertions++;
                    balance += 2;
                }
            }
            i++;
        }
        
        return insertions + balance;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna