import javax.print.DocFlavor;
import java.util.*;

public class Question49 {
    /*
    49. 字母异位词分组
    给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
    字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
    示例 1:
    输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
    示例 2:
    输入: strs = [""]
    输出: [[""]]
    示例 3:
    输入: strs = ["a"]
    输出: [["a"]]
    提示：
    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] 仅包含小写字母
     */

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<String, List<String>>();//key == pattern  value保存符合pattern的string  这里直接赋值为null会报错
        for(String string : strs){
            char[] tmp = string.toCharArray();
            Arrays.sort(tmp);
            String newstrs = new String(tmp);
            List<String> list = map.getOrDefault(newstrs,new ArrayList<String>());
            list.add(string);
            map.put(newstrs,list);

        }

        return new ArrayList<List<String>>(map.values());
    }
}
