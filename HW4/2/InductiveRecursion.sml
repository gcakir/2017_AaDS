(*
Göksenin Cakir
Homework #4
*)

datatype intlist = Nil | Cons of (int * intlist)

fun concat(list1: intlist, list2: intlist): intlist = 
	case list1 of Nil => list2
	| Cons(i, tl) => Cons(i, concat(tl, list2))

fun reverse(lst: intlist): intlist = 
	case lst of Nil => Nil
	| Cons(hd,tl) => concat(reverse(tl), Cons(hd, Nil)) 

fun toString(lst: intlist): string = 
	case lst of Nil => ""
	| Cons(i: int, Nil) => Int.toString(i)
	| Cons(i: int, Cons(j:int, rest: intlist)) => Int.toString(i) ^ "," ^ toString(Cons(j, rest))

val l1:intlist = Cons(1,Cons(2,Cons(3,Cons(4,Cons(5,Nil)))))
val l2:intlist = Cons(6,Nil)
val l1 = concat(l1, l2)
val result = toString(l1)