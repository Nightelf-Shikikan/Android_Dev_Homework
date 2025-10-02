
 class Node<T>(var value: T) {
    var link: Node<T>? = null
}

class LinkedList<T : Comparable<T>> {
    var head: Node<T>? = null
    var size = 0


    fun addFirst(value: T) {
        val newNode = Node<T>(value)
        newNode.link = head  // new node points to current headso the object i
        head = newNode       // update head to new node
        size++

    }

    fun addLast(value: T) {
        val newNode = Node<T>(value)
        if (head == null) {
            head = newNode  // list is empty
        } else {
            var current = head
            while (current?.link != null) {
                current = current.link
            }
            current?.link = newNode
        }
        size++
    }

    fun printList() {
        var current = head
        while (current != null) {
            print("${current.value} -> ")
            current = current.link
        }
        println("null")
    }

    fun sortList() {
        // Step 1: Collect all values
        val values = mutableListOf<T>()
        var current = head
        while (current != null) {
            values.add(current.value)
            current = current.link
        }

        // Step 2: Sort values
        values.sort()

        // Step 3: Rebuild the linked list
        head = null
        size = 0
        for (value in values) {
            addLast(value)
        }
    }



    fun mergeSorted(other: LinkedList<T>): LinkedList<T> {
        val merged = LinkedList<T>()  // new list for result

        var current1 = this.head
        var current2 = other.head

        // Step 1: Compare and add nodes one by one
        while (current1 != null && current2 != null) {
            if (current1.value <= current2.value) {
                merged.addLast(current1.value)
                current1 = current1.link
            } else {
                merged.addLast(current2.value)
                current2 = current2.link
            }
        }

        // Step 2: Add remaining nodes (if any)
        while (current1 != null) {
            merged.addLast(current1.value)
            current1 = current1.link
        }

        while (current2 != null) {
            merged.addLast(current2.value)
            current2 = current2.link
        }

        return merged
    }

    fun printCircularList() {
        val start = head ?: return
        var current: Node<T>? = start
        var count = 0
        print("List: ")

        do {
            print("${current?.value} -> ")
            current = current?.link
            count++
            if (count > size + 2) { // safety stop
                print("... (loop broken?)")
                break
            }
        } while (current != start)

        println("(back to head ${start.value})")
    }

}

