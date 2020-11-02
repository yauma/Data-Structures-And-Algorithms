package SECTION_13_SORTING

/**
 * Created by jaimequeraltgarrigos on 1/30/20.
 */
class Sorting {
    companion object {
        //[6,1,8,5]
        fun bubbleSort(array: IntArray): IntArray {
            var number1: Int
            var number2: Int
            var z: Int
            for (number in array) {
                for (j in 0 until array.size) {
                    z = j + 1
                    number1 = array[j]
                    if (z <= array.size - 1) {
                        number2 = array[z]
                    } else {
                        z = j
                        number2 = array[z]
                    }
                    if (number1 > number2) {
                        array[z] = number1
                        array[j] = number2
                    }
                }
            }
            return array
        }

        //[5,3,1]
        fun selectionSort(array: MutableList<Int>): MutableList<Int> {
            for (i in 0 until array.size) {
                var min = i
                val temp = array[i]
                for (j in i + 1 until array.size) {
                    if (array[j] < array[min]) {
                        min = j
                    }
                }
                array[i] = array[min]
                array[min] = temp
            }
            return array
        }

        //[5,3,1]
        fun insertion(array: MutableList<Int>): MutableList<Int> {
            for (count in 1 until array.size) {
                var i = count
                val temp = array[i]
                while (i > 0 && temp < array[i - 1]) {
                    array[i] = array[i - 1]
                    i--
                }
                array[i] = temp
            }
            return array
        }

        fun mergeSort(list: List<Int>): List<Int> {
            if (list.size <= 1) {
                return list
            }

            val middle = list.size / 2
            var left = list.subList(0, middle);
            var right = list.subList(middle, list.size);

            return merge(mergeSort(left), mergeSort(right))
        }


        fun merge(left: List<Int>, right: List<Int>): List<Int> {
            var indexLeft = 0
            var indexRight = 0
            var newList: MutableList<Int> = mutableListOf()

            while (indexLeft < left.count() && indexRight < right.count()) {
                if (left[indexLeft] <= right[indexRight]) {
                    newList.add(left[indexLeft])
                    indexLeft++
                } else {
                    newList.add(right[indexRight])
                    indexRight++
                }
            }

            while (indexLeft < left.size) {
                newList.add(left[indexLeft])
                indexLeft++
            }

            while (indexRight < right.size) {
                newList.add(right[indexRight])
                indexRight++
            }

            return newList;
        }
    }
}