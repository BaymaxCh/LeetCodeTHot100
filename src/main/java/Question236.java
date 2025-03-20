public class Question236 {
    /*
    236. 二叉树的最近公共祖先
    给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
    百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
    输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    输出：3
    解释：节点 5 和节点 1 的最近公共祖先是节点 3 。
    输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
    输出：5
    解释：节点 5 和节点 4 的最近公共祖先是节点 5 。因为根据定义最近公共祖先节点可以为节点本身。
    示例 3：
    输入：root = [1,2], p = 1, q = 2
    输出：1
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //递归遍历，如果root==q/p 说明最近的就是它直接返回
        /*
        如果root==null 返回 走到死了
        如果root== q/p 返回 这个是答案
        如果root不是以上情况，需要推测root.left 和root.right 的情况 ，此时有几种可能
        1、left和right都是空的，说明左右都找不到 返回null
        2、left是空的right不是，说明都在right/left里面 那么返回right/left
        3、left和right都不是空的，说明pq在左右各占一边，此时root就是最近的了直接返回
         */
        if(root == null ||root==p || root==q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        //梳理结果
        if(left==null && right==null)
            return null;
        else if(left ==null && right!=null)
            return right;
        else if(left!=null && right==null)
            return left;
        else
            return root;
    }
}
