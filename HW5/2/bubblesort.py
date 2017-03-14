import random

def bubblesort(A):
	swapped = False
	while not swapped:
		swapped = True
		for i in range(0, len(A)-1):
			if not (A[i] <= A[i+1]):
				swapped = False
				temp = A[i]
				A[i] = A[i+1]
				A[i+1] = temp
			print(A)
			# if A[i-1] > A[i]:
			# 	swapped = False
			# 	temp = A[i]
			# 	A[i] = A[i-1]
			# 	A[i-1] = temp
			# print(A)
		print(A)
	# return A


list10 = []
for i in range(10):
	list10.append(random.randrange(1, 100))

print("\nThe first print\n")
print(list10)
print("\n")
bubblesort(list10)
print("\nThe last print\n")
print(list10)


"""

# The bubblesort algorithm below is implemented according to Cormen's book.
# It is slightly different than the one in Professor Rabe's notes.

def bubblesort(A):
	for i in range(len(A)-2):
		for j in range(len(A)-1, i, -1):
			if A[j] < A[j-1]:
				temp = A[j]
				A[j] = A[j-1]
				A[j-1] = temp
			print(A)
	#return A

list10 = []
for i in range(10):
	list10.append(random.randrange(1, 100))

print(list10)
bubblesort(list10)
print("\nThe last print\n")
print(list10)

# for i in range(len(list10), 0, -1):
# 	print(i)

"""