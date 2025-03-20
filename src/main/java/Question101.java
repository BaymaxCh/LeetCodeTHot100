public class Question101 {
    /*
    101. 对称二叉树
    给你一个二叉树的根节点 root ， 检查它是否轴对称。
    输入：root = [1,2,2,3,4,4,3]
    输出：true
    输入：root = [1,2,2,null,3,null,3]
    输出：false

     */

    public boolean isSymmetric_tool(TreeNode left,TreeNode right) {
        if(left==null && right==null)
            return true;
        else if(left==null || right==null)
            return false;
        else
            return left.val == right.val && isSymmetric_tool(left.left,right.right) && isSymmetric_tool(left.right,right.left);

    }
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric_tool(root,root);
    }
}
