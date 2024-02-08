package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximum: ");
		int n = scan.nextInt();
		boolean [] primes = new boolean[n];
		for (int i = 0; i<=n;i++) {
			primes [i] = true;			
		}
		for (int i = 0; i<=n; i = i +2) {
			for (int j = i; j <= n; j = j + i) {
				if (i / j == 0) {
					primes[i] = false;
				}
			}

		}

	}

}
