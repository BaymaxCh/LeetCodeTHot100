import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    public static TreeNode buildTree(String data) {
        // 去除字符串中的括号和空格
        data = data.replace("[", "").replace("]", "").replace(" ", "");
        String[] nodes = data.split(",");

        if (nodes.length == 0 || nodes[0].equals("null")) {
            return null;
        }

        // 创建根节点
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < nodes.length) {
            TreeNode current = queue.poll();

            // 处理左子节点
            if (index < nodes.length && !nodes[index].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(current.left);
            }
            index++;

            // 处理右子节点
            if (index < nodes.length && !nodes[index].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

}
