import java.util.Map;

public class Question543 {
    /*
    543. 二叉树的直径
     给你一棵二叉树的根节点，返回该树的 直径 。
    二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
    两节点之间路径的 长度 由它们之间边数表示。
    输入：root = [1,2,3,4,5]
    输出：3
    解释：3 ，取路径 [4,2,1,3] 或 [5,2,1,3] 的长度。
    示例 2：
    输入：root = [1,2]
    输出：1

    提示：
    树中节点数目在范围 [1, 104] 内
    -100 <= Node.val <= 100
     */
     int MAX_LENGTH = 0;
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        MAX_LENGTH = Math.max(MAX_LENGTH,left+right);
        return Math.max(left+1,right+1);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        //遍历所有节点，把它作为最长直径的二叉树的根节点，获取它的最长直径：左子节点的深度+右子节点的深度

       maxDepth(root);
       return MAX_LENGTH;
    }
}
