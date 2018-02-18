/**
 * Created by nappannda on 2018/02/18.
 */
class MyClass

fun main(args: Array<String>) {
    val myClass: MyClass = MyClass()
    println(myClass)

    val greeter = Greeter()
    greeter.greet("Kotlin")
}

class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}