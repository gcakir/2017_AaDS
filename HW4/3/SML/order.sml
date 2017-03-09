datatype 'a TotOrder = TotOrder of ('a * 'a) -> bool
fun lessOrEqual (ord: 'a TotOrder): 'a * 'a -> bool = case ord of TotOrder (f) => f

val IntSmaller: int TotOrder = TotOrder (fn (x, y) => x <= y)
fun sort (ord: 'a TotOrder, x: 'a list) = x
fun test() = sort (IntSmaller, [3, 5, 4])