##################################
### Göksenin Cakir, Homework 1 ###
##################################

def gcd(a, b):
	x = a
	y = b
	while x != 0:
		z = x
		x = y % x
		y = z
	return y



#print(gcd(4000000000000000000000008060809060080, 6000000))
#35! = 10333147966386144929666651337523200000000
print(gcd(10333147966386144929666651337523200000000, 9666651337523200000000))
print(gcd(8, 4))
print(gcd(64, 28))