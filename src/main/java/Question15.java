import java.io.Flushable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    /*
    15. 三数之和
    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
    注意：答案中不可以包含重复的三元组。

    示例 1：
    输入：nums = [-1,0,1,2,-1,-4]
    输出：[[-1,-1,2],[-1,0,1]]
    解释：
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
    不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
    注意，输出的顺序和三元组的顺序并不重要。
    示例 2：
    输入：nums = [0,1,1]
    输出：[]
    解释：唯一可能的三元组和不为 0 。
    示例 3：
    输入：nums = [0,0,0]
    输出：[[0,0,0]]
    解释：唯一可能的三元组和为 0 。
    提示：
    3 <= nums.length <= 3000
    -105 <= nums[i] <= 105
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans  = new ArrayList<List<Integer>>();
        int tmp = 0;
        Arrays.sort(nums);
//        if(nums[0]==nums[nums.length-1] && nums[0]==0){
//            List<Integer> list = new ArrayList<>();
//            list.add(0);list.add(0);list.add(0);ans.add(list);
//            return ans;
//        }
        for(int i=0,j,r;i<nums.length;i++){

            for(j=i+1;j<nums.length;j++){
                tmp = - nums[i] - nums[j];
           //     System.out.println("j=="+j);
                for(r=j+1;r<nums.length;r++){
                    if(tmp == nums[r]){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[r]);
                        ans.add(list);
                      //  System.out.println("新添加了"+list);
                    }else if(tmp<nums[r])
                        break;
                    else
                        continue;
                    while(r+1<nums.length && nums[r] ==nums[r+1])
                        r++;
                }
                while(j+1<nums.length && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i+1<nums.length && nums[i] == nums[i+1])
                i++;

        }
        return ans;
    }

    public static void main(String[] args) {
        Question15 question15 = new  Question15();
        int[] test00 = new int[]{-1,0,1,2,-1,-4};
        for(List<Integer> list : question15.threeSum(test00)){
            System.out.println(list);
        }
        int[] test01 = new int[]{0,1,1};
        for(List<Integer> list : question15.threeSum(test01)){
            System.out.println(list);
        }

        int[] test02 = new int[]{0,0,0,0};
        for(List<Integer> list : question15.threeSum(test02)){
            System.out.println(list);
        }
    }
}
