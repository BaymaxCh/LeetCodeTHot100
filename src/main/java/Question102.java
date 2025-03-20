import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Question102 {
    /*
    102. 二叉树的层序遍历
    给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
     输入：root = [3,9,20,null,null,15,7]
    输出：[[3],[9,20],[15,7]]
    示例 2：
    输入：root = [1]
    输出：[[1]]
    示例 3：
    输入：root = []
    输出：[]
    提示：
    树中节点数目在范围 [0, 2000] 内
    -1000 <= Node.val <= 1000
     */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>>  ans = new ArrayList<List<Integer>>();
        if(root==null)
            return ans;
        //层次遍历用queue
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            while(size>0) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                size -- ;
                list.add(node.val);
            }
            ans.add(list);
        }
        return ans;
    }
}
