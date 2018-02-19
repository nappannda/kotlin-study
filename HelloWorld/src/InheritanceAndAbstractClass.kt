/**
 * Created by nappannda on 2018/02/19.
 */
open class Person(open val name: String) {
    open fun introduceMyself() {
        println("I am ${name}")
    }
}

class Student(override val name: String, val id: Long): Person(name) {
    override fun introduceMyself() {
        println("I am $name(id=$id)")
    }
}

fun main(args: Array<String>) {
    val student: Student = Student("くみこ", 123)
    student.introduceMyself()

    EnglishGreeter("Kotlin").sayHello()
    JapaneseGreeter("Java").sayHello()
}

abstract class Greeter(val target: String) {
    abstract fun sayHello()
}

class EnglishGreeter(target: String) : Greeter(target) {
    override fun sayHello() {
        println("Hello, $target")
    }
}

class JapaneseGreeter(target: String) : Greeter(target) {
    override fun sayHello() {
        println("こんにちは、$target")
    }
}
