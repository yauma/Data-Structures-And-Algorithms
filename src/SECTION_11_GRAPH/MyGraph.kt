package SECTION_11_GRAPH

/**
 * Created by jaimequeraltgarrigos on 1/25/20.
 */
class MyGraph constructor(var numberOfNodes: Int = 0,
                          var listOfEdges: MutableMap<Int, Edge> = mutableMapOf<Int, Edge>()) {
    fun addVertex(value: Int) {
        if (!listOfEdges.containsKey(value)) {
            listOfEdges.put(value, Edge())
            numberOfNodes++
        }
    }

    fun addEdges(array: Array<Int>) {
        var key = array[0]
        if (listOfEdges.containsKey(key)) {
            val edge = Edge()
            for (i in 1..array.size - 1) {
                edge.listOfConnections.add(array[i])
            }
            listOfEdges.replace(key,edge)
        }
    }
}

class Edge(var listOfConnections: MutableList<Int> = mutableListOf<Int>())

/*
var myGraph = MyGraph()

myGraph.addVertex(0)
myGraph.addVertex(1)
myGraph.addVertex(2)
myGraph.addVertex(3)
myGraph.addVertex(4)
myGraph.addVertex(5)
myGraph.addVertex(6)

myGraph.addEdges(arrayOf(0,1,2))
myGraph.addEdges(arrayOf(1,0,2,3))
myGraph.addEdges(arrayOf(2,0,1,4))
myGraph.addEdges(arrayOf(3,1,4))
myGraph.addEdges(arrayOf(4,2,3,5))
myGraph.addEdges(arrayOf(4,4,6))
myGraph.addEdges(arrayOf(6,5))*/
