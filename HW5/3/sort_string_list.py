import random

def isGreater(arg1, arg2):
	# comparision function for words
	# returns true if arg1 comes lexicogrpahically later than arg2
	w1 = arg1.lower()
	w2 = arg2.lower()
	if len(w1) >= len(w2):
		it_length = len(w2)
	else:
		it_length = len(w1)

	for i in range(0, it_length):
		if w1[i] < w2[i]:
			return False
		elif w1[i] > w2[i]:
			return True
	return (len(w1) > len(w2))


def insertion_sort(A, n):
	for i in range(1, n):
		# print(A)
		key = A[i]
		j = i - 1
		while j >= 0 and isGreater(A[j], key):
			A[j + 1] = A[j]
			j = j - 1
		A[j + 1] = key
	return A


l1 = ['Some', 'reports', 'suggest', 'the', 'Titanic', 'might',
 'disappear', 'within', 'years', 'because', 'of', 'the', 'action', 'of', 'microbes',
  'yet', 'elsewhere', 'bacteria', 'can', 'help', 'protect', 'shipwrecks', 'from',
   'decay']
l2 = ['You', 'probably', 'will', 'not', 'get', 'to', 'the', 'end', 'of', 'this',
 'article', 'Everyone', 'knows', 'our', 'attention', 'spans', 'are', 'getting', 'shorter',
 'just', 'obvious', 'Or', 'is', 'it']
l3 = ['art', 'article', 'everyone', 'every']

print(insertion_sort(l1, len(l1)))
print(insertion_sort(l2, len(l2)))
print(insertion_sort(l3, len(l3)))
