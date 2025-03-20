import java.util.*;

public class Question94 {
    /*
    94. 二叉树的中序遍历
    给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
    输入：root = [1,null,2,3]
    输出：[1,3,2]
    示例 2：

    输入：root = []
    输出：[]
    示例 3：

    输入：root = [1]
    输出：[1]
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        //中序遍历 左根右 先入根 push左，push到没有 出栈 找右，右有没有左子节点，有的话继续遍历，一直到没有
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        while(root!=null||!stack.isEmpty()) {

            while (root!= null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }

        return list;
    }


}
