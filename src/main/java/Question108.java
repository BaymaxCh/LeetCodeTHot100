public class Question108 {
    /*

    108. 将有序数组转换为二叉搜索树
    给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 平衡 二叉搜索树。

     输入：nums = [-10,-3,0,5,9]
    输出：[0,-3,9,-10,null,5]
    解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
    输入：nums = [1,3]
    输出：[3,1]
    解释：[1,null,3] 和 [3,1] 都是高度平衡二叉搜索树。
     */
    public TreeNode tool108(int[] nums ,int left,int right){
        if(left>right)
            return null;
        int mid = (right+left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tool108(nums,left,mid-1);
        root.right = tool108(nums,mid+1,right);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        //取中间的数字作为根节点，然后分为左边的区间和右边的区间，一直
        //循环的函数应该是 nums 左右指针限定生成范围，返回的是root。返回的root是当前的左右节点。
        if(nums==null)
            return null;
        return tool108(nums,0,nums.length-1);

    }


}
