import java.util.Arrays;

public class Question31 {
    /*
    31. 下一个排列
    示例 1：
    输入：nums = [1,2,3]
    输出：[1,3,2]
    示例 2：
    输入：nums = [3,2,1]
    输出：[1,2,3]
    示例 3：
    输入：nums = [1,1,5]
    输出：[1,5,1]
     */
    public void reverseSort(int[] nums,int flag){
       //此时flag之后必为降序
        int end = nums.length-1;
        while(flag<end){
           swap(nums,flag,end);
           flag++;
           end--;
        }
    }
    public void swap(int[] nums,int left,int right){
        int tmp = nums[right];
        nums[right] = nums[left];
        nums[left] = tmp;
    }
    public void nextPermutation(int[] nums) {
        //找到nums中最后一个升序邻居AB，然后在B之后找到一个最小的C满足比A大，然后把AC调换，然后从新的A位之后，按照升序重新排列。
        //我需要一个辅助函数，用快排来完成第二步
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }//此时nums[i] 为A ，从倒数开始找最小但是大于A的数字
        if(i>=0){
            int j=nums.length-1;
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
         //  System.out.println(Arrays.toString(nums));
        }
        reverseSort(nums,i+1);
    }

    public static void main(String[] args) {
        Question31 question31 = new Question31();
        int[] test00 = new int[]{4,5,2,6,3,1};
        question31.nextPermutation(test00);
        System.out.println(Arrays.toString(test00));
    }
}
