import random

def quicksort(A):
	p = partition(A, 0, len(A)-1)

def partition(A, first, last):
	if first >= last:
		return None
	else:
		pivot = A[last]
		pivotPos = first
	for i in range(first, last):
		if A[i] <= pivot:
			temp = A[i]
			A[i] = A[pivotPos]
			A[pivotPos] = temp
			pivotPos += 1
	temp = A[pivotPos]
	A[pivotPos] = A[last]
	A[last] = temp

	partition(A, first, pivotPos-1)
	partition(A, pivotPos+1, last)

list10 = []
for i in range(10):
	list10.append(random.randrange(1, 100))

print("\nThe first print\n")
print(list10)
print("\n")
quicksort(list10)
print("\nThe last print\n")
print(list10)