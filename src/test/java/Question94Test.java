import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question94Test {
    Question94 question94 = new Question94();
    @Test
    void inorderTraversal() {

        TreeNode root00 = new TreeNode(1);
        root00.right = new TreeNode(2);
        root00.right.left = new TreeNode(3);
        String expected00 = "[1, 3, 2]";
        Assert.assertEquals("NODE00",expected00,question94.inorderTraversal(root00).toString());

        TreeNode root01 = null;
        String expected01 = "[]";
        Assert.assertEquals("NODE01",expected01,question94.inorderTraversal(root01).toString());

        TreeNode root02 = new TreeNode(1);
        String expected02 = "[1]";
        Assert.assertEquals("NODE02",expected02,question94.inorderTraversal(root02).toString());



    }
}