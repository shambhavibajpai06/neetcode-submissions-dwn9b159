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
    //Pick root from preorder, split using inorder, and recursively repeat.
    int pre_idx = 0;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] pre, int[] in) {
        int n = in.length;
        for(int i = 0; i < n; i++){
            map.put(in[i],i);
        }
        return build(pre, 0, n-1);
    }

    private TreeNode build(int[] pre, int s, int e){
        if(s > e) return null; //No elements

        int rootVal = pre[pre_idx++];
        TreeNode root = new TreeNode(rootVal);

        int i = map.get(rootVal); //Search root in inorder

        root.left = build(pre, s, i-1);
        root.right = build(pre, i+1, e);
        return root;
    }
}
