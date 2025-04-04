import java.util.Arrays;

public class Question283 {

    /*
    283. 移动零
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
    示例 1:

    输入: nums = [0,1,0,3,12]
    输出: [1,3,12,0,0]
    示例 2:

    输入: nums = [0]
    输出: [0]
    提示:
    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1

    进阶：你能尽量减少完成的操作次数吗？
         */
    public void moveZeroes(int[] nums) {
        //指针index指向未排序的第一个下标，i表示index及之后第一个非0数字下标，然后将i的值赋给index，index++,然后i继续遍历下一个非0数字
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Question283 question283 = new Question283();
        question283.moveZeroes(new int[]{0,1,0,3,12});
        question283.moveZeroes(new int[]{0});
    }
}
