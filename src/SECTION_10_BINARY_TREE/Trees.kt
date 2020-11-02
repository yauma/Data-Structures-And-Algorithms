package SECTION_10_BINARY_TREE

/**
 * Created by jaimequeraltgarrigos on 1/23/20.
 */
//           9
//      4         20
//  1      6  15      25
class Trees constructor(var root: BinaryTreeNode) {


    class BinaryTreeNode(var key: Int) {
        var left: BinaryTreeNode? = null
        var right: BinaryTreeNode? = null

        fun insert(value: Int) {
            if (value > key) {
                if (right == null) {
                    right = BinaryTreeNode(value)
                } else {
                    right?.insert(value)
                }
            }
            if (value < key) {
                if (left == null) {
                    left = BinaryTreeNode(value)
                } else {
                    left?.insert(value)
                }
            }
        }

        fun find(value: Int): BinaryTreeNode? = when {
            this.key > value -> {
                left?.find(value)
            }
            this.key < value -> {
                right?.find(value)
            }
            this.key == value -> this
            else -> null
        }
    }
}

