import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question11Test {
    Question11 question11 = new Question11();
    @Test
    void maxArea() {
        int[] test00 = new int[]{1,8,6,2,5,4,8,3,7};
        int ans00 = 49;
        int[] test01 = new int[]{1,1};
        int ans01 = 1;
        Assert.assertEquals("test00",ans00,question11.maxArea(test00));
        Assert.assertEquals("test01",ans01,question11.maxArea(test01));
    }
}