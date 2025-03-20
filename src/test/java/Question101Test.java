import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question101Test {
    /*
    101. 对称二叉树
    给你一个二叉树的根节点 root ， 检查它是否轴对称。
    输入：root = [1,2,2,3,4,4,3]
    输出：true
    输入：root = [1,2,2,null,3,null,3]
    输出：false

     */
    Question101 question101 = new Question101();

    @Test
    void isSymmetric() {
        TreeNode test00 = TreeNode.buildTree("[1,2,2,3,4,4,3]");
        boolean expected00 = true;

        TreeNode test01 = TreeNode.buildTree("[1,2,2,null,3,null,3]");
        boolean expected01 = false;
        Assert.assertEquals("test00" ,expected00, question101.isSymmetric(test00));
        Assert.assertEquals("test01" ,expected01, question101.isSymmetric(test01));

    }
}