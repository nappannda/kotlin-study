/**
 * Created by nappannda on 2018/02/19.
 */
interface Greeter {
    val language: String
    fun sayHello(target: String)
}

class EnglishGreeter : Greeter {
    override val language = "English"
    override fun sayHello(target: String) {
        println("Hello, $target!")
    }
}

open class SuperClass

interface Foo {
    fun execute()
}
interface Bar {
    fun execute()
}

class FooBar : Foo, Bar {
    override fun execute() {
        println("FooBar")
    }
}

open class Superclass {
    open fun execute() {
        println("Superclass")
    }
}

class FooSubclass : Superclass(), Foo

interface Hoge {
    fun execute() {
        println("Hoge")
    }
}

interface Fuga {
    fun execute() {
        println("Fuga")
    }
}

class HogeFuga : Hoge, Fuga {
    override fun execute() {
        super<Hoge>.execute()
    }
}