import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question114 {
    /*
    114. 二叉树展开为链表
    给你二叉树的根结点 root ，请你将它展开为一个单链表：
    展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
    展开后的单链表应该与二叉树 先序遍历 顺序相同。
    输入：root = [1,2,5,3,4,null,6]
    输出：[1,null,2,null,3,null,4,null,5,null,6]
    示例 2：

    输入：root = []
    输出：[]
    示例 3：

    输入：root = [0]
    输出：[0]
     */
    public static void tracingFlatten(TreeNode root,List<TreeNode> list){
        if (root == null)
            return;
        list.add(root);
        tracingFlatten(root.left, list);
        tracingFlatten(root.right, list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> nodelist = new ArrayList<TreeNode>();
        tracingFlatten(root, nodelist);

        for (int i = 1; i < nodelist.size(); i++) {
            TreeNode one = nodelist.get(i - 1), two = nodelist.get(i);
            one.left = null;
            one.right = two;

        }
    }

    public static void main(String[] args) {
        Question114 question114 = new Question114();
        TreeNode root = TreeNode.buildTree("[1,2,5,3,4,null,6]");
        question114.flatten(root);
    }
}
