import random

def createList(n, random_range):
	lst = list()
	for i in range(1, n):
		lst.append(random.randrange(1, random_range))
	return lst

def find_smallest(lst):
	if len(lst) == 0:
		return None
	else:
		smallest = lst[0]
		for element in lst:
			if element < smallest:
				smallest = element
		return smallest

n = 10
max_value = 100
lst = createList(n, max_value)
print(lst)
print(find_smallest(lst))