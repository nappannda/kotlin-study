/**
 * Created by nappannda on 2018/02/19.
 */
class Container<T>(var value: T)

fun <T> box(value: T): Container<T> = Container(value)

val<T> T.string: String
    get() = toString()