import kotlin.concurrent.thread
import java.util.concurrent.atomic.AtomicInteger


class Counter() {
    var count = 0
    fun inc(lock: Any) {
        synchronized(lock) {
            count++
        }
    }

    fun dec(lock: Any) {
        synchronized(lock) {
            count--
        }
    }
}


fun Task01() {
    println("Task 01 two threads with external obj")
    val counter01 = Counter()
    val lock1 = Any()

    val t1 = thread {
        for (i in 1..10) {
            counter01.inc(lock1)
            println("Thread 01 count up: ${counter01.count}")
            Thread.sleep(200)
        }
    }

    val t2 = thread {
        for (i in 1..15) {
            counter01.dec(lock1)
            println("Thread 02 count down: ${counter01.count}")
            Thread.sleep(300)
        }
    }
    t1.join()
    t2.join()
    println("Final count = ${counter01.count}")
}

fun Task02() {
    println("Task 02 atomic process")
    val counter = AtomicInteger(0)
    val t1 = thread {
        repeat(10) {
            val newValue = counter.incrementAndGet()
            println("Thread 1: $newValue")
            Thread.sleep(100)
        }

    }

    val t2 = thread {

        repeat(10) {
            val newValue = counter.incrementAndGet()
            println("Thread 2: $newValue")
            Thread.sleep(100)

        }
    }
    t1.join()
    t2.join()

    println("Final count = ${counter.get()}")
}

fun Task03() {
    println("Task 03 sync two threads ")
    val counter = Counter()
    val lock = Any()

    val t1 = Thread {
        for (i in 1..1000)
            counter.inc(lock)
        println("Thread 01 : ${counter.count}")
        Thread.sleep(1000)

    }
    val t2 = Thread {
        for (i in 1..1000)
            counter.dec(lock)
        println("Thread 02: ${counter.count}")
        Thread.sleep(1000)


    }

    println("final counter: ${counter.count}")

}


fun main() {
    Task01()
    Task02()
    Task03()
}


