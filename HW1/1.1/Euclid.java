/*
Göksenin Cakir, Homework 1
*/

import java.math.BigInteger;

public class Euclid {
	public static BigInteger gcd(BigInteger a, BigInteger b) {
		BigInteger x = a;
		BigInteger y = b;
		BigInteger z;
		while(!(x.equals (new BigInteger("0")))){
			z = x;
			x = y.mod(x);
			y = z;
		}
		return y;
	}
	public static void main(String[] args) {
		BigInteger n1 = new BigInteger("10");
		BigInteger n2 = new BigInteger("15");
		BigInteger result = gcd(n2, n1);
		System.out.println(result.toString());
		
		//System.out.println(n1.equals(new BigInteger("105")));
		//n2 = n2.mod(n1);
		//System.out.println(n2);
		
	}
}