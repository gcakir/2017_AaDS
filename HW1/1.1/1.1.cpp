#include <iostream>
#include <gmp.h>

int gcd (const int a, const int b){
	int x = a, y = b;
	int z;
	while (x != 0){
		z = x; x = y % x; y = z;
	}
	return y;
}

/*mpz_t gcd(const mpz_t a, const mpz_t b){
	mpz_t c;
	while (a != 0){
		c = a; a = b % a; b = c;
	}
	return b;
}*/

int main(){
	std::cout << gcd(24,10) << std::endl;
	/*mpz_t n1, n2, result;
	mpz_init_set_ui(n1, 4658606688041220);
	mpz_init_set_str(n2, "10333147966386144929666651337523200000000", 10);
	mpz_out_str(stdout, 10, n2);*/
	std::cout << std::endl;

	return 0;
}