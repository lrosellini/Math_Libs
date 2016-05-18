package math;

import java.lang.Math;

public class Math_Libs {

	public int distanceForm(int x1, int y1, int x2, int y2) {
		return (x2 - x1) + (y2 - y1);
	}

	public static int midpointForm(int x, int y) {
		return x - y;
	}

	// Adds numbers...
	public static double addition(double... a) {
		double accum = 0;
		for (int i = 0; i < a.length; i++) {
			accum += a[i];
		}
		return accum;
	}

	// Subtracts numbers...
	public static double subtraction(double... a) {
		double accum = 0;
		for (int i = 0; i < a.length; i++) {
			accum -= a[i];
		}
		return accum;
	}

	// Multiplies numbers...
	public static double multiplication(double... a) {
		double accum = 0;
		for (int i = 0; i < a.length; i++) {
			accum *= a[i];
		}
		return accum;
	}

	public static double division(double... a) {
		double accum = 0;
		for (int i = 0; i < a.length; i++) {
			accum /= a[i];
		}
		return accum;
	}

	public static int power(int a, int p) {
		return a ^ p;
	}

	public static double zero(double a) {
		return a * 0;
	}

	public static interface Function<I, O> {
		public O exec(I i);
	}

	// Sigma Function
	public static double sigmaCalculation(int start, int end, Function<Integer, Double> func) {
		double sum = 0;

		for (int i = start; i <= end; i++) {
			sum += func.exec(i);
		}
		return sum;
	}

	public static int factorial(int a) {
		int m = 1;
		for (int i = 2; i <= a; i++) {
			m *= i;
		}
		return m;
	}

	public static double[] quadraticForm(double[] v, double a, double b, double c) {
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
		UnsupportedOperationException ex = new UnsupportedOperationException(
				"Error: java.lang.UnsupportedOperationException");
		if (discriminant < 0) {
			throw ex;
		} else {
			double[] vertex = new double[2];
			vertex[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
			vertex[1] = (-b - (discriminant)) / (2 * a);

			return vertex;
		}
	}

	public static double objPerimeter(double sides, int num) {
		return sides * num;
	}

	public static double objArea(double apothem, double perimeter) {

		return (apothem * perimeter) / 2;

	}

	public static double objApothem(double sides, double num) {

		return sides / (2 * Math.tan(180 / num));
	}

	public static double root(double n, double radicand) {
		return Math.pow(Math.E, Math.log(radicand) / n);
	}

}