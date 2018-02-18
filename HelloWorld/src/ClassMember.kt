/**
 * Created by nappannda on 2018/02/18.
 */
class MyClass {
    lateinit var foo: String
}

fun main(args: Array<String>) {
    val myClass: MyClass = MyClass()
    println(myClass)

    val greeter = Greeter()
    greeter.greet("Kotlin")

    val hanako = Person()

    println(hanako.name)
    println(hanako.age)

    hanako.name = "はなこ"
    hanako.age = 25

    println(hanako.name)
    println(hanako.age)
    println(hanako.nameLength)
}

class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}

class Person {
    var name: String = ""
        set(value) {
            println("${value}がセットされました。")
            field = value
        }
    var age: Int = 0
    val nameLength: Int
        get(): Int {
            return this.name.length
        }
}