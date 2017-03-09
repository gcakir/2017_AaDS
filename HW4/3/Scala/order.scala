abstract class TotOrd[A] {
	def lessOrEqual(x: A, y: A): Boolean
	def isDivisible(x: Int, y: Int): Boolean
}

object IntSmaller extends TotOrd[Int] {
	def lessOrEqual(x: Int, y: Int): Boolean = x <= y
	def isDivisible(x: Int, y: Int): Boolean = (x % y) == 0
}

object Divisible extends TotOrd[Int] {
	def lessOrEqual(x: Int, y: Int): Boolean = x <= y
	def isDivisible(x: Int, y: Int): Boolean = (x % y) == 0
}

object Lexicographic extends TotOrd[String]{
	def lessOrEqual(x: String, y: String): Boolean = x.length() <= y.length()
	def isDivisible(x: Int, y: Int): Boolean = (x % y) == 0
}

object Sort{
	def sort[A <% Int](ord: TotOrd[A], x: List[A]): List[A] = {
		var lst = x
		for(i <- 1 until lst.length) {
			var j = i
			while ( (j > 0) && (lst(j) <= lst(j-1)) ){
				var temp = lst(j)
				lst = lst.updated(j, lst(j-1)) 
				lst = lst.updated(j-1, temp)
				j = j - 1
			}
		}
		lst
	}

	def isSorted[A <% Int](ord: TotOrd[A], lst: List[A]): Boolean = {
		var result: Boolean = false
		if(lst == Nil){
			result
		}else{
			result = true
			var len: Integer = lst.length
			var j: Integer = 1
			while (j < len){
				if( (lst(j-1) > lst(j)) ){
					result = false
				}
				j = j + 1
			}
			result
		}
		
	}
}

object Test {
	def main(args: Array[String]) {
		var l = List(4,3,5)
		l = Sort.sort[Int](IntSmaller, l)
		println(l)
		println(Sort.isSorted[Int](IntSmaller, l))
		println(Sort.isSorted[Int](IntSmaller, List(4,3,5)))
		println(Sort.isSorted[Int](IntSmaller, List()))
	}
}
