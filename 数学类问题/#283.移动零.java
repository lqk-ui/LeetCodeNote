/*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。
*/
class Solution {
    public void moveZeroes(int[] nums) {
        //直接用指针保存相对位置，然后覆盖值，最后补0
        int index = 0;//用来记录非零元素放哪
        for (int i = 0; i < nums.length; i++) {//遍历数组 找到非零元素 直接覆盖到应在位置
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (; index < nums.length; index++) {//非零元素遍历完后,对后续元素用零覆盖
            nums[index] = 0;
        }
    }

}
