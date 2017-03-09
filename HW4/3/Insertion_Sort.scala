object Insertion_Sort{
	def sort(lst: List[Int]): List[Int] = {
		var lst2 = lst
		for(i <- 1 until lst2.length) {
			var j = i
			while ( (j > 0) && (lst2(j) <= lst2(j-1)) ){
				var temp = lst2(j)
				lst2 = lst2.updated(j, lst2(j-1)) 
				lst2 = lst2.updated(j-1, temp)
				j = j - 1
			}
		}
		lst2
	}

	def main(args: Array[String]): Unit = {
		var l: List[Int] = List(5,2,3,1,9)
		println(l)
		l = sort(l)
		println(l)
	}
}