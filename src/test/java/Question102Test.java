import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question102Test {
    Question102 question102 = new Question102();
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
    @Test
    void levelOrder() {
        TreeNode test00 = TreeNode.buildTree("[3,9,20,null,null,15,7]");
        String expected = "[[3], [9, 20], [15, 7]]";
        Assert.assertEquals("test00" ,expected,question102.levelOrder(test00).toString());
    }
}