import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Question105 {
    /*

    105. 从前序与中序遍历序列构造二叉树
    给定两个整数数组 preorder 和 inorder ，其中 preorder 是二叉树的先序遍历， inorder 是同一棵树的中序遍历，请构造二叉树并返回其根节点。
    输入: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
    输出: [3,9,20,null,null,15,7]
    示例 2:

    输入: preorder = [-1], inorder = [-1]
    输出: [-1]

    前序遍历 根左右 中序遍历 左跟右
    15是root，15往前是左子树，15往后是右子树
     */
    public TreeNode buildTree_help(int[] preorder,List<Integer> inorder, int prebegin,int preend,int inbegin,int inend){
        if(prebegin>preend)
            return null;
        TreeNode root = new TreeNode(preorder[prebegin]);
        int inrootindex = inorder.indexOf(preorder[prebegin]);
        //求左子树的长度，可以获得preorder的左子树边界
        int leftLength = inrootindex - inbegin;
        root.left = buildTree_help(preorder,inorder,prebegin+1,prebegin+leftLength,inbegin,inrootindex-1);
        root.right = buildTree_help(preorder,inorder,prebegin+leftLength+1,preend,inrootindex+1,inend);

        return root;
    }

    public TreeNode buildTree(int[] preorder,int[] inorder) {
        List<Integer> inlist = new ArrayList<>();
        for(int i:inorder){
            inlist.add(i);
        }
        int n = preorder.length;
        return buildTree_help(preorder,inlist,0,n-1,0,n-1);

    }

}

