import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.*;

public class Question3 {
    /*
    3. 无重复字符的最长子串
     给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度
    示例 1:
    输入: s = "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    示例 2:
    输入: s = "bbbbb"
    输出: 1
    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    示例 3:
    输入: s = "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
    提示：
    0 <= s.length <= 5 * 104
    s 由英文字母、数字、符号和空格组成
     */
    public int lengthOfLongestSubstring(String s) {
        //l r 分别指向子串的头和尾，r从0到s.length()遍历
        //当r走一步，检查从l 到r 这个区间有没有重复 [r]的字母，有的话l++，l一直加到没有出现重复的字母（这里相当于从子串开头一直删到重复字母
        //当l走完确认没有重复数字后，就把r的字母加进子串
        Set<Character> set = new HashSet<>();
        int length = 0;
        int l=0,r=0;
        for(;r<s.length();r++){

            while(l<r && set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            length = Math.max(length,r-l+1);


        }

        return length;
    }
}
