class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy{ it[0] }
        val output = ArrayList<IntArray>()

        output.add(intervals[0])

        for (interval in 1 until intervals.size) {

            if(output.last()[1] >= intervals[interval][0]){
                output.last()[1] = Math.max(output.last()[1], intervals[interval][1])
            } else{
                output.add(intervals[interval])
            }
        }

        return output.toTypedArray()
    }
}