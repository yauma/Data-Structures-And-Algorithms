package SECTION_9_STACKS_QUEUES

/**
 * Created by jaimequeraltgarrigos on 1/21/20.
 */

class Node<T> constructor(var value: T) {
    var next: Node<T>? = null
}

class MyStackLinkedList<T> {
    var top: Node<T>? = null
    var bottom: Node<T>? = null
    var length = 0

    fun peek(): Node<T>? {
        return top
    }

    fun pop() {
        if (length > 0) {
            top = top?.next
        }
        length--
    }

    fun push(node: Node<T>) {
        if (length == 0) {
            top = node
            bottom = node
        } else {
            node.next = top
            top = node
        }
        length++
    }

    fun showStack(): String {
        var string = ""
        if (length >= 1) {
            var node = top
            while (node != null) {
                string += "//${node.value}\n"
                node = node.next
            }
        } else {
            string = "Stack is empty"
        }
        return string
    }
}

class MyStackArray<T> {
    var array: ArrayList<T> = arrayListOf()

    fun peek(): T? {
        return array.last()
    }

    fun push(value: T) {
        array.add(value)
    }

    fun pop() {
        if (array.size > 0) {
            array.removeAt(array.size - 1)
        }
    }
}

class MyQueue<T> {
    var last: Node<T>? = null
    var first: Node<T>? = null
    var length = 0

    fun peek(): T? {
        return first?.value
    }

    fun enqueue(value: T) {
        val node = Node(value)
        if (length == 0) {
            first = node
            last = node
        } else {
            last?.next = node
            last = node
        }
        length++
    }

    fun dequeue() {
        if (length > 0) {
            first = first?.next
        }
        length--
    }

    fun showStack(): String {
        var string = ""
        if (length >= 1) {
            var node = first
            while (node != null) {
                string += "//${node.value}\n"
                node = node.next
            }
        } else {
            string = "Stack is empty"
        }
        return string
    }
}


/*
val node = Node<String>("Google")
val node1 = Node<String>("Facebook")
val node2 = Node<String>("Twitter")
val node3 = Node<String>("Instagram")

val myStack: MyStackLinkedList<String> = MyStackLinkedList()

myStack.push(node)
myStack.push(node1)
myStack.push(node2)
myStack.push(node3)

println(myStack.showStack())

println(myStack.peek()?.value + " Popped!! \n")

myStack.pop()

println(myStack.peek()?.value + " Popped!! \n")

myStack.pop()

println(myStack.peek()?.value + " Popped!! \n")

myStack.pop()

println(myStack.peek()?.value + " Popped!! \n")

myStack.pop()

println(myStack.showStack())*/

/*
val myStackArray = MyStackArray<String>()

myStackArray.push("Google")
myStackArray.push("Facebook")
myStackArray.push("Twitter")
myStackArray.push("Instagram")

println(myStackArray.array.toString())

println(myStackArray.peek())

myStackArray.pop()
myStackArray.pop()
myStackArray.pop()
myStackArray.pop()
myStackArray.pop()
myStackArray.pop()

println(myStackArray.array.toString())*/

/*var myQueue = MyQueue<String>()

myQueue.enqueue("Google")
myQueue.enqueue("Facebook")
myQueue.enqueue("Twitter")
myQueue.enqueue("Instagram")

println(myQueue.showStack())

println(myQueue.peek())

myQueue.dequeue()
myQueue.dequeue()
myQueue.dequeue()

println(myQueue.showStack())*/
