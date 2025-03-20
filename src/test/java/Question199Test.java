import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question199Test {
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
    Question199 question199 = new Question199();
    @Test
    void rightSideView() {
        TreeNode test00 = TreeNode.buildTree("[1,2,3,null,5,null,4]");
        String expected = "[1, 3, 4]";
        Assert.assertEquals("   ",expected,question199.rightSideView(test00).toString());
    }
}