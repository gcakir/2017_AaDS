object gcd {
	
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
	def main(arg: Array[String]) = {
		println("Hello,World!")
		var x = BigInt("4000000000000000000000008060809060080")
		var y = BigInt(40)
		println(x + y)
		println(gcd(8, 10))
		println(gcd(8, 12))
		println(gcd(30, 10))

		println(gcd(BigInt("4000000000000000000000008060809060080"), 6000000))
	}
}