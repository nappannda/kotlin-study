import java.util.concurrent.atomic.DoubleAccumulator

/**
 * Created by nappannda on 2018/02/16.
 */
fun succ(i: Int): Int = i + 1

fun main(args: Array<String>) {
    val result = succ(31)
    println(result)
}

tailrec fun sum(numbers: List<Long>, accumulator: Long = 0): Long =
    if (numbers.isEmpty()) accumulator
    else sum(numbers.drop(1), accumulator + numbers.first())