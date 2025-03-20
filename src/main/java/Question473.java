import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Question473 {
    /*
    437. 路径总和 III
    给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。

    路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
    输入：root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
    输出：3
    解释：和等于 8 的路径有 3 条，如图所示。
    示例 2：

    输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
    输出：3

     */
    int paths = 0;
    //先写第二层递归
    public void pathSum_help(TreeNode root,long targetSum,long tmp){
        if(root==null)
            return ;
        if(root.val+tmp==targetSum){
            paths++ ;
        }
        pathSum_help(root.left,targetSum,tmp+root.val);
        pathSum_help(root.right,targetSum,tmp+root.val);

    }
    public int pathSum(TreeNode root, int targetSum) {
        //不需要从根节点开始，那就从0开始递归遍历，当前的节点往左走能不能走到targetSum，能的话路数加一，不能的话继续往下左/右边 一直走到底
        //两层递归，第一层递归是递归所有节点，第二层是从当前节点当成跟节点去递归
        //前序遍历
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()){

            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            pathSum_help(node,(long)targetSum,(long)0);
            root = node.right;
        }
        return paths;

    }
//上面的方法易于理解但是不够优雅，用前缀和的方式可以降低复杂度 但是我不会。。。。



}
