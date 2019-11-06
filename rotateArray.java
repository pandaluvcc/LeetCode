class rotateArray {
    
    // 使用 暴力法解决. 其它比如反转、环形法尚未搞懂.
    public void rotate(int[] nums, int k) {
        // 循环 K 次
        for (int i = 0; i<k; i++) {
            // 获取数组尾值
            int tmp = nums[nums.length - 1];
            int thisnum;
            for (int j = 0; j<nums.length; j++) {
                // 当前值
                thisnum = nums[j];
                // 将尾值放入头部
                nums[j] = tmp;
                // 保留当前值，下次循环直接替换
                tmp = thisnum;
            }
        }
    }
}
