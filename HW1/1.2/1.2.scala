/*

Göksenin Cakir, Homework 1

*/

object Rational {

	def gcd(a:BigInt, b:BigInt) : BigInt = {
		var x = a
		var y = b
		while(x != 0){
			var z = x
			x = y % x
			y = z
		}
		return y
	}

	class Rational(a:BigInt, b:BigInt) {
		
		require(b != 0)

		private val g = gcd(a.abs, b.abs)
		val numerator = a / g
		val denominator = b / g

		def this(n: BigInt) = this(n, 1)

		def + (that: Rational): Rational = new Rational(numerator * that.denominator +
			that.numerator * denominator, denominator * that.denominator)
		def + (i: BigInt): Rational = new Rational(numerator + i * denominator, denominator)

		def - (that: Rational): Rational = new Rational(numerator * that.denominator - 
			that.numerator * denominator, denominator * that.denominator)
		def - (i: BigInt): Rational = new Rational(numerator  - i * denominator, denominator)

		def * (that: Rational): Rational = new Rational(numerator * that. numerator, denominator * that.denominator)
		def * (i: BigInt): Rational = new Rational(numerator * i, denominator)
		
		def / (that: Rational): Rational = new Rational(numerator * that. denominator, denominator * that.numerator)
		def / (i: BigInt): Rational = new Rational(numerator, denominator * i)

		def reciprocal(): Rational = new Rational(denominator, numerator)

		def == (that: Rational): Boolean = {
			if(numerator == that.numerator && denominator == that.denominator){
				return true
			}
			else{
				return false
			}
		}

		override def toString(): String = numerator + "/" + denominator

	}
	def main(arg: Array[String]) = {
		var y = BigInt("1033314796")
		var x = BigInt("400")
		var r1 = new Rational(x, y)
		var r2 = new Rational(2, 7)
		println(r1+r2)
		println(r1-r2)
		println(r1*r2)
		println(r1/r2)
		println(r1+1)
		println(r1-2)
		println(r1*3)
		println(r1/4)
		println(r1.reciprocal())
		println(r2.reciprocal())
		var r3 = new Rational(BigInt("3"), BigInt("5"))
		var r4 = new Rational(BigInt("6"), BigInt("10"))
		println(r3 == r4)
		println(r3 == r2)
	}
}