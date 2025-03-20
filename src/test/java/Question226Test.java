import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question226Test {
    Question226 question226 = new Question226();

    @Test
    void invertTree() {
        TreeNode test00 = TreeNode.buildTree("[4,2,7,1,3,6,9]");
        TreeNode expected00 = TreeNode.buildTree("[4,7,2,9,6,3,1]");
        Assert.assertEquals("test 00 " , expected00.left.val,question226.invertTree(test00).left.val);

    }
}