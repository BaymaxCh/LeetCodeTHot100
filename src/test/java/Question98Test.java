import org.junit.Assert;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class Question98Test {
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
    Question98 question98 = new Question98();

    @Test
    void isValidBST() {
        TreeNode test00 = TreeNode.buildTree("[2,1,3]");
        boolean expected00 = true;

        Assert.assertEquals("test00 " ,expected00,question98.isValidBST(test00));
    }
}