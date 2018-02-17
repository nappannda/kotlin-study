/**
 * Created by nappannda on 2018/02/17.
 */
fun main(args: Array<String>) {
    val bucket = object {
        val capacity: Int = 5

        var quantity: Int = 0

        fun fill() {
            quantity = capacity
        }

        fun drainAway() {
            quantity = 0
        }

        fun printQuantity() {
            println(quantity)
        }
    }

    bucket.printQuantity()
    bucket.fill()
    bucket.printQuantity()
    bucket.drainAway()
    bucket.printQuantity()
}