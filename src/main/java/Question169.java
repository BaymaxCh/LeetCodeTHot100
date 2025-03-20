import java.util.HashMap;
import java.util.Map;

public class Question169 {
    /*
    169. 多数元素
    给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    示例 1：
    输入：nums = [3,2,3]
    输出：3
    示例 2：
    输入：nums = [2,2,1,1,1,2,2]
    输出：2
     */
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>  map = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            int count = map.getOrDefault(i,0);
            if(++count> n/2)
                return i;
            map.put(i,count);
        }
        return -1;
    }

    public static void main(String[] args) {
        Question169 question169 = new Question169();
        int[] test00 = {3,2,3};
        int[] test01 = {2,2,1,1,1,2,2};
        System.out.println(question169.majorityElement(test00));
        System.out.println(question169.majorityElement(test01));
    }
}
