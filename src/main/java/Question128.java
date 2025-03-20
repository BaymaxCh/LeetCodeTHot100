import java.util.HashSet;
import java.util.Set;

public class Question128 {
    /*

128. 最长连续序列
    给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
    示例 1：

    输入：nums = [100,4,200,1,3,2]
    输出：4
    解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
    示例 2：

    输入：nums = [0,3,7,2,5,8,4,6,0,1]
    输出：9
    示例 3：

    输入：nums = [1,0,1,2]
    输出：3
    提示：
    0 <= nums.length <= 105
    -109 <= nums[i] <= 109
     */
    public int longestConsecutive(int[] nums) {
        //找到最小的数字，从最小的数字开始找下一个数字 将找到的放进临时set，判断下一个是不是有重复的，遇到重复的则暂停记录长度，
        //对比当前长度和历史最长长度，更新历史新高，然后while一直取到set里找不到的数字，重新开始；
        int ans = 0;
        int tmpans = 0;
        int tmpn = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                tmpans=1;
                tmpn = i;
                while(set.contains(++tmpn)){
                    tmpans++;
                }
                ans = Math.max(ans,tmpans);
            }
        }
        return ans;
    }
}
