class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val uniques = hashSetOf<Int>()

        for(i in nums){
            uniques.add(i)
        }

        return nums.size != uniques.size
    }
}