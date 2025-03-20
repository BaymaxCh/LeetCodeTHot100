import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question543Test {
    Question543 question543 = new Question543();

    @Test
    void diameterOfBinaryTree() {
        TreeNode test00 = TreeNode.buildTree("[1,2,3,4,5]");
        int expected00=3;

        TreeNode test01 = TreeNode.buildTree("[1,2]");
        int expected01 = 1;
        Assert.assertEquals("test00 ",expected00,question543.diameterOfBinaryTree(test00));
        question543.MAX_LENGTH = 0;
        Assert.assertEquals("test01 ",expected01,question543.diameterOfBinaryTree(test01));

    }
}