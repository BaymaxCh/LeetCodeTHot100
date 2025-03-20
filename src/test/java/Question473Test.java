import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question473Test {
    Question473 question473 = new Question473();

    @Test
    void pathSum() {
        TreeNode test00 = TreeNode.buildTree("[1,-2,-3,1,3,-2,null,-1]");
        int inttest00 = -1;
        int expected = 4;
        Assert.assertEquals("aa",expected,question473.pathSum(test00,inttest00));
    }
}