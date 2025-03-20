public class Question104 {
    /*

    104. 二叉树的最大深度
    给定一个二叉树 root ，返回其最大深度。
    二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
    输入：root = [3,9,20,null,null,15,7]
    输出：3
    示例 2：

    输入：root = [1,null,2]
    输出：2
     */
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);

    }

}
