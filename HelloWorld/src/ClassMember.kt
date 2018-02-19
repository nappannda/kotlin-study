///**
// * Created by nappannda on 2018/02/18.
// */
//class MyClass {
//    lateinit var foo: String
//}
//
//fun main(args: Array<String>) {
//    val myClass: MyClass = MyClass()
//    println(myClass)
//
//    val greeter = Greeter()
//    greeter.greet("Kotlin")
//
//    val hanako = Person()
//
//    println(hanako.name)
//    println(hanako.age)
//
//    hanako.name = "はなこ"
//    hanako.age = 25
//
//    println(hanako.name)
//    println(hanako.age)
//    println(hanako.nameLength)
//
//    val half = Rational(1, 2)
//    println(half.numerator)
//    println(half.denominator)
//
//    println("I like Kotlin".wordsCount)
//}
//
//class Greeter {
//    fun greet(name: String) {
//        println("Hello, $name!")
//    }
//}
//
//class Person {
//    var name: String = ""
//        set(value) {
//            println("${value}がセットされました。")
//            field = value
//        }
//    var age: Int = 0
//    val nameLength: Int
//        get(): Int {
//            return this.name.length
//        }
//}
//
//fun String.countWords(): Int =
//        this.split("""\s+""".toRegex()).size
//
//val String.wordsCount: Int
//    get() = split("""\s+""".toRegex()).size