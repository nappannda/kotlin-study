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
}