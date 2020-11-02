package SECTION_3_BIG_O

class LogAllPairArrays {
    // log all pair of arrays
    companion object {
        fun logAllPair(boxes: List<String>) {
            for (i in boxes.indices) {
                for (j in boxes.indices) {
                    if (i != j) {
                        println("${boxes[i]}, ${boxes[j]}")
                    }
                }

            }
        }

        fun logAllImPair(boxes: List<String>) {
            for (i in boxes.indices) {
                for (j in 0..boxes.size step 2) {
                    if (i != j) {
                        println("${boxes[i]}, ${boxes[j]}")
                    }
                }

            }
        }
    }
}