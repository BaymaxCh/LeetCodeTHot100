import java.util.Stack;

public class Question230 {
    /*
    230. 二叉搜索树中第 K 小的元素
     给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
      输入：root = [3,1,4,null,2], k = 1
输出：1
     */
    public int kthSmallest(TreeNode root, int k) {
        //第k小 就是中序遍历第k个数字
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            k--;
            if(k==0)
                return node.val;
            root = node.right;
        }

        return -1;
    }
}
