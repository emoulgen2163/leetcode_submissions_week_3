class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = nums[0]
        var curSum = nums[0]
        for(i in 1 until nums.size){
            curSum = max(nums[i], curSum + nums[i])
            maxSum = max(maxSum, curSum)
        }

        return maxSum
    }
}