/*
Göksenin Cakir, Homework 1
*/

#include <iostream>
#include <gmp.h>

/*

Programs should be linked with the libgmpxx and libgmp libraries. For example:
g++ 1.1.cpp -lgmpxx -lgmp

*/

int gcd (const int a, const int b){
	int x = a, y = b;
	int z;
	while (x != 0){
		z = x; x = y % x; y = z;
	}
	return y;
}

void gcd(const mpz_t a, const mpz_t b){
	// Return value's type is void because it is not possible to return an integer type or
	// mpz_t type (which is in fact an array) with arbitrary precision library
	mpz_t x;
	mpz_t y;
	mpz_t z;
	mpz_init(x);
	mpz_init(y);
	mpz_init(z);
	mpz_set(x, a);
	mpz_set(y, b);
	while (mpz_cmp_si(x, 0) != 0){
		mpz_set(z, x); mpz_mod(x, y, x); mpz_set(y, z);
	}
	
	mpz_out_str(stdout, 10, y);
}

int main(){
	std::cout << gcd(24,10) << std::endl;
	mpz_t n1, n2, result;
	mpz_init_set_str(n1, "9666651337523200000000", 10);
	mpz_init_set_str(n2, "10333147966386144929666651337523200000000", 10);
	mpz_init(result);
	gcd(n2, n1);
	std::cout << std::endl;
	std::cout << gcd(966665, 5) << std::endl;

	return 0;
}