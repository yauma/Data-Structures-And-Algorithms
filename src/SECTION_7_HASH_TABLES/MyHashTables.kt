package SECTION_7_HASH_TABLES

/**
 * Created by jaimequeraltgarrigos on 1/20/20.
 */
class MyHashTables {
    companion object {
        //[2,3,2,5,2,1,5,3,4]
        fun firstRecurringNumberInArray(array: IntArray): Int? {
            var firstRecurringNumber: Int? = null
            val map = mutableMapOf<Int, Int>()
            for (i in 0 until array.size) {
                if (map.containsKey(array[i])) {
                    firstRecurringNumber = array[i]
                    return firstRecurringNumber
                } else {
                    map.put(array[i], array[i])
                }
            }
            return firstRecurringNumber
        }

        /*Given nums = [2, 11, 15, 7], target = 9,

        Because nums[0] + nums[3] = 2 + 7 = 9,
        return [0, 3].*/
        fun TwoSum(array: IntArray, target: Int): String {
            val map = mutableMapOf<Int, Int>()
            var response = "No numbers found"
            var searchedNumber = 0
            for (i in 0 until array.size) {
                val number = array[i]
                searchedNumber = target - number
                if (map.containsKey(searchedNumber)) {
                    response = "[${map.getValue(searchedNumber)}, $i]"
                } else {
                    map.put(number, i)
                }
            }
            return response
        }
    }
}