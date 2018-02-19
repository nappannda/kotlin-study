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

interface Foo
interface Bar

class MyClass: SuperClass(), Foo, Bar