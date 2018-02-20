/**
 * Created by nappannda on 2018/02/20.
 */

fun main(args: Array<String>) {
    fun square(i: Int): Int = i * i

    val a: Int? = 5
    val aInc: Int? = a?.inc()

    val aSquare = a?.let { square(it) }
}
