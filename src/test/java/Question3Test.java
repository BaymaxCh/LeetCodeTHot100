import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    Question3 question3 = new Question3();
    @Test
    void lengthOfLongestSubstring() {
        String test00 = "abcabcbb";
        int expected00 = 3;
        String test01 = "bbbbb";
        int expected01 = 1;
        String test02 = "pwwkew";
        int expected02 = 3;
        Assert.assertEquals("test00",expected00,question3.lengthOfLongestSubstring(test00));
        Assert.assertEquals("test01",expected01,question3.lengthOfLongestSubstring(test01));
        Assert.assertEquals("test02",expected02,question3.lengthOfLongestSubstring(test02));
    }
}