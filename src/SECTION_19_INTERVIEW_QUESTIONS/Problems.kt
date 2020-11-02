package SECTION_19_INTERVIEW_QUESTIONS

/**
 * Created by jaimequeraltgarrigos on 3/3/20.
 */
class Problems {
    companion object {
        /*
        #1
        Reverse String from:
        https://leetcode.com/problems/reverse-string/
        */
        fun reverseString(array: CharArray): ArrayList<Char> {
            val arrayReversed = arrayListOf<Char>()
            for (i in array.size - 1 downTo 0) {
                var char = array[i]
                arrayReversed.add(char)
            }
            return arrayReversed
        }

        /*
        Given 2 sorted arrays ex: [0,2,4,5] & [1,2,3,6,87] return an Array merged [0,1,2,3,4,5,6,87]
         */
        fun mergedSortedArrays(array1: ArrayList<Int>, array2: ArrayList<Int>): ArrayList<Int> {
            var arrayMergedAndSorted = arrayListOf<Int>()
            for (i in array1.indices) {

            }
            return arrayMergedAndSorted;
        }

        /*
        #2
        FizzBuzz
        https://leetcode.com/problems/fizz-buzz/
        */

        fun fizzBuzz(n: Int) {
            for (i in 1..n) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    println("FizzBuzz")
                } else if (i % 3 == 0) {
                    println("Fizz")
                } else if (i % 5 == 0) {
                    println("Buzz")
                } else {
                    println(i)
                }
            }
        }

        /*

         Find how mny times a word is repeated un a sentece

         ex:    "Hello hello my name name is Jaime"
         output:
                Hello -> 2
                name ->  2

         */

        fun findRepeatedWords(string: String) {
            val array = string.toLowerCase().split(" ")
            val map: MutableMap<String, Int> = mutableMapOf()
            for (word in array) {
                if (map.containsKey(word)) {
                    val count: Int? = map[word]
                    if (count != null) {
                        map[word] = count + 1
                    }
                } else {
                    map[word] = 1
                }
            }
            map.forEach { k, v ->
                println("$k -> $v times")
            }
        }

        /* Given n strings, find the common characters in all the strings. In simple words, find characters that appear in all the strings and display them in alphabetical order or lexicographical order.

        Note* we’ll be considering that the strings contain lower case letters only.

        Examples:

        Input :  geeksforgeeks
        gemkstones
        acknowledges
        aguelikes

        Output : e g k s

        Input :  apple
        orange

        Output : a e
        */

        fun findCommonCharacters(stringsList: List<String>) {
            val listOfChars = mutableListOf<Char>()
            val map = mutableMapOf<Char, Int>()
            for (string in stringsList) {
                val set = string.toSet().toCharArray()
                listOfChars.addAll(set.toList())
            }
            for (index in 0 until listOfChars.size) {
                val char = listOfChars[index]
                if (map.contains(char)) {
                    map[char] = map.getValue(char) + 1
                } else {
                    map[char] = 1
                }
            }
            val commonChars = mutableListOf<Char>()
            map.forEach { k, v ->
                if (v == stringsList.size) {
                    commonChars.add(k)
                }
            }
            commonChars.sort()
            if (commonChars.size > 0) {
                commonChars.forEach {
                    print("$it ")
                }
            } else {
                print("no common characters found")
            }
        }

    }
}