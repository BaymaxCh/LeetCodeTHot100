import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question128Test {
    Question128 question128 = new Question128();
    @Test
    void longestConsecutive() {
        int[] test00 = new int[]{100,4,200,1,3,2};
        int[] test01 = new int[]{0,3,7,2,5,8,4,6,0,1};
        int[] test02 = new int[]{1,0,1,2};

        Assert.assertEquals("TEST00",4,question128.longestConsecutive(test00));
        Assert.assertEquals("TEST01",9,question128.longestConsecutive(test01));
        Assert.assertEquals("TEST01",3,question128.longestConsecutive(test02));

    }
}