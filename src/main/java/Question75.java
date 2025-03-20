import java.lang.reflect.Array;
import java.util.Arrays;

public class Question75 {
    /*
    75. 颜色分类
    给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地 对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

    我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
    必须在不使用库内置的 sort 函数的情况下解决这个问题。
    示例 1：
    输入：nums = [2,0,2,1,1,0]
    输出：[0,0,1,1,2,2]
    示例 2：
    输入：nums = [2,0,1]
    输出：[0,1,2]
    提示：
    n == nums.length
    1 <= n <= 300
    nums[i] 为 0、1 或 2
     */
    public void sortColors(int[] nums) {
        /*
        思路： 只有012 原地排序 就是不能搞一个新的数组
        非常粗暴的方法是用一个map统计每个数字出现的频率，然后直接重置nums
        太粗暴了，换个思路是这样，维护left和right指针，当遇到0时，把0和left置换，left++，当遇到2时，和right置换，right--,如果当前的right也是2，right--，一直把i遍历完，
         */
        int left=0,right = nums.length-1;
        for(int i=0;i<=right;i++){
            while(nums[i]==2 && i<=right){
                int tmp = nums[right];
                nums[right] = nums[i];
                nums[i]=tmp;
                right--;
            }
            if(nums[i]==0){
                int tmp = nums[left];
                nums[left] = nums[i];
                nums[i] = tmp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Question75 question75 = new Question75();
        int[] test00 = new int[]{2,0,1};
        question75.sortColors(test00);
        System.out.println(Arrays.toString(test00));
    }

}
