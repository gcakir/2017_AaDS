import random

def createList(n):
	lst = list()
	for i in range(1, n):
		lst.append(i)
	return lst

def binary_search(A, n, x):
	p = 0;
	r = n
	while p <= r:
		q = int((p+r)/2)
		# print(A[p:r+1])
		if A[q] == x:
			return q
		elif A[q] != x and A[q] > x:
			r = q - 1
		elif A[q] != x and A[q] < x:
			p = q + 1
	return -1

list_size = 100
lst = createList(list_size)
random_number = random.randrange(1, n)
print(binary_search(lst, len(lst), random_number))

