/**
 * Created by nappannda on 2018/02/15.
 */
class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be null"})
    }
    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g
    override fun toString(): String = "${numerator}/${denominator}"
    tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a % b)
}