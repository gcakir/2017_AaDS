/*
Göksenin Cakir, Homework 3
*/

object processString {
	def fastConcat(s: String, n: Integer) : String = {
		var i: Integer = 1
		var str: String = s 
		for(i <- 1 to n) {
			str = str.concat("a")
		}
		return str
	}
	def processString(s: String) {
		var rest: String = s
		while(rest != ""){
			if(rest.startsWith("foo")){
				//
			}else{
				//
			}
			rest = rest.substring(1)
		}
	}
	def main(arg: Array[String]) = {
		var str: String = "a"
		val multiplier: Integer = 1000
		val i: Integer = 1
		println(str)
		for(i <- 1 to 25) {
			val t0 = System.nanoTime()
			processString(str)
			val t1 = System.nanoTime()
			println("(" + i + ", " + (t1 - t0) / 100000000 + ")")
			str = fastConcat(str, i * multiplier)
		}
	}
}