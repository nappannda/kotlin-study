import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by nappannda on 2018/02/17.
 */
fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    var functionObject = ::square
    println(functionObject(5))
}

fun firstK(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}

fun firstUpperCase(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}

fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> 1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}