import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Question199 {
    /*
    199. 二叉树的右视图
    给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。

示例 1：

输入：root = [1,2,3,null,5,null,4]

输出：[1,3,4]
输入：root = [1,2,3,4,null,null,null,5]

输出：[1,3,4,5]

解释：
     */
    public List<Integer> rightSideView(TreeNode root) {
        //层次遍历 然后获取每一层的最后一个数字。
        if(root==null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode node = null;
            while(size>0){
                node = queue.poll();
                if(node.left!=null)
                    queue.offer(node.left);
                if(node.right!=null)
                    queue.offer(node.right);
                size--;
            }
            list.add(node.val);
        }
        return list;
    }
}
