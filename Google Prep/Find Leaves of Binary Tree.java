/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param root: the root of binary tree
     * @return: collect and remove all leaves
     */
    public List<List<Integer>> findLeaves(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        
        // while(root!=null){
            // recur(root.left, res, new ArrayList<>(), false);
            // recur(root.right, res, new ArrayList<>(), false);
        // }

        recur(root, res);
        return res;
    }

    public int recur(TreeNode root, List<List<Integer>> res){
        if(root == null){
            // res.add(new ArrayList<Integer>(temp));
            return -1;
        }
        
        int leftLevel = recur(root.left, res);
        
        int rightLevel = recur(root.right, res);

        int currentLevel = Math.max(leftLevel, rightLevel) + 1;
        
        addValue(res, currentLevel, root.val);
       
        return currentLevel;

    }

    public void addValue(List<List<Integer>> res, int currentLevel, int val){
        
        if(currentLevel == res.size()){
            List<Integer> list = new ArrayList<Integer>();
            res.add(list);
        }

        res.get(currentLevel).add(val);
    }
}
