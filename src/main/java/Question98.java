import java.util.Stack;

import static java.lang.Long.MIN_VALUE;


public class Question98 {
    /*

    98. 验证二叉搜索树
    给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
    有效 二叉搜索树定义如下：
    节点的左子树只包含 小于 当前节点的数。
    节点的右子树只包含 大于 当前节点的数。
    所有左子树和右子树自身必须也是二叉搜索树。

    输入：root = [2,1,3]
    输出：true
     输入：root = [5,1,4,null,null,3,6]
    输出：false
    解释：根节点的值是 5 ，但是右子节点的值是 4 。
*/
    public boolean isValidBST(TreeNode root) {
     //这个是一个二叉搜索树，有个明显的现象是中序遍历必然是升序序列

         Stack<TreeNode> stack = new Stack<>();
         Long min = MIN_VALUE;
         while(!stack.isEmpty() || root!=null){

             while(root!=null){
                 stack.push(root);
                 root = root.left;
             }
             TreeNode node =stack.pop();
             if((long)node.val > min)
                 min = (long)node.val;
             else
                 return false;
             root = node.right;
         }
        return true;
    }
}
