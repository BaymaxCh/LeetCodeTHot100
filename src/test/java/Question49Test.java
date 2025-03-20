import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question49Test {
    Question49 question49 = new Question49();

    @Test
    void groupAnagrams() {
        List<List<String>> ans = question49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
     //   System.out.println(ans.toString());
        String actual = ans.toString();
        String expect = "[[eat, tea, ate], [bat], [tan, nat]]";
        Assert.assertEquals("输出结果对比",expect,actual);

    }
}