import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by nappannda on 2018/02/17.
 */
fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    var functionObject = ::square
    println(functionObject(5))

    val counter1 = getCounter()
    val counter2 = getCounter()
    println(counter1())
    println(counter1())
    println(counter2())
    println(counter1())
    println(counter2())

    log { "このメッセージは出力される" }
    log(false) { "このメッセージは出力されない" }

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

fun firstWhitespace(str: String): Int =
    first(str) { it.isWhitespace() }

fun getCounter(): ()->Int {
    var count = 0
    return {
        count++
    }
}

inline fun log(debug: Boolean = true, message: () -> String) {
    if (debug) {
        println(message())
    }
}

inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

fun containsDigit(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach
        }
    }
    return result
}

val square1: (Int) -> Int = { i: Int ->
    i * i
}

val square2: (Int) -> Int = fun(i: Int): Int {
    return i * i
}

val square3: (Int) -> Int = fun(i: Int) = i * i