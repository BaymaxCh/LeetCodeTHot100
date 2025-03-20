import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question230Test {
    /*
    230. 二叉搜索树中第 K 小的元素
     给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 小的元素（从 1 开始计数）。
      输入：root = [3,1,4,null,2], k = 1
输出：1
     */
    Question230 question230 = new Question230();

    @Test
    void kthSmallest() {
        TreeNode test00 = TreeNode.buildTree("[3,1,4,null,2]");
        int expected = 1;
        Assert.assertEquals("aaa",expected,question230.kthSmallest(test00,1));
    }
}