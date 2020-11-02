package SECTION_8_LINKED_LISTS

import java.util.*

/**
 * Created by jaimequeraltgarrigos on 1/20/20.
 */
class MyLinkedList {

    class MyNode<T>(value: T) {
        var value: T = value
        var next: MyNode<T>? = null
        var previous: MyNode<T>? = null
    }

    class LinkedList<T> {
        var head: MyNode<T>? = null
        var isEmpty: Boolean = head == null
        fun first(): MyNode<T>? = head
        fun last(): MyNode<T>? {
            var node = head
            if (node != null) {
                while (node?.next != null) {
                    node = node?.next
                }
                return node
            } else {
                return null
            }
        }

        fun count(): Int {
            var node = head
            if (node != null) {
                var counter = 1
                while (node?.next != null) {
                    node = node?.next
                    counter += 1
                }
                return counter
            } else {
                return 0
            }
        }

        fun nodeAtIndex(index: Int): MyNode<T>? {
            if (index >= 0) {
                var node = head
                var i = index
                while (node != null) {
                    if (i == 0) return node
                    i -= 1
                    node = node.next
                }
            }
            return null
        }

        fun insert(node: MyNode<T>, index: Int) {
            val previousNode = nodeAtIndex(index)
            if (previousNode != null) {
                node.next = previousNode.next
                previousNode.next = node
            } else {
                append(node.value)
            }
        }

        fun append(value: T) {
            val newNode = MyNode(value)
            val lastNode = this.last()
            if (lastNode != null) {
                newNode.previous = lastNode
                lastNode.next = newNode
            } else {
                head = newNode
            }
        }

        fun prepend(value: T) {
            val newNode = MyNode(value)
            val head = this.first()
            if (head != null) {
                head.previous = newNode
                newNode.next = head
                this.head = newNode
            } else {
                this.head = newNode
            }
        }

        fun removeAll() {
            head = null
        }

        fun removeNode(node: MyNode<T>): T {
            val prev = node.previous
            val next = node.next
            if (prev != null) {
                prev.next = next
            } else {
                head = next
            }
            next?.previous = prev
            node.previous = null
            node.next = null
            return node.value
        }

        fun removeLast(): T? {
            val last = this.last()
            if (last != null) {
                return removeNode(last)
            } else {
                return null
            }
        }

        fun reverseList(head: MyNode<T>): MyNode<T>? {
            var prev: MyNode<T>? = null
            var curr: MyNode<T>? = head
            while (curr != null) {
                val nextTemp = curr.next
                curr.next = prev
                prev = curr
                curr = nextTemp
            }
            return prev
        }

        fun removeAtIndex(index: Int): T? {
            val node = nodeAtIndex(index)
            if (node != null) {
                return removeNode(node)
            } else {
                return null
            }
        }



        override fun toString(): String {
            var s = "["
            var node = head
            while (node != null) {
                s += "${node.value}"
                node = node.next
                if (node != null) {
                    s += ", "
                }
            }
            return s + "]"
        }
    }
}


