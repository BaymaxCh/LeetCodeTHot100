import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    Question1 q1 = new Question1();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void twoSum() {
        int [] nums = new int[]{2,7,11,15};
        int target = 9;
        int ans[] = q1.twoSum(nums,target);
        System.out.println(Arrays.toString(ans));

    }
}