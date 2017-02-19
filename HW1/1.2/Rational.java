/*
Göksenin Cakir, Homework 1
*/

import java.math.BigInteger;

public class Rational {
	private BigInteger num;
	private BigInteger den;

	public Rational(BigInteger numerator, BigInteger denominator) {
		if (denominator.equals(0)) {
			throw new RuntimeException("Denominator of a rational may not be zero.");
		}
		BigInteger g = gcd(numerator, denominator);
		num = numerator.divide(g);
		den = denominator.divide(g);
	}

	public String toString() {
		if (den.equals(1)){
			return num.toString() + "";
		}
		else{
			return num.toString() + "/" + den.toString();
		}
	}

	public Rational times(Rational b) {
		return new Rational(this.num.multiply(b.num), this.den.multiply(b.den));
	}

	public Rational plus(Rational b) {
		BigInteger numerator   = this.num.multiply(b.den).add(this.den.multiply(b.num));
		BigInteger denominator = this.den.multiply(b.den);
		return new Rational(numerator, denominator);
	}

	public Rational minus(Rational b) {
		BigInteger numerator   = this.num.multiply(b.den).add(this.den.multiply(b.num).multiply(new BigInteger("-1")));
		BigInteger denominator = this.den.multiply(b.den);
		return new Rational(numerator, denominator);
	}

	public Rational divides(Rational b) {
		return this.times(b.reciprocal());
	}

	public Rational reciprocal() { return new Rational(den, num); }

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

		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("16");
		BigInteger n3 = new BigInteger("1");
		BigInteger n4 = new BigInteger("3");
		Rational r1 = new Rational(n1, n2);
		Rational r2 = new Rational(n3, n4);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.plus(r2));
		System.out.println(r2.minus(r1));
		System.out.println(r1.times(r2));
		System.out.println(r1.divides(r2));
		System.out.println(r1.reciprocal());
		
	}
}