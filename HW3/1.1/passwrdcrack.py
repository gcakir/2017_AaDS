import string

ALLOWED_CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"
NUMBER_OF_CHARACTERS = len(ALLOWED_CHARACTERS)

def characterToIndex(char):
	return ALLOWED_CHARACTERS.index(char)

def indexToCharacter(index):
	if NUMBER_OF_CHARACTERS <= index:
		raise ValueError("Index out of range.")
	else:
		return ALLOWED_CHARACTERS[index]

def next(string):
	if len(string) <= 0:
		string.append(indexToCharacter(0))
	else:
		string[0] = indexToCharacter((characterToIndex(string[0]) + 1) % len(ALLOWED_CHARACTERS))
		if characterToIndex(string[0]) is 0:
			return list(string[0]) + next(string[1:])
	return string

def main():
	sequence = list()
	for x in range(1,100):
		sequence = next(sequence)
		print(sequence)
	
	print(ord("'"))
	print(chr(92))

if __name__ == "__main__":
	main()

"""
import random

def generate(n):
	passwd = ""
	for i in range(0, n):
		passwd += chr(random.randrange(33, 128))
	return passwd
	
def crack(password):
	combination = "!!!!!"
	cracked_letter = 33
	for i in range(len(combination)-1, 0, -1):
		combination[i] = chr(ord(combination[i])+1)
	# for char in cracked:
	# 	letter_change = change
	# 	ord(char)
	# for char in password:
	# 	while chr(cracked_letter) != char:
	# 		cracked_letter += 1
	# 	cracked += chr(cracked_letter)
	# 	cracked_letter = 33
	# return cracked




passwd = generate(5)
print(passwd)
print(chr(77) == "M")
print(crack(passwd))
print(ord("M"))
"""