package SECTION_12_ALGORITHMS_RECURSION

/**
 * Created by jaimequeraltgarrigos on 1/27/20.
 */
class Recursion {
    companion object {
        var counter = 0
        var result = 0
        var value = 0
        var lastValue = 0
        var string: String? = null
        fun inception(): String {
            println(counter)
            if (counter > 3) {
                return "Done"
            }
            counter++
            return inception()
        }

        // 5! = 5*4*3*2*1
        fun findFactorialRecursiveNumber(value: Int): Int {
            if (counter == 0) {
                counter = value
                result = value
            }
            if (value == 1) {
                return result
            }
            counter--
            result *= counter
            return findFactorialRecursiveNumber(counter)
        }

        // 5! = 5*4*3*2*1
        val factorialResult = 0

        fun findFactorialShort(value: Int): Int {
            if (value == 1) {
                return 1
            }
            return value * findFactorialShort(value - 1)
        }

        fun findFactorialIterative(value: Int): Int {
            var result = value
            var counter = value
            while (counter > 1) {
                counter--
                result *= counter
            }
            return result
        }


        fun fibonacciIterative(index: Int): Int {
            var number = 0
            var array = mutableListOf(0, 1)
            if (index == 0 || index == 1) {
                return index
            }
            if (index > 1) {
                for (i in 1..index - 1) {
                    number = array[i - 1] + array[i]
                    array.add(i + 1, number)
                }
            }
            return number
        }

        var array = mutableListOf<Int>(0, 1)
        var fiboValue = 0
        var fibocounter = 1
        fun fibonacciRecursive(index: Int): Int {
            if (fibocounter == 1) {
                fiboValue = index
            }
            if (fibocounter == fiboValue) {
                return result
            }
            result = array[fibocounter] + array[fibocounter - 1]
            fibocounter++
            array.add(fibocounter, result)
            return fibonacciRecursive(fibocounter)
        }

        fun fibRecursiveShort(n: Int): Int {
            if (n < 2) {
                return n
            }
            return fibRecursiveShort(n - 1) + fibRecursiveShort(n - 2)
        }

        fun reverseString(string: String): String {
            val stringArray = string.toCharArray()
            var string = ""
            for (i in stringArray.size - 1 downTo 0) {
                string += stringArray[i]
            }
            return string
        }
    }
}