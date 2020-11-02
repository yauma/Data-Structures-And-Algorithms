import SECTION_19_INTERVIEW_QUESTIONS.Problems
import SECTION_4_CODE_INTERVIEW.ArraysComparator

fun main(args: Array<String>) {

    //Problems.findRepeatedWords("Hello hello my name name is is Jaime")
    //twoSum(intArrayOf(2,11,15,7), 22)
    Problems.findCommonCharacters(mutableListOf("geeksforgeeks",
            "gemkstones",
            "acknowledges",
            "aguelikes"))
}

/*Given nums = [2, 11, 15, 7], target = 9,

        Because nums[0] + nums[3] = 2 + 7 = 9,
        return [0, 3].*/
fun twoSum(array: IntArray, target: Int) {
    val map: MutableMap<Int, Int> = mutableMapOf()
    var response = "no numbers found"
    map[array[0]] = 0
    for (index in 1 until array.size) {
        val numberToFind = target - array[index]
        if (map.containsKey(numberToFind)) {
            response = "[${map.getValue(numberToFind)}, $index]"
            break
        } else {
            map[array[index]] = index
        }
    }
    print(response)
}