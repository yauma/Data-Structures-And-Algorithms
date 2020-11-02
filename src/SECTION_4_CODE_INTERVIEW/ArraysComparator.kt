package SECTION_4_CODE_INTERVIEW

/**
 * Created by jaimequeraltgarrigos on 1/16/20.
 */
class ArraysComparator {
    companion object {
        val array1 = arrayOf("a", "b", "c", "d", "e")
        val array2 = arrayOf("z", "k", "a")

        fun findSimilarLettersInArrays(array1: Array<String>?, array2: Array<String>?): Boolean {
            val map: HashMap<String, Int> = hashMapOf()
            if (array1 != null) {
                for (position in 0 until array1.size) {
                    map[array1[position]] = position
                }
            }
            println(map)
            if (array2 != null) {
                for (letter in array2) {
                    if (map.containsKey(letter)) {
                        return true
                    }
                }
            }
            return false
        }
    }
}
