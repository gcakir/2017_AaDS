def gcd(a, b):
	x = a
	y = b
	while x != 0:
		z = x
		x = y % x
		y = z
	return y

class Rational:
	def __init__ ( self, a, b ):
		if b == 0:
			raise ZeroDivisionError("Denominator of a rational may not be zero.")
		else:
			g  =  gcd ( a, b )
			self.n  =  a / g
			self.d  =  b / g

	def __add__ (self, other):
		return Rational (self.n * other.d + other.n * self.d, self.d * other.d)

	def __sub__ (self, other):
		return Rational (self.n * other.d - other.n * self.d, self.d * other.d)

	def __mul__ (self, other):
		return  Rational (self.n * other.n, self.d * other.d)

	def __div__ (self, other):
		return  Rational (self.n * other.d, self.d * other.n)

	def __str__ (self):
		return "%d/%d" % (self.n, self.d)


r1 = Rational(3, 5)
r2 = Rational(1, 10)
print(r1 + r2)
print(Rational(3, 5) + Rational(2, 10))