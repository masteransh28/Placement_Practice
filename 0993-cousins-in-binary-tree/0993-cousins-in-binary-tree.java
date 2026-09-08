/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean foundX = false,foundY = false;
            TreeNode parentX = null,parentY = null;

            for (int i=0; i<size; i++){
                TreeNode node = queue.poll();

                if (node.left != null){
                    queue.offer(node.left);
                    if (node.left.val == x){
                        foundX = true;
                        parentX = node;
                    }
                    if (node.left.val == y){
                        foundY = true;
                        parentY = node;
                    }
                }

                if (node.right != null){
                    queue.offer(node.right);
                    if (node.right.val == x){
                        foundX = true;
                        parentX = node;
                    }
                    if (node.right.val == y){
                        foundY = true;
                        parentY = node;
                    }
                }
            }
            if (foundX && foundY) {
                return parentX != parentY;
            }
             if (foundX || foundY) {
                return false;
            }
        }
        return false; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna