package SECTION_9_STACKS_QUEUES

import java.util.*

/**
 * Created by jaimequeraltgarrigos on 1/22/20.
 */
class MyQueueWithStack<T> {
    /** Initialize your data structure here. */
    val s1 = Stack<T>()

    fun push(i: T) {
        val s2 = Stack<T>()
        while (s1.isNotEmpty()) {
            s2.plusAssign(s1.pop())
        }
        s1.plusAssign(i)
        while (s2.isNotEmpty()) {
            s1.plusAssign(s2.pop())
        }
    }

    fun dequeue(): T? {
        if (s1.empty()){
            return null
        } else {
            return s1.pop()
        }
    }

    fun peek(): T?{
        if (s1.empty()){
            return null
        } else {
            return s1.peek()
        }
    }

    fun isEmpty(): Boolean{
        return s1.isEmpty()
    }

}

/*
val obj = MyQueueWithStack<Int>()
obj.push(1)
obj.push(2)
obj.push(3)

println(obj.s1.toString())

println("Dequeue: " + obj.dequeue())

println(obj.s1.toString())

println("Peek: " + obj.peek())

println(obj.s1.toString())

println("Is Queue Empty? " + obj.isEmpty())

println("Dequeue: " + obj.dequeue())
println("Dequeue: " + obj.dequeue())
println("Dequeue: " + obj.dequeue())

println("Is Queue Empty? " + obj.isEmpty())*/
