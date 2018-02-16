/**
 * Created by nappannda on 2018/02/17.
 */
fun square(i: Int): Int = i * i

fun main(args: Array<String>) {
    var functionObject = ::square
    println(functionObject(5))
}