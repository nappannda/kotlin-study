import java.util.concurrent.atomic.DoubleAccumulator

/**
 * Created by nappannda on 2018/02/16.
 */
fun succ(i: Int): Int = i + 1

fun main(args: Array<String>) {
    val result = succ(31)
    println(result)
}

fun sum(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long): Long =
        if (numbers.isEmpty()) accumulator
        else go(numbers.drop(1), accumulator + numbers.first())
    return go(numbers, 0)
}

class Counter {
    private var cnt = 0

    fun countUp(): Unit {
        cnt++
        return Unit
    }

    fun getCount(): Int = cnt
}