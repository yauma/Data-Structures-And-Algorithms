package SECTION_6_ARRAYS

/**
 * Created by jaimequeraltgarrigos on 1/18/20.
 */
class MyArrays {
    companion object {
        fun reverseString(arrayString: CharArray): String {
            val arrayReversed = arrayListOf<Char>()
            for (index in (arrayString.size - 1) downTo 0) {
                arrayReversed.add(arrayString[index])
            }
            return arrayReversed.toString().replace(",", "")
        }

        fun reverse2(string: String): String {
            return string.reversed()
        }


        /*
        Given two sorted arrays, the task is to merge them in a sorted manner.
        Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8, 10}
        Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8, 10}
         */
        fun mergedSortedArrays(array1: IntArray, array2: IntArray): Array<Int?> {
            val mergedArray = arrayOfNulls<Int>(array1.size + array2.size)
            var i = 0
            var j = 0
            for (k in 0 until mergedArray.size) {
                if (i >= array1.size || (j < array2.size && array2[j] < array1[i])) {
                    mergedArray[k] = array2[j]
                    j++
                } else {
                    mergedArray[k] = array1[i]
                    i++
                }
            }
            return mergedArray
        }

        /*
        Given an array nums, write a function to move all 0s
        to the end of it while maintaining the relative order of the non-zero elements.
        Example:

        Input: [1,0,2,3,12]
        Output: [1,3,12,0,0]
        Note:

        You must do this in-place without making a copy of the array.
        Minimize the total number of operations.*/

        fun moveZeroesTotheRight(nums: IntArray): IntArray {
            val length = nums.size
            var lastNonZeroFoundAt = 0
            // If the current element is not 0, then we need to
            // append it just in front of last non 0 element we found.
            for (i in 0 until length) {
                if (nums[i] != 0) {
                    nums[lastNonZeroFoundAt++] = nums[i]
                }
            }
            // all the non-zero elements are already at beginning of array.
            // We just need to fill remaining array with 0's.
            while (lastNonZeroFoundAt < length) {
                nums[lastNonZeroFoundAt++] = 0
            }
            return nums
        }

        /*
        Given an array nums, write a function to move all 0s
        to the beginnign of it while maintaining the relative order of the non-zero elements.
        Example:

        Input: [1,0,2,0,12]
        Output: [0,0,1,2,12]
        Note:

        Minimize the total number of operations.
        */

        fun moveZeroesTotheLeft(nums: IntArray): MutableList<Int> {
            val length = nums.size
            var lastNonZeroFoundAt = 0
            val arrayNonZero = mutableListOf<Int>()
            for (i in 0 until length) {
                if (nums[i] != 0) {
                    arrayNonZero.add(nums[i])
                }
            }
            for (i in 0 until length - arrayNonZero.size) {
                arrayNonZero.add(i, 0)
            }
            return arrayNonZero
        }

        /*
        * Given an array representing prices of the stock on different days,
        * find the maximum profit that can be earned by performing maximum of one transaction.
        * A transaction consists of activity of buying and selling the stock on different or same days.
        *
        * Eg: 1 - {100, 80, 120, 130, 70, 60, 100, 125}
        * the price of the stock on day-1 is 100, on day-2 is 80 and so on.
        * The maximum profit that could be earned in this window is 65 (buy at 60 and sell at 125).
        *
        * Eg: 2 - For price array - {
        * , 80, 70, 65, 60, 55, 50}, maximum profit that could be earned is 0.
        *
        * */

        fun findMaximunProfitStock(stocks: IntArray): Int {
            var maxProfit = 0
            var minimumPrice = Integer.MAX_VALUE

            for (i in 0 until stocks.size) {
                maxProfit = Math.max(maxProfit, stocks[i] - minimumPrice);
                minimumPrice = Math.min(minimumPrice, stocks[i]);
            }
            return maxProfit
        }
    }
}
