import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question104Test {
    Question104 question104 = new Question104();
    @Test
    void maxDepth() {
        TreeNode test00 = TreeNode.buildTree("[3,9,20,null,null,15,7]");
        int expected00 = 3;

        TreeNode test01 = TreeNode.buildTree("1,null,2");
        int expected01 = 2;

        Assert.assertEquals("test00" , expected00,question104.maxDepth(test00));
        Assert.assertEquals("test01" , expected01,question104.maxDepth(test01));
    }
}