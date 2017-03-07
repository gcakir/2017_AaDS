object List {

	def toList[A](a: A): List[A] = a::Nil
	def append[A](lst: List[A], a: A): List[A] = lst :+ a
	def concat[A](lst1: List[A], lst2: List[A]): List[A] = lst1:::lst2
	def reverse[A](lst: List[A]): List[A] = {
	    def rlRec[A](result : List[A], lst : List[A]) : List[A] = {
			lst match {
				case Nil => result
				case (x :: xs) => { rlRec(x :: result, xs) }
			}
		}
		rlRec(Nil, lst)
	}

	def main(args: Array[String]): Unit = {
		// var l: List[Int] = toList(1)
		var l = List(1)
		println(l)
		l = append(l, 2)
		println(l)
		var m = List(3)
		var n = concat(l, m)
		println(n)
		n = reverse(n)
		println(n)
	}
}