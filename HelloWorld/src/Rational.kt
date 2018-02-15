/**
 * Created by nappannda on 2018/02/15.
 */
class Rational(val numerator: Int, val denominator: Int) {
    init {
        require(denominator != 0, {"denominator must not be null"})
    }
    override fun toString(): String = "${numerator}/${denominator}"
}