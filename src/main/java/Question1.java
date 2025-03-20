import java.util.*;

public class Question1 {
    /*

    两数之和
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
    你可以按任意顺序返回答案。
    示例 1：
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    示例 2：

    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    示例 3：

    输入：nums = [3,3], target = 6
    输出：[0,1]


    提示：

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    只会存在一个有效答案

     */
    public int[] twoSum2(int[] nums, int target) {
        int result =0;
        Set<Integer> set = new HashSet<Integer>();
        int[] ans = new int[2];
        for(int i = 0;i<nums.length;i++){
            result = target - nums[i];
            set.add(nums[i]);
            for(int j=0;j<nums.length;j++){
                if(i==j)
                    continue;
                if(set.contains(nums[i]))
                if(nums[j]==result){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]),i};
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2,7,11,15};
        Question1 q1 = new Question1();
        int target = 9;
        int ans[] = q1.twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
